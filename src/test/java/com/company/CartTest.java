package com.company;

import com.company.util.TestRunner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CartTest extends TestRunner {

    @Test
    public void verifyThatOneProductAddedToCart() {
        int productCountInCart = homePage
                .getPopularTab()
                .getProduct(1)
                .hoverToProduct()
                .addToCart()
                .continueShopping()
                .getHeader()
                .getProductCountInCart();

        assertThat(productCountInCart)
                .as("In cart should be one product")
                .isEqualTo(1);
    }
}