package steps;


import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps {

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openPage(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
    }

    @Допустим("^введен логин \"([^\"]*)\"$")
    public void enterLogin(String login) {
        $(By.xpath("//input[@data-test = 'username']")).sendKeys(login);
    }

    @Допустим("^введен пароль \"([^\"]*)\"$")
    public void enterPassword(String password) {
        $(By.xpath("//input[@data-test = 'password']")).sendKeys(password);
    }

    @Допустим("^нажата кнопка войти")
    public void clickLoginButton() {
        $(By.xpath("//input[@data-test = 'login-button']")).click();
    }

    @Тогда("^пользователь успешно вошел на \"([^\"]*)\"$")
    public void openLink(String siteURL) {
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(siteURL, currentPageURL, "Значения ссылок не сопадают");
    }

    @Тогда("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $(By.xpath("//*[contains(text(),'" + link + "')]")).click();
        String currentURL = getWebDriver().getCurrentUrl();
        assertTrue("https://www.saucedemo.com/inventory.html" != currentURL,
                "ссылки совпадают");
    }

}
