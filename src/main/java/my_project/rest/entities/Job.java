package my_project.rest.entities;

import lombok.Data;

import java.util.Objects;

@Data
public class Job {
    private String id;
    private String title;
    private String description;
    private String price;
    private String user;
    private String noOfComments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(id, job.id) && Objects.equals(title, job.title) && Objects.equals(description, job.description) && Objects.equals(price, job.price) && Objects.equals(user, job.user) && Objects.equals(noOfComments, job.noOfComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, user, noOfComments);
    }
}
