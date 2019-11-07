import App.BaseTest;
import org.junit.Test;

public class TestClass extends BaseTest {


    @Test

    public void Test() {

        app.openSignInPage();
//        app.signIn.login("IXE0865", "78350619");
//        app.myPatient.addPatient();
//        app.newPatient.fillPesonalInfo();
//        app.newPatient.clickSave();
//        app.myPatient.storePasswordandCloseDialog();
//        app.myPatient.logOut();
       // app.signIn.login(app.myPatient.login, app.myPatient.password);
        app.signIn.login("XPY8342", "37224260");
        app.tos.verifyTOSPage();
        app.tos.verifyTOSPage();


    }


        /*


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

 //*[@class='tos-large text-left']/p[1]
I hereby agree to the terms of use of Caspar relating to my therapy with the attending medical facility. I also authorise the facility for release of medical information.
Please be aware of the Caspar terms and conditions as well as the data privacy policy.
 //*[@class='tos-large text-left']/p[2]

 //*[@class="mat-button"] - Sign_out

  //*[@class="tos-accept ml-auto mat-ripple caspar-button"][@disabled]



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


