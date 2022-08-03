package com.company.pageobjects.modal;

import com.company.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.$x;

public class CartLayer {

    public HomePage continueShopping() {
        $x("//span[contains(@class, 'continue btn')]").click();

        return new HomePage();
    }
}
