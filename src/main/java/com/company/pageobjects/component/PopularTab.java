package com.company.pageobjects.component;

import com.company.pageobjects.product.PopularTabProduct;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class PopularTab {

    public PopularTabProduct getProduct(int index) {
        $x("//div[@id='center_column']").scrollIntoView(true);

        return new PopularTabProduct(format("//ul[@id = 'homefeatured']/li[%s]", index));
    }
}