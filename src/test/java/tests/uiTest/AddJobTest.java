package tests.uiTest;

import my_project.ui.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class AddJobTest extends BaseTest {

    static String title = "QA";
    static String description = "automation app";
    static String price = "1000";

    @Test(priority = 2)
    public void addJob() throws InterruptedException {
        title += new Random().nextInt();
        login().clickIconInput().clickProfileButton()
                .clickAddJobButton()
                .setTitle(title).setDescription(description).setPrise(price).clickLCreateJobButton();

        String textTitle = new ProfilePage().getCreatedTitle();
        String textDescription = new ProfilePage().getCreatedDescription();
        String textPrice = new ProfilePage().getCreatedPrice();

        Assert.assertEquals(textTitle, title);
        Assert.assertEquals(textDescription, description);
        Assert.assertEquals(textPrice, "Price " + price);
    }
}
