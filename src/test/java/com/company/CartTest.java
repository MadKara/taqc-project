package com.company;

import com.company.util.TestRunner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CartTest extends TestRunner {

    @Test
    public void verifyThatOneProductAddedToCart() {
        int cartQuantity = homePage
                .getPopularTab()
                .getProduct(1)
                .hoverToProduct()
                .addToCart()
                .continueShopping()
                .getHeader()
                .getCartQuantity();

        assertThat(cartQuantity)
                .as("In cart should be one product")
                .isEqualTo(1);
    }
}