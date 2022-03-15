//package com.oracz.sb2SHOP;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
//import static java.lang.Integer.parseInt;
//
//@Component
//public class ProductGeneration {
//
//
//
//    public static ProductShop[] getProducts(int productNumberInArray) {
//        ProductShop[] productShops = new ProductShop[productNumberInArray];
//        for (int i = 0; i < productShops.length; i++) {
//            productShops[i] = randomProductShop();
//        }
//        return productShops;
//
//    }
//
//    private static ProductShop randomProductShop() {
//        ProductShop randomProductShop;
//        randomProductShop = new ProductShop();
//        randomProductShop.setNameProduct(randomName());
//        randomProductShop.setPriceProduct(randomPrice());
//
//        return  randomProductShop();
//    }
//
//
//    private static int randomPrice() {
//        int maxPriceProductShop = 300;
//        maxPriceProductShop = parseInt(300 + " " + "zł");
//        int minPriceProductShop = 50;
//        minPriceProductShop = parseInt(50 + " " + "zł");
//
//        return new Random().nextInt(maxPriceProductShop) + minPriceProductShop;
//    }
//
//    private static String randomName() {
//       return ProductShopName.randomName().toString();
//    }
//
//
//    private enum ProductShopName {
//        CHLEB, MASlO, WEDLINA, SER, BULKA, MLEKO, RZODKIEWKA, POMIDOR, OGOREK, SALATA, LAWASZ;
//
//        private static ProductShopName randomName() {
//            return values()[new Random().nextInt(ProductShopName.values().length)];
//        }
//
//        }
//}
