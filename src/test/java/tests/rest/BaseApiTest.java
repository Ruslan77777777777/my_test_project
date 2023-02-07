package tests.rest;

import my_project.rest.controller.AuthController;
import my_project.rest.entities.Auth;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseApiTest {
    private static String login = "Test";
    private static String pass = "12345678";
    Auth auth;

    @BeforeMethod
    void setup() throws IOException {
        Auth auth = new Auth(login, pass);
        AuthController authController = new AuthController();
        this.auth = authController.signIn(auth);
    }
}
