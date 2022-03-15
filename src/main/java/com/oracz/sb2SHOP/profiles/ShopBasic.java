package com.oracz.sb2SHOP.profiles;

import com.oracz.sb2SHOP.model.ProductShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
@Profile("Basic")
public class ShopBasic {

    //  @Value("${randomDoubleWithRange}")
     // public int randomDoubleWithRange;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("ShopBasic");
    }

    private static final int MIN_PRICE = 30;
    private static final  int MAX_PRICE = 500;

    @EventListener(ApplicationReadyEvent.class)
    public void getRandomProductShopPrice(){
        Random generator = new Random();
        List<ProductShop> productRandomShop;
        productRandomShop = Stream.iterate(1, n-> n + 1).limit(5).map(x -> new ProductShop("Prod" + x, Double.valueOf((long)
                        generator.nextInt(MAX_PRICE - MIN_PRICE) + MIN_PRICE).intValue() ))
                .collect(Collectors.toList());
        System.out.println("Random produktów z losową ceną : " + productRandomShop);





    }


}
