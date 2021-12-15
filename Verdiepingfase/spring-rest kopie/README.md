### Voorbeelden project voor Webapplications les 8: REST

#### Aanpak
Start met UserResource: uitleg VERBS en specificatie
laat met cUrl verschillende acties zien en dat op basis Accept header
een gewenst representatie opgehaald kan worden indien mogelijk.
Indien een gewenste representatie niet mogelijk is, 
krijgt men een 406

## Verbs
Leg onderstaande verbs uit: zie UserResource bij methods voor specicatie
* GET
* POST
* PUT
* DELETE
* HEAD
* OPTIONS 

### UserRepository
Uitwerking is een repository simulatie om DB overhead te vermijden


## Status codes behandelen
* 200 OK
* 201 CREATED, zie location header voor URI gecreeerde resource
* 204 NO CONTENT

* 301 Moved Permanently, zie location header
* 302 Found, tijdelijk: zie location header

* 400 Bad Request
* 401 Unauthorized: zie WWW-Authenticate header voor info om correct te authenticeren
* 403 Forbidden (Unauthorized)

* 500 Internal Server Error

## Headers behandelen
* Accept
* Content-Type
* Location
* Authorization
* Cookie

# Authenticatie
## Authorization header
Scheme:
* Basic
* Bearer

```
Authorization: Basic user:pass
Authorization: Bearer token
```

## Credentials in body

```
{
    "username": "user_x",
    "password": "geheim"
}
```

behandel kort: Base64 encoding, decoding
Kan men zelf opzoeken

### token based

#### JWT

zie: [jwt.io](https://jwt.io/)

```
header.payload.signature
{
  "alg": "HS256",
  "typ": "JWT"
}
{
  "sub": "1234567890",
  "name": "John Doe",
  "iat": 1516239022
}

// signeren
secret = generate secure secret: bv 256 bit -> base64 encode deze
HMACSHA256(base64UrlEncode(header) + "." + base64UrlEncode(payload), secret)

```

#### OAUTH2


## REST en commucatie ander services
Start een python
