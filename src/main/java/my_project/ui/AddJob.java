package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.ProfilePage;

import static com.codeborne.selenide.Selenide.$x;

public class AddJob {
    private SelenideElement titleInput = $x("//input[@id='mat-input-2']");
    private SelenideElement descriptionInput = $x("//textarea[@id='mat-input-3']");
    private SelenideElement priceInput = $x("//input[@id='mat-input-4']");
    private SelenideElement createJobButton = $x("//span[text()=' Create job ']");



    public AddJob setTitle(String title) {
        titleInput.shouldBe(Condition.visible).sendKeys(title);
        return this;
    }
    public AddJob setDescription(String description) {
        descriptionInput.shouldBe(Condition.visible).sendKeys(description);
        return this;
    }
    public AddJob setPrise(String price) {
        priceInput.shouldBe(Condition.visible).sendKeys(price);
        return this;
    }
    public ProfilePage clickLCreateJobButton() {
        createJobButton.shouldBe(Condition.visible).click();
        return new ProfilePage();
    }

}
