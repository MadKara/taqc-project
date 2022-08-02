package com.company.pageobjects;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class HomePage {

    @Step("Opened home page")
    public HomePage open() {
        Selenide.open("http://automationpractice.com/index.php");

        return this;
    }
}
