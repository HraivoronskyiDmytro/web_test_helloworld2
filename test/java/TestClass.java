import App.BaseTest;
import org.junit.Test;

public class TestClass extends BaseTest {


    @Test

    public void Test() {

        app.openSignInPage();
        app.signIn.login("IXE0865", "78350619");
        app.myPatient.addPatient();
        app.newPatient.fillPesonalInfo();
        app.newPatient.clickSave();
        app.myPatient.storePasswordandCloseDialog();
        app.myPatient.logOut();
        app.signIn.login(app.myPatient.login, app.myPatient.password);
        app.tos.verifyTOSPage();


    }


}


