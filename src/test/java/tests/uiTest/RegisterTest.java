package tests.uiTest;

import my_project.ui.MainPage;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {
    @Test
    public void registerProfile() {
        new MainPage().goToRegisterPage()
                .setUsername(login).setName("b1").setLastName("c1")
                .setPassword(pass).setConfirmPassword(pass)
                .clickRegisterButton();
    }
}
