package com.oracz.sb2SHOP.service;

import com.oracz.sb2SHOP.model.ProductShop;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component

public class CartItems implements Map<Long, ProductShop> {

 public static final Map<Long, ProductShop> cartItems = new HashMap<>();
 private static Long PRODUCT_ID = 0L;


 public ProductShop saveCartItem(ProductShop productShop) {
  productShop.setId(PRODUCT_ID);
  cartItems.put(PRODUCT_ID, productShop);
  PRODUCT_ID += 1;
  return productShop;
 }

 public Optional<ProductShop> getItemByName(String nameProduct) {
  return cartItems.values().stream()
          .filter(productShop -> productShop.getNameProduct().equals(nameProduct)).findFirst();
 }

  public Map<Long, ProductShop> getAllProductShop() {
  return cartItems;
 }

  public int getTotalPriceItems() {
   return cartItems.values().stream().mapToInt(x -> (int)x.getPriceProduct()).sum();
  }







 @Override
 public int size() {
  return 0;
 }

 @Override
 public boolean isEmpty() {
  return false;
 }

 @Override
 public boolean containsKey(Object key) {
  return false;
 }

 @Override
 public boolean containsValue(Object value) {
  return false;
 }

 @Override
 public ProductShop get(Object key) {
  return null;
 }

 @Override
 public ProductShop put(Long key, ProductShop value) {
  return null;
 }

 @Override
 public ProductShop remove(Object key) {
  return null;
 }

 @Override
 public void putAll(Map<? extends Long, ? extends ProductShop> m) {

 }

 @Override
 public void clear() {

 }

 @Override
 public Set<Long> keySet() {
  return null;
 }

 @Override
 public Collection<ProductShop> values() {
  return null;
 }

 @Override
 public Set<Entry<Long, ProductShop>> entrySet() {
  return null;
 }

 @Override
 public ProductShop getOrDefault(Object key, ProductShop defaultValue) {
  return Map.super.getOrDefault(key, defaultValue);
 }

 @Override
 public void forEach(BiConsumer<? super Long, ? super ProductShop> action) {
  Map.super.forEach(action);
 }

 @Override
 public void replaceAll(BiFunction<? super Long, ? super ProductShop, ? extends ProductShop> function) {
  Map.super.replaceAll(function);
 }

 @Override
 public ProductShop putIfAbsent(Long key, ProductShop value) {
  return Map.super.putIfAbsent(key, value);
 }

 @Override
 public boolean remove(Object key, Object value) {
  return Map.super.remove(key, value);
 }

 @Override
 public boolean replace(Long key, ProductShop oldValue, ProductShop newValue) {
  return Map.super.replace(key, oldValue, newValue);
 }

 @Override
 public ProductShop replace(Long key, ProductShop value) {
  return Map.super.replace(key, value);
 }

 @Override
 public ProductShop computeIfAbsent(Long key, Function<? super Long, ? extends ProductShop> mappingFunction) {
  return Map.super.computeIfAbsent(key, mappingFunction);
 }

 @Override
 public ProductShop computeIfPresent(Long key, BiFunction<? super Long, ? super ProductShop, ? extends ProductShop> remappingFunction) {
  return Map.super.computeIfPresent(key, remappingFunction);
 }

 @Override
 public ProductShop compute(Long key, BiFunction<? super Long, ? super ProductShop, ? extends ProductShop> remappingFunction) {
  return Map.super.compute(key, remappingFunction);
 }

 @Override
 public ProductShop merge(Long key, ProductShop value, BiFunction<? super ProductShop, ? super ProductShop, ? extends ProductShop> remappingFunction) {
  return Map.super.merge(key, value, remappingFunction);
 }
}




