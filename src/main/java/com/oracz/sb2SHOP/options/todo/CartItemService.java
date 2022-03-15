//package com.oracz.sb2SHOP;
//
//import com.oracz.sb2SHOP.model.ProductShop;
//import com.oracz.sb2SHOP.options.CartValidator;
//import com.oracz.sb2SHOP.service.CartItems;
//import org.aopalliance.intercept.MethodInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CartItemService {
//    private final CartItems cartItems;
//    private final CartValidator cartValidator;
//
//
//
//    @Autowired
//    public CartItemService(CartItems cartItems, CartValidator cartValidator) {
//        this.cartItems = cartItems;
//        this.cartValidator = cartValidator;
//    }
//    public ProductShop addCartItems (ProductShop productShop){
//    cartValidator.validate(productShop);
//        MethodInterceptor methodInterceptor = ProductShop -> cartItems.saveCartItem(productShop);
//
//
////
//
//        return productShop;
//    }
//
////    public TreeMap< > addRandomItems (RandomValues randomValues){
////        return
////    }
//
//
////    public ProductShop createProductShop
//
//}
