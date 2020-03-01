package com.onlineshop.m3.end.handlers;


import com.onlineshop.m3.end.entities.DeliveryTimeWindow;
import com.onlineshop.m3.end.entities.Order;
import com.onlineshop.m3.end.items.Item;

import java.time.LocalDate;
import java.util.List;

import static java.lang.String.format;

public class CheckoutHandler {

    private LocalDate deliveryWindowStart;
    private LocalDate deliveryWindowEnd;


    private DiscountManager discountManager = new DiscountManager();
    private DeliveryManager deliveryManager = new DeliveryManager();


    public double calculateTotal(Order order){

        double baseTotal = sumItemPrices(order.getItems());

        baseTotal = discountManager.applyVoucher(order.getVoucher(), baseTotal);

        baseTotal = deliveryManager.addDeliveryFee(order.getCustomer(), baseTotal);

        return baseTotal;
    }



    private double sumItemPrices(List<Item> items) {
        double sum = 0;
        for(Item item : items){
            sum = sum + item.price();
        }
        return sum;
    }


    public void setDeliveryTimeWindow(LocalDate deliveryStart, LocalDate deliveryEnd){
        this.deliveryWindowStart = deliveryStart;
        this.deliveryWindowEnd = deliveryEnd;

        System.out.println(format("Your Order will delivered some time between %s and %s",                                                      deliveryWindowStart, deliveryWindowEnd));
    }


    public void setDeliveryTimeWindow(DeliveryTimeWindow window){

        System.out.println(format("Your Order will delivered some time between %s and %s", window.getStart(), window.getEnd()));
    }
}
