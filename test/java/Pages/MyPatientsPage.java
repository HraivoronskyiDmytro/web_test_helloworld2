package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyPatientsPage {

    public String login;
    public String password;
    private SelenideElement addPatient = $(byXpath("//*[@class='stats-container']//*[@uisref='core.new-patient']"));
    private SelenideElement closeDialog = $(byXpath("//*[@aria-label='Close dialog']"));
    private SelenideElement signOut = $(byXpath("//*[text()='Sign out']"));
    private SelenideElement casparID = $(byXpath("//*[app-new-user-dialog]//*[text()='Caspar ID']//following-sibling::*"));
    private SelenideElement pass = $(byXpath("//*[app-new-user-dialog]//*[text()='Temporary Password']//following-sibling::*"));

    public void addPatient() {
        addPatient.click();

    }

    public void storePasswordandCloseDialog() {

        login = casparID.getText();
        password = pass.getText();
        closeDialog.click();
    }

    public void logOut() {
        signOut.click();
    }

}
