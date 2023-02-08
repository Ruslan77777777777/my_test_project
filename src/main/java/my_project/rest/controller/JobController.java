package my_project.rest.controller;

import com.google.gson.Gson;
import my_project.rest.entities.Auth;
import my_project.rest.entities.Job;
import okhttp3.*;

import java.io.IOException;

public class JobController {


    public Job createJob(Auth auth, Job job) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(job), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/job/create")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        Job jobResp = gson.fromJson(response.body().string(), Job.class);
        System.out.println(jobResp);
        String jobId = jobResp.getId();
        return jobResp;

    }

    public Response deleteJob(Auth auth, String jobId) throws IOException {
        Gson gson = new Gson();
        Request request = new Request.Builder()
                .post(RequestBody.create(null, new byte[0]))
                .url("https://freelance.lsrv.in.ua/api/job/delete/" + jobId)
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.body().string());
        return response;
    }

    public Response getJobId(Auth auth, int id) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/" + id)
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.body().string());
        return response;
    }

    public Response getUserJobs(Auth auth) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/user/jobs")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.body().string());
        return response;
    }

    public Response getJobsAll(Auth auth) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/all")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.body().string());
        return response;
    }

}
