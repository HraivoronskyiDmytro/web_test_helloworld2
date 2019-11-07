package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TOSPage {

    private SelenideElement textTOU = $(byXpath("//*[@class='tos-large text-left']/p[1]"));
    private SelenideElement textPrivacy = $(byXpath("//*[@class='tos-large text-left']/p[2]"));
    private SelenideElement tosCheckbox = $(byXpath(" //*[@class='mat-checkbox mat-primary']"));
    private SelenideElement signOutButton = $(byXpath("//*[@class='mat-button']"));
    private SelenideElement continuebutton = $(byXpath("//*[@class='tos-accept ml-auto mat-ripple caspar-button']"));



    public void verifyTOSPage(){
        textTOU.shouldHave(Condition.textCaseSensitive("I hereby agree to the terms of use of Caspar relating to my therapy with the attending medical facility. I also authorise the facility for release of medical information."));
        textPrivacy.shouldHave(Condition.textCaseSensitive("Please be aware of the Caspar terms and conditions as well as the data privacy policy.."));
        tosCheckbox.shouldBe(Condition.visible);
        signOutButton.shouldBe(Condition.visible);
        continuebutton.shouldBe(Condition.disabled);

    }
}
