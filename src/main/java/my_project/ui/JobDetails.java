package my_project.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import my_project.ui.FreelancePage;

import static com.codeborne.selenide.Selenide.$x;

public class JobDetails {
    private SelenideElement commentInput = $x("//textarea[@formcontrolname='message']");
    private SelenideElement leaveCommentButton = $x("//span[text()=' Leave comment ']");
    private SelenideElement closeJobDetailsButton = $x("//span[text()='Close job details']");

    private SelenideElement createdComment = $x("//div[@class='comments']//mat-card-content[@class='mat-card-content']/p");

    public JobDetails setCommentInput(String comment) {
        commentInput.shouldBe(Condition.visible).setValue(comment);
        return this;
    }

    public JobDetails clickCommentButton() {
        leaveCommentButton.shouldBe(Condition.visible).click();
        return this;
    }

    public FreelancePage clickCloseJobDetailsButton() {
        closeJobDetailsButton.shouldBe(Condition.visible).click();
        return new FreelancePage();
    }

    public String getCreatedComment() {
        return createdComment.shouldBe(Condition.visible).text();
    }
}
