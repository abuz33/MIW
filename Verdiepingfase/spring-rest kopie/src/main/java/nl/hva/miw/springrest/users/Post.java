package nl.hva.miw.springrest.users;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post {

    private String title;
    private String body;

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
