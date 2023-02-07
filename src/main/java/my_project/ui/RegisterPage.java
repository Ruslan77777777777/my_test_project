package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.LoginPage;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterPage {
    private SelenideElement usernameInput = $x("//input[@id='mat-input-0']");
    private SelenideElement nameInput = $x("//input[@id='mat-input-1']");
    private SelenideElement lastNameInput = $x("//input[@id='mat-input-2']");
    private SelenideElement passwordInput = $x("//input[@id='mat-input-3']");
    private SelenideElement confirmPasswordInput = $x("//input[@id='mat-input-4']");
    private SelenideElement registerButton = $x("//span[@class='mat-button-wrapper']");

    public RegisterPage setUsername(String username) {
        usernameInput.shouldBe(Condition.visible).sendKeys(username);
        return this;
    }

    public RegisterPage setName(String name) {
        nameInput.shouldBe(Condition.visible).sendKeys(name);
        return this;
    }

    public RegisterPage setLastName(String lastname) {
        lastNameInput.shouldBe(Condition.visible).sendKeys(lastname);
        return this;
    }

    public RegisterPage setPassword(String password) {
        passwordInput.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public RegisterPage setConfirmPassword(String password) {
        confirmPasswordInput.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public LoginPage clickRegisterButton() {
        registerButton.shouldBe(Condition.visible).click();
        return new LoginPage();
    }
}
