package tests.uiTest;

import my_project.ui.FreelancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCommentTest extends BaseTest {

    static String comment = "NNN";

    @Test(priority = 3)
    public void addComment() {
        login().clickViewInfoButton().setCommentInput(comment).clickCommentButton()
                .clickCloseJobDetailsButton();

        String text = new FreelancePage().clickViewInfoButton().getCreatedComment();
        Assert.assertEquals(text, comment);
    }
}

