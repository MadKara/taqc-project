package com.company.pageobjects.component;

import com.company.pageobjects.product.Product;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class PopularTab {

    public Product getProduct(int index) {

        $x("//div[@id='center_column']").scrollIntoView(true);

        return new Product(format("//ul[@id = 'homefeatured']/li[%s]", index));
    }
}