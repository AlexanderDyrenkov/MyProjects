package testSite.pages;

import org.openqa.selenium.By;
import testSite.pages.LeftMenu;
import util.Buttons;

public class PaymentsAndSubscriptionsPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Ваши платежные данные, транзакции, подписки и бронирования.\")]] //h1");
    static final String keyWord = "Платежи и подписки";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }

}
