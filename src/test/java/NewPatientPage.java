import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class NewPatientPage {

    private SelenideElement firstName = $(byXpath("//*[@formcontrolname='first_name']"));
    private SelenideElement lastName = $(byXpath("//*[@formcontrolname='first_name']\""));
    private SelenideElement signOut = $(byXpath("//*[text()='Sign out']"));
    private SelenideElement casparID = $(byXpath("//*[app-new-user-dialog]//*[text()='Caspar ID']//following-sibling::*"));
    private SelenideElement password = $(byXpath("//*[app-new-user-dialog]//*[text()='Temporary Password']//following-sibling::*"));
    public String login;
    public String pass;

    public void fillPesonalInfo(){

        firstName.val();
        lastName.val();


    }
    private ElementsCollection elem =
            $$x("//*[head]");
    public void sfasdf()
    {
        int a = 1+(int) (Math.random() * elem.size() );

    }

public void storePasswordandCloseDialog(){

        login= casparID.getText();
        pass=password.getText();

}

public void signOut(){
    signOut.click();
}



private int random()
{return 100 + (int) ( Math.random() * 999 );}
}
