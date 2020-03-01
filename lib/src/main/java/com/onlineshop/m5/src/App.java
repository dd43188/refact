package com.onlineshop.m5.src;


import com.onlineshop.m5.src.entities.Order;
import com.onlineshop.m5.src.handlers.CheckoutHandler;
import com.onlineshop.m5.src.handlers.SimpleCurrencyConverter;
import com.onlineshop.m5.src.items.Cheese;
import com.onlineshop.m5.src.items.Wine;

import static com.onlineshop.m5.src.entities.CustomerRepo.*;

public class App {


    public static void main(String[] args){


        Order order = new Order(getUsCustomer());

        order.add(new Wine());
        order.add(new Cheese());

        CheckoutHandler checkout = new CheckoutHandler();
        double total = checkout.calculateTotal(order);


        SimpleCurrencyConverter converter = new SimpleCurrencyConverter("EUR");
        System.out.println("Price in USD: " + total);
        System.out.println("Hard-coded in EUR: " + converter.convert(total));
        System.out.println("From a Web Service in EUR: " + converter.convertWithWebService(total));




        // ---- 2nd Order ---- //

        Order order2 = new Order(getUsUnderAgeCustomer());

        order2.addWithCheck2(new Wine());
        order2.addWithCheck2(new Cheese());

        System.out.println("Items added for underage US customer:" + order2.getItems());



        // ---- 3rd Order ---- //

        Order order3 = new Order(getCanadianCustomer());

        order3.addWithCheck2(new Wine());
        order3.addWithCheck2(new Cheese());

        System.out.println("Items added for Canadian customer:" + order3.getItems());


    }
}
