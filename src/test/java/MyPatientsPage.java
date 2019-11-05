import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyPatientsPage {

    private SelenideElement addPatient = $(byXpath("//*[@class='stats-container']//*[@uisref='core.new-patient']"));
    private SelenideElement closeDialog = $(byXpath("//*[@aria-label='Close dialog']"));
    private SelenideElement signOut = $(byXpath("//*[text()='Sign out']"));
    private SelenideElement casparID = $(byXpath("//*[app-new-user-dialog]//*[text()='Caspar ID']//following-sibling::*"));
    private SelenideElement password = $(byXpath("//*[app-new-user-dialog]//*[text()='Temporary Password']//following-sibling::*"));
    public String login;
    public String pass;

    public void addPatient(){
        addPatient.click();

    }
public void storePasswordandCloseDialog(){

        login= casparID.getText();
        pass=password.getText();
        closeDialog.click();
}

public void signOut(){
    signOut.click();
}

}
