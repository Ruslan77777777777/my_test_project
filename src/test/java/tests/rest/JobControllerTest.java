package tests.rest;

import my_project.rest.controller.JobController;
import my_project.rest.entities.Job;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class JobControllerTest extends BaseApiTest{
  static String jobId;
    @Test(priority = 1)
    public void createJob() throws IOException {
        JobController jobController = new JobController();
        Job job = new Job();
        job.setTitle("QA");
        job.setDescription("automation");
        job.setPrice("2000.0");
        Job newJob = jobController.createJob(auth, job);
        job.setId(newJob.getId());
        jobId = newJob.getId();

        Assert.assertEquals(job.getDescription(), newJob.getDescription());
        Assert.assertEquals(job.getTitle(), newJob.getTitle());
        Assert.assertEquals(job.getPrice(), newJob.getPrice());
    }
    @Test(priority = 2)
    public void deleteJob() throws IOException{
        JobController jobController = new JobController();
        Job job = new Job();
        job.setDescription("automation");
        job.setTitle("QA");
        Response response = jobController.deleteJob(auth, jobId);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test
    public void getId() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getJobId(auth, 3);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test
    public void getUserJobs() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getUserJobs(auth);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test
    public void getJobsAll() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getJobsAll(auth);
        System.out.println(response.code());
        Assert.assertEquals(response.code(), 200);
    }
}
