package com.company.pageobjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public abstract class Header {

    @Step("Header page: Performed search of {searchValue}")
    public SearchPage performSearch(String searchValue) {
        $x("//form[@id='searchbox']/input[contains(@class, 'search_query')]")
                .setValue(searchValue)
                .pressEnter();

        return new SearchPage();
    }
}
