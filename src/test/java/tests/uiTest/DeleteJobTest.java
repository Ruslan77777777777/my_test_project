package tests.uiTest;

import com.codeborne.selenide.WebDriverRunner;
import my_project.ui.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DeleteJobTest extends BaseTest {


    @Test(priority = 4)
    public void deleteJob() throws InterruptedException {
        login().clickIconInput().clickProfileButton();
        String numberJob = new ProfilePage().getCreatedJobs();
        System.out.println(numberJob);
        String numberComments = new ProfilePage().getCreatedComment();
        System.out.println(numberComments);
        new ProfilePage().deleteJob();
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.switchTo().alert().accept();
        new ProfilePage().makeScrollJobs();
    }
}
