import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement loginField = $(byXpath("//*[@formcontrolname='login']"));
    private SelenideElement password = $(byXpath("//*[@formcontrolname='password']"));

    public void login(String login, String pass) {
        loginField.val(login);
        password.val(pass).pressEnter();


    }
}
