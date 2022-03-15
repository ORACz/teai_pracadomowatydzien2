package com.oracz.sb2SHOP.options.todo;

import com.oracz.sb2SHOP.model.ProductShop;
import com.oracz.sb2SHOP.service.CartItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component

public class CartValidator {

    private final CartItems cartItems;

    @Autowired
    public CartValidator(CartItems cartItems) {this.cartItems = cartItems;}

    public void validate(ProductShop productShop) {
        String name = productShop.getNameProduct();
        Optional<ProductShop> optionalProductShop = cartItems.getItemByName(name);

        if (optionalProductShop.isPresent()){
            throw new RuntimeException("ProductShop with name: " + name + "already exist");
        }

    }
}
