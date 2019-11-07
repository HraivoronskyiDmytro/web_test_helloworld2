package App;


import Pages.MyPatientsPage;
import Pages.NewPatientPage;
import Pages.SignInPage;
import Pages.TOSPage;

import static com.codeborne.selenide.Selenide.open;

public class Application {


    public SignInPage signIn = new SignInPage();
    public NewPatientPage newPatient = new NewPatientPage();
    public MyPatientsPage myPatient = new MyPatientsPage();
    public TOSPage tos = new TOSPage();

    public Application openSignInPage() {
        open("https://beta.caspar-health.com/en/#/user/sign_in");
        return this;
    }

}
