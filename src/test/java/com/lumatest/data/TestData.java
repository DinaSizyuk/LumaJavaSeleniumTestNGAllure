package com.lumatest.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {

    public static final String BASE_URL = "https://magento.softwaretestingboard.com";
    public static final String BASE_URL_TITLE = "Home Page";

    //NavBarMenu
    public static final By WHATS_NEW_MENU = By.xpath("*//nav//span[text()=\"What's New\"]");
    public static final String WHATS_NEW_URL = BASE_URL + "/what-is-new.html";
    public static final String WHATS_NEW_TITLE = "What's New";


    public static final By SALE_MENU = By.xpath("*//nav//span[text()='Sale']");
    public static final String SALE_MENU_URL = BASE_URL + "/sale.html";
    public static final String SALE_MENU_TITLE = "Sale";

    @DataProvider(name = "navigationMenuData")
    public static Object[][] navigationMenuData() {
        return new Object[][]{
                {BASE_URL, WHATS_NEW_MENU, WHATS_NEW_URL, WHATS_NEW_TITLE},
                {BASE_URL, SALE_MENU, SALE_MENU_URL, SALE_MENU_TITLE}
        };
    }
}
