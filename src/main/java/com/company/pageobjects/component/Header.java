package com.company.pageobjects.component;

import com.company.pageobjects.CartPage;
import com.company.pageobjects.modal.Cart;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private String cartButtonPath = "//div[@class = 'shopping_cart']/a";

    public CartPage openCart() {
        $x(cartButtonPath).click();

        return new CartPage();
    }

    public Cart hoverToCart() {
        $x(cartButtonPath).hover();

        return new Cart();
    }

    public int getProductCountInCart() {
        String cartQuantityPath = "//div[@class = 'shopping_cart']//span[contains(@class, 'ajax_cart_quantity')]";

        return Integer.parseInt($x(cartQuantityPath)
                .scrollIntoView(true)
                .text());
    }
}
