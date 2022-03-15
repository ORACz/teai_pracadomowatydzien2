package com.oracz.sb2SHOP;

import com.oracz.sb2SHOP.model.ProductShop;
import com.oracz.sb2SHOP.service.CartItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
    public class Sb2ShopApplication implements CommandLineRunner {
        private final ApplicationContext applicationContext;

        @Autowired
        public Sb2ShopApplication(ApplicationContext applicationContext) {
            this.applicationContext = applicationContext;
        }


        public static void main(String[] args) {
            SpringApplication.run(Sb2ShopApplication.class, args);

        }

        @Override
        public void run(String... args) throws Exception {


            CartItems cartItems = applicationContext.getBean(CartItems.class);
            ProductShop productShop = cartItems.saveCartItem(new ProductShop("Chleb",5));
            CartItems cartItems1 = applicationContext.getBean(CartItems.class);
            ProductShop productShop1 = cartItems1.saveCartItem(new ProductShop("Masło",10));
            CartItems cartItems2 = applicationContext.getBean(CartItems.class);
            ProductShop productShop2 = cartItems2.saveCartItem(new ProductShop("Jajka",12));
            CartItems cartItems3 = applicationContext.getBean(CartItems.class);
            ProductShop productShop3 = cartItems3.saveCartItem(new ProductShop("Ser",9));
            CartItems cartItems4 = applicationContext.getBean(CartItems.class);
            ProductShop productShop4 = cartItems4.saveCartItem(new ProductShop("Pomidory",15));


            System.out.println("Dodane do koszyka : " + cartItems.getAllProductShop());
            System.out.println("Wyszukaj po nazwie : " + cartItems.getItemByName("Chleb"));
            System.out.println("Razem do zapłaty za zakupy : " + cartItems.getTotalPriceItems() + " zł");


        }
    }




