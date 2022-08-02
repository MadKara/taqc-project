package com.company.pageobjects;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage extends Header {

    public List<String> getResultsOfProducts() {
        return $$x("//ul[contains(@class, 'product_list')]/li")
                .shouldHave(CollectionCondition.sizeGreaterThanOrEqual(0))
                .texts();
    }
}
