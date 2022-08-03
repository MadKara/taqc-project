package com.company.pageobjects.product;

import com.company.pageobjects.modal.CartLayer;
import lombok.AllArgsConstructor;

import static com.codeborne.selenide.Selenide.$x;

@AllArgsConstructor
public class Product {

    private String rootProductPath;

    public Product hoverToProduct() {
        $x(rootProductPath).hover();

        return this;
    }

    public CartLayer addToCart() {
        $x(rootProductPath + "//a[contains(@class, 'add_to_cart_button')]").click();

        return new CartLayer();
    }
}
