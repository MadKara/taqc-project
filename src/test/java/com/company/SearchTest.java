package com.company;

import com.company.pageobjects.SearchPage;
import com.company.util.TestRunner;
import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends TestRunner {

    @Test(groups = "positive", dataProvider = "validSearchData")
    @Description("Test to verify search field should work with valid data")
    public void verifySearchFieldShowResultsWithValidData(String value) {
        var products = homePage
                .getHeader()
                .performSearch(value)
                .getResultsOfProducts();

        assertThat(products)
                .as("Search field with entered valid inputs should show according list of products")
                .allMatch(s -> s.contains(value));
    }

    @Test(groups = "negative", dataProvider = "invalidSearchData")
    @Description("Test to verify search field should not work with invalid data")
    public void verifySearchFieldDoesNotShowResultsWithInvalidData(String value) {
        var products = homePage
                .getHeader()
                .performSearch(value)
                .getResultsOfProducts()
                .size();

        assertThat(products)
                .as("Search field with entered invalid inputs should not show any product")
                .isEqualTo(0);
    }

    @DataProvider(name = "validSearchData")
    public Object[][] validSearchData() {
        return new Object[][]{
                {"Blouse"},
                {"T-shirts"}
        };
    }

    @DataProvider(name = "invalidSearchData")
    public Object[][] invalidSearchData() {
        return new Object[][]{
                {"sdfjs"},
                {"0dress"}
        };
    }
}
