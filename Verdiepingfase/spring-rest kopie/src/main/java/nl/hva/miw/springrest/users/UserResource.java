package nl.hva.miw.springrest.users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/*
 * HTTP Verbs -> specificatie: https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html
 */
@RestController
@RequestMapping(value = "/users")
class UserResource {

    // read URI from application properties
    @Value("${posts.url}")
    private String postUrl;

    private UserRepository userRepository;

    UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    List<User> list() {
        return userRepository.list();
    }

    /*
     * GET: idempotent
     * The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI.
     * If the Request-URI refers to a data-producing process,
     * it is the produced data which shall be returned as the entity in the response
     * and not the source text of the process, unless that text happens to be the output of the process.
     */
    @GetMapping(value = "/{id}")
    User getUserById(@PathVariable("id") long id) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!");
        }
    }

    /*
     * POST: NIET idempotent!
     * The POST method is used to request that the origin server accept the entity enclosed in the request
     * as a new subordinate of the resource identified by the Request-URI in the Request-Line.
     * The actual function performed by the POST method is determined by the server and is usually dependent on the Request-URI.
     * The posted entity is subordinate to that URI in the same way that a file is subordinate to a directory containing it,
     * a news article is subordinate to a newsgroup to which it is posted, or a record is subordinate to a database.
     * The action performed by the POST method might not result in a resource that can be identified by a URI.
     * In this case, either 200 (OK) or 204 (No Content) is the appropriate response status,
     * depending on whether or not the response includes an entity that describes the result.
     * If a resource has been created on the origin server, the response SHOULD be 201 (Created)
     * and contain an entity which describes the status of the request and refers to the new resource, and a Location header (see section 14.30).
     * Responses to this method are not cacheable,
     * unless the response includes appropriate Cache-Control or Expires header fields. However,
     * the 303 (See Other) response can be used to direct the user agent to retrieve a cacheable resource.
     */
    @PostMapping
    ResponseEntity<?> createUser(@RequestBody User user) {
        userRepository.create(user);
        URI uri = URI.create(String.format("http://localhost:9999/users/%d", user.getId()));

        return ResponseEntity.created(uri)
                .body(user);
    }

    /*
     * PUT: idempotent
     * The PUT method requests that the enclosed entity be stored under the supplied Request-URI.
     * If the Request-URI refers to an already existing resource, the enclosed entity SHOULD be considered as
     * a modified version of the one residing on the origin server.
     * If the Request-URI does not point to an existing resource,
     * and that URI is capable of being defined as a new resource by the requesting user agent,
     * the origin server can create the resource with that URI. If a new resource is created,
     * the origin server MUST inform the user agent via the 201 (Created) response.
     * If an existing resource is modified, either the 200 (OK) or 204 (No Content)
     * response codes SHOULD be sent to indicate successful completion of the request.
     * If the resource could not be created or modified with the Request-URI,
     * an appropriate error response SHOULD be given that reflects the nature of the problem
     */

    // IMPLEMENTEER HIER DE FUNCTIONALITEIT VAN EEN PUT REQUEST
    // Zie andere methodes voor de passende annotaties en functionaliteiten
    // Zorg dat de implementatie past bij gegeven specifiatie

    /*
     * DELETE: idempotent
     * The DELETE method requests that the origin server delete the resource identified by the Request-URI.
     * This method MAY be overridden by human intervention (or other means) on the origin server.
     * The client cannot be guaranteed that the operation has been carried out,
     * even if the status code returned from the origin server indicates that the action has been completed successfully.
     * However, the server SHOULD NOT indicate success unless, at the time the response is given,
     * it intends to delete the resource or move it to an inaccessible location.
     *
     * successful response SHOULD be:
     *  - 200 (OK) if the response includes an entity describing the status,
     *  - 202 (Accepted) if the action has not yet been enacted
     *  - 204 (No Content) if the action has been enacted but the response does not include an entity.
     * If the request passes through a cache and the Request-URI identifies one or more currently cached entities,
     * those entries SHOULD be treated as stale. Responses to this method are not cacheable.
     */
    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) {
            userRepository.delete(opt.get());
            return ResponseEntity
                    .ok()
                    .build();
        } else {
            return ResponseEntity
                    .notFound()
                    .build();
        }
    }

    // fetch from other service
    // microservice example
    @GetMapping(value = "/{id}/posts")
    Post[] getUserPosts(@PathVariable("id") long id) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) {
            RestTemplate restTemplate = new RestTemplate();
            String url = String.format("%s/%d",postUrl, id);

            ResponseEntity<Post[]> responseEntity = restTemplate.getForEntity(url, Post[].class);

            if(responseEntity.getStatusCode() ==  HttpStatus.OK){
                return responseEntity.getBody();
            } else {
                throw new ResponseStatusException(responseEntity.getStatusCode());
            }

        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!");
        }
    }
}
