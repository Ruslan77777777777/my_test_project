package tests.uiTest;

import my_project.ui.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginAndChangeProfileTest extends BaseTest {


    @Test(priority = 1)
    public void loginAndChangeProfile() throws InterruptedException {
        login().clickIconInput().clickProfileButton();
        setAndCheck(new ProfilePage(), "first", "last");
        setAndCheck(new ProfilePage(), "first1", "last1");
    }

    void setAndCheck(ProfilePage page, String first, String last) {
        String pageText = page.clickButtonEditInfo().inputName(first)
                .inputLastName(last).clickUpdateButton().getPageName();
        Assert.assertTrue(pageText.contains(first + " " + last));
    }

}
