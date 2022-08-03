package com.company.pageobjects;

import com.codeborne.selenide.Selenide;
import com.company.pageobjects.component.Header;
import com.company.pageobjects.component.PopularTab;
import io.qameta.allure.Step;
import lombok.Getter;

@Getter
public class HomePage {

    Header header = new Header();
    PopularTab popularTab = new PopularTab();

    @Step("Opened home page")
    public HomePage open() {
        Selenide.open("http://automationpractice.com/index.php");

        return this;
    }
}
