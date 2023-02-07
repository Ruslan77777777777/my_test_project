package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.JobDetails;
import my_project.ui.ProfilePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class FreelancePage {

    private SelenideElement iconInput = $x("//mat-icon[@class='mat-icon notranslate mat-accent material-icons']");
    private SelenideElement profileButton = $x("//div/button[1]");

    private SelenideElement viewInfoButton = $x("//mat-icon[@class ='mat-icon notranslate material-icons mat-icon-no-color']");

    public FreelancePage clickIconInput() throws InterruptedException {
        iconInput.shouldBe(Condition.enabled).click();
        return this;
    }

    public ProfilePage clickProfileButton() {
        profileButton.shouldBe(visible).shouldBe(Condition.enabled).click();
        return new ProfilePage();
    }

    public JobDetails clickViewInfoButton() {
        viewInfoButton.shouldBe(visible).shouldBe(Condition.enabled).click();
        return new JobDetails();
    }

}
