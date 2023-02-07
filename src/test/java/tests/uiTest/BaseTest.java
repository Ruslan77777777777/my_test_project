package tests.uiTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.FreelancePage ;
import my_project.ui.MainPage;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@Listeners(CustomExtentReportListener.class)
public class BaseTest {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out","target/extentReport/ExtentHtml.html");
    }
    static String login = "Test";
    static String pass = "12345678";

    @BeforeMethod
    void setUp() {
        open("https://freelance.lsrv.in.ua/home");
    }

    FreelancePage login() {
        return new MainPage().goToLoginPage().loginInput(login)
                .passwordInput(pass).clickLoginButton();
    }

    //@AfterMethod
    void finish() {
        Configuration.holdBrowserOpen = true;
    }

    @AfterMethod
    void logout() {
        closeWindow();
    }
}
