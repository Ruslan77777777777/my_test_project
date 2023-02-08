package my_project.rest.entities;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;


@Data
public class Auth {
    private String username;
    private String password;
    private String token;

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }
}