package com.oracz.sb2SHOP.profiles;

import com.oracz.sb2SHOP.service.CartItems;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
@Profile("Premium")
public class ShopPremium {


    @EventListener(ApplicationReadyEvent.class)
    public void get (){
        System.out.println("ShopPremium");
    }


    @Value("${cartItems.vatProperties}")
    public double vatProperties;

    @EventListener(ApplicationReadyEvent.class)
    public void getTotalPriceWithVat() {

        double suma = CartItems.cartItems.values().stream().mapToInt(x -> (int) x.getPriceProduct()).sum();

        double v = suma * vatProperties;
        System.out.println("Mój Koszyk do zapłaty + Vat = " + v);
    }
}
