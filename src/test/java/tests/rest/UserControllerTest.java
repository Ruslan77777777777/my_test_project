package tests.rest;

import my_project.rest.controller.UserController;
import my_project.rest.entities.User;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserControllerTest extends BaseApiTest {
    @Test
    public void postUserUpdate() throws IOException {
        UserController userController = new UserController();
        User user = new User();
        user.setId("30");
        user.setName("test");
        user.setUsername("name_test");
        user.setLastname("lastname_test");
        Response response = userController.postUser(auth, user);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test
    public void getUserList() throws IOException {
        UserController userController = new UserController();
        Response response = userController.listUsers(auth);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test
    public void getId() throws IOException {
        UserController userController = new UserController();
        Response response = userController.getUser(auth, 20);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
}
