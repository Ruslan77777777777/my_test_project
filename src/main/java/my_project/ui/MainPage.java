package my_project.ui;

import com.codeborne.selenide.SelenideElement;
import my_project.ui.LoginPage;
import my_project.ui.RegisterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private SelenideElement createAccountLink = $x("//a[text()='Create account']");
    private SelenideElement loginLink = $x("//a[text()='Log in']");

    public RegisterPage goToRegisterPage() {
        createAccountLink.shouldBe(visible).click();
        return new RegisterPage();
    }

    public LoginPage goToLoginPage() {
        loginLink.shouldBe(visible, Duration.ofSeconds(6)).click();
        return new LoginPage();
    }

}


