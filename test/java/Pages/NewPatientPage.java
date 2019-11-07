package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;



public class NewPatientPage {

    private SelenideElement firstName = $(byXpath("//*[@formcontrolname='first_name']"));
    private SelenideElement lastName = $(byXpath("//*[@formcontrolname='last_name']"));
    private SelenideElement day = $(byXpath("//*[@aria-label='Day']"));
    private ElementsCollection option = $$(byXpath("//*[mat-option]/mat-option"));
    private SelenideElement month = $(byXpath("//*[@aria-label='Month']"));
    private SelenideElement year = $(byXpath("//*[@aria-label='Year']"));
    private SelenideElement country = $(byXpath("//*[@aria-label='Country']"));
    private SelenideElement save = $(byXpath("//*[@type='submit']"));

    public void fillPesonalInfo() {

        firstName.val("Something");
        lastName.val("New");
        selectRandomValue(day);
        selectRandomValue(month);
        selectRandomValue(year);
        country.scrollTo();
        selectRandomValue(country);

    }

    public void clickSave() {
        save.click();
    }


    private void selectRandomValue(SelenideElement select) {
        select.click();
        option.get(random(option.size())).click();


    }


    private int random(int size) {
        return (int) (Math.random() * size);
    }
}
