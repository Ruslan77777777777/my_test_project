package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.AddJob;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
    private SelenideElement editInfo = $x("//span[text()='Edit Info']");
    private SelenideElement nameInput = $x("//input[@formcontrolname='name']");
    private SelenideElement lastNameInput = $x("//input[@formcontrolname='lastname']");
    private SelenideElement updateButton = $x("//span[text()=' Update ']");
    private SelenideElement addJobButton = $x("//span[text()='Add job']");
    private SelenideElement pageName = $x("//div/h3");


    private SelenideElement createdTitle = $x("//mat-card-title");
    private SelenideElement createdPrice = $x("//mat-card-subtitle[@class='mat-card-subtitle price']");
    private SelenideElement createdDescription = $x("//p");


    private SelenideElement getCreatedJobs = $x("//h2[@class='ng-star-inserted']");

    public static SelenideElement getCreatedComment = $x("//mat-card-subtitle[@align='end']");

    private SelenideElement removeJob = $x("//mat-icon[@class='mat-icon notranslate mat-warn material-icons']");


    private SelenideElement scrollJobs = $x("//app-my-jobs");

    public ProfilePage clickButtonEditInfo() {
        editInfo.shouldBe(Condition.visible).click();
        return this;
    }

    public ProfilePage inputName(String name) {
        nameInput.shouldBe(Condition.visible).setValue(name);
        return this;
    }

    public ProfilePage inputLastName(String lastName) {
        lastNameInput.shouldBe(Condition.visible).setValue(lastName);
        return this;
    }

    public ProfilePage clickUpdateButton() {
        updateButton.shouldBe(Condition.visible).click();
        return this;
    }

    public String getPageName() {
        return pageName.shouldBe(Condition.visible).text();
    }

    public AddJob clickAddJobButton() {
        addJobButton.shouldBe(Condition.visible).click();
        return new AddJob();
    }

    public String getCreatedTitle() {
        return createdTitle.shouldBe(Condition.visible).text();
    }

    public String getCreatedPrice() {
        return createdPrice.shouldBe(Condition.visible).text();
    }

    public String getCreatedDescription() {
        return createdDescription.shouldBe(Condition.visible).text();
    }


    public String getCreatedJobs() {
        return getCreatedJobs.shouldBe(Condition.visible).text();

    }

    public String getCreatedComment() {
        if (getCreatedComment.exists()) {
            return getCreatedComment.shouldBe(Condition.visible).text();
        } else

            return null;
    }

    public ProfilePage deleteJob() {
        if (removeJob.exists()) {
            removeJob.shouldBe(Condition.visible).click();
        } else
            return this;
        return null;
    }


    public ProfilePage makeScrollJobs() {
        scrollJobs.shouldBe(Condition.visible).scrollIntoView(false);
        return this;

    }

}
