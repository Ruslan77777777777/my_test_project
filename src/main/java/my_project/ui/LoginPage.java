package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.FreelancePage;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement loginInput = $x("//input[@id='mat-input-0']");
    private SelenideElement passwordInput = $x("//input[@id='mat-input-1']");
    private SelenideElement loginButton = $x("//span[@class='mat-button-wrapper']");

    public LoginPage loginInput(String login) {
        loginInput.shouldBe(Condition.visible).sendKeys(login);
        return this;
    }

    public LoginPage passwordInput(String password) {
        passwordInput.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public FreelancePage clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
        return new FreelancePage();
    }
}
