package com.onlineshop.m4.src;


import com.onlineshop.m4.src.entities.Order;
import com.onlineshop.m4.src.handlers.SimpleCurrencyConverter;
import com.onlineshop.m4.src.items.Cheese;
import com.onlineshop.m4.src.items.Wine;

import static com.onlineshop.m4.src.entities.CustomerRepo.*;

public class App {


    public static void main(String[] args){



        SimpleCurrencyConverter converter = new SimpleCurrencyConverter("EUR");
        System.out.println(converter.convert(12));



        Order order = new Order(getUsCustomer());

        order.add(new Wine());
        order.add(new Cheese());

        System.out.println("Items added for US Customer:" + order.getItems());



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
