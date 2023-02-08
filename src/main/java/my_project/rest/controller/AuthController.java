package my_project.rest.controller;

import com.google.gson.Gson;
import my_project.rest.entities.Auth;
import okhttp3.*;

import java.io.IOException;

public class AuthController {
    public Auth signIn(Auth auth) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(auth), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/auth/signin")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        Auth authResp = gson.fromJson(response.body().string(), Auth.class);
        auth.setToken(authResp.getToken());
        return auth;
    }

}
