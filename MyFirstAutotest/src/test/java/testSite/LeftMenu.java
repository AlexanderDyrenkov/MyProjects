package testSite;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.Buttons;
import util.WebElementAction;

public class LeftMenu {

    static final By buttonMain = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //a[@href=\"./\" and .//div[contains(text(), \"Главная\")] and @data-nav-type=\"9\"]");
    static final By buttonPersonalInfo = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //a[@href=\"personal-info\" and .//div[contains(text(), \"Личная информация\")] and .//img[@data-atf=\"true\"]]");
    static final By buttonDataAndPersonalization = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //a[@href=\"data-and-personalization\" and .//div[contains(text(), \"Данные и персонализация\")] and .//img[@data-atf=\"true\"]]");
    static final By buttonSecurity = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)]  //a[@href=\"security\" and @data-nav-type=\"9\"]");
    static final By buttonAccessSettings = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //a[@href=\"people-and-sharing\" and .//div[contains(text(), \"Настройки доступа\")] and .//img[@data-atf=\"true\"]]");
    static final By buttonPaymentsAndSubscriptions = By.xpath("//c-wiz[@data-savescroll=\"0\" and not(@data-savedfocusid)] //a[@href=\"payments-and-subscriptions\" and .//div[contains(text(), \"Платежи и подписки\")] and @data-nav-type=\"9\"]");

    public static void pressButton (By mainHeader, String keyWord, Buttons button) {

        Assert.assertTrue(WebElementAction.find(mainHeader).contains(keyWord));

        switch (button) {
            case Главная:
                WebElementAction.click(buttonMain);
                break;
            case Личная_информация:
                WebElementAction.click(buttonPersonalInfo);
                break;
            case Данные_и_персонализация:
                WebElementAction.click(buttonDataAndPersonalization);
                break;
            case Безопасность:
                WebElementAction.click(buttonSecurity);
                break;
            case Настройки_доступа:
                WebElementAction.click(buttonAccessSettings);
                break;
            case Платежи_и_подписки:
                WebElementAction.click(buttonPaymentsAndSubscriptions);
                break;
            default:
                break;
        }

    }

}
