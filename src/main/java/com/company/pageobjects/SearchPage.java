package com.company.pageobjects;

import com.company.pageobjects.product.SearchedProduct;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeNotEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class SearchPage {

    public List<SearchedProduct> getSearchedProducts() {
        var productPath = "//ul[contains(@class, 'product_list')]/li";

        return range(1, $$x(productPath)
                .shouldHave(sizeNotEqual(0))
                .size())
                .mapToObj(i -> new SearchedProduct(format("(%s)[%s]", productPath, i)))
                .collect(toList());
    }

    public String getNoResultsAlert() {
        return $x("//div[contains(@class, \"center_column\")]/p")
                .shouldBe(visible)
                .text();
    }
}
