package com.oracz.sb2SHOP.profiles;

import com.oracz.sb2SHOP.service.CartItems;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
@Profile("Pro")
public class ShopPro {



    @EventListener(ApplicationReadyEvent.class)

    public void get () {
        System.out.println("ShopPro");


    }
    @Value("${cartItems.rabatProperties}")
    public double rabatProperties;

    @EventListener(ApplicationReadyEvent.class)
    public void getTotalPriceWithRabat() {

        double suma = CartItems.cartItems.values().stream().mapToInt(x -> (int) x.getPriceProduct()).sum();

        double r = suma - rabatProperties;
        System.out.println("Mój koszyk do zapłaty z rabatem = " + r);
    }


}