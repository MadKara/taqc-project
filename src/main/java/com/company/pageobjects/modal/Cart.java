package com.company.pageobjects.modal;

import static com.codeborne.selenide.Selenide.$x;

public class Cart {

    public String getTotal() {
        return $x("").text();
    }

    public String getShipping() {
        return $x("").text();
    }
}
