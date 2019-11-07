package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement loginField = $(byXpath("//*[@formcontrolname='login']"));
    private SelenideElement passwordField = $(byXpath("//*[@formcontrolname='password']"));


    public void login(String login, String pass) {
        loginField.val(login);
        passwordField.val(pass).pressEnter();


    }
}
