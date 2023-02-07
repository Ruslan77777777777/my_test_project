package tests.rest;

import my_project.rest.controller.CommentController;
import my_project.rest.entities.Comment;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

public class CommentControllerTest extends BaseApiTest{

    String jobId = "2";

    @Test
    public void createComment() throws IOException {
        CommentController commentController = new CommentController();
        Comment comment = new Comment();
        comment.setUsername("Test");
        comment.setMessage("Testing");
        Comment newComment = commentController.createComment(auth, comment, jobId);
        Assert.assertEquals(newComment.getMessage(), comment.getMessage());
    }
    @Test
    public void getCommentAll() throws IOException {
        CommentController commentController = new CommentController();
        Comment[] comments = commentController.getCommentAll(auth, jobId);
        Assert.assertTrue(comments.length > 0, "Must be some comments");
        System.out.println(Arrays.toString(comments));
    }
}
