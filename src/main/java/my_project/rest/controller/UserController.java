package my_project.rest.controller;

import com.google.gson.Gson;
import my_project.rest.entities.Auth;
import my_project.rest.entities.User;
import okhttp3.*;

import java.io.IOException;

public class UserController {

    public Response postUser(Auth auth, User user) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(user), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/user/update")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());

        return response;
    }

    public Response listUsers(Auth auth) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/user/")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());

        return response;
    }

    public Response getUser(Auth auth, int id) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/user/" +id)
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
        return response;
    }
}
