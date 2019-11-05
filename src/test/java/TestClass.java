import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.open;

public class TestClass {


    @Test

    public void Test() {
        open("https://beta.caspar-health.com/en/#/user/sign_in");
        new LoginPage().login("IXE0865", "78350619");
        /*
        ElementsCollection e = $()
        //*[@class="stats-container"]//*[@uisref="core.new-patient"] click
        //*[@formcontrolname="first_name"]
        //*[@formcontrolname="last_name"]

        //*[@aria-label="Day"] или //*[@aria-label="Day"]//div[@class="mat-select-arrow"]

        //*[mat-option]/mat-option[6] -опшинсы
//*[@aria-label="Month"] или //*[@aria-label="Month"]//div[@class="mat-select-arrow"]
//*[mat-option]/mat-option[6] -опшинсы

//*[@aria-label="Year"] или //*[@aria-label="Year"]//div[@class="mat-select-arrow"]
//*[mat-option]/mat-option[6]

//*[@aria-label="Day"] или //*[@aria-label="Day"]//div[@class="mat-select-arrow"
// *[mat-option]/mat-option[6]
 -
        //*[@type="submit"]


                QVB2386
        40102705
        50574752
        //*[mat-checkbox]/mat-checkbox
        //*[button]/button

//*[@mat-button]
        //h1
        //*[@class="line-1"]
        //*[@class="line-2"]

        Welcome Patient
        The Caspar App provides you with an online access to your individual training from your mentoring therapist or doctor.

                Hereby you have access to your training plan at any time as well as receiving precise exercise instructions and general informations for your therapy.





        //*[@class="mat-select-value"]/span
        List texts = $$(By.xpath("//div[@class=‘results’]/ul/ul/li")).texts()
        List texts = $$(By.xpath("//select/option")).texts()
                bили
        // 1: open dropdown
        $(".ui-select-toggle").click();

// 2.A: select option by text
        $(".ui-select-choices").selectOption("option text");

// 2.B: select option by value
        $(".ui-select-choices").val("option value");




       */
    }
}


