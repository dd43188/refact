package com.onlineshop.m6.src;


import com.onlineshop.m6.src.entities.Customer;
import com.onlineshop.m6.src.entities.Order;
import com.onlineshop.m6.src.handlers.CheckoutHandler;
import com.onlineshop.m6.src.handlers.SimpleCurrencyConverter;
import com.onlineshop.m6.src.items.Cheese;
import com.onlineshop.m6.src.items.Chocolate;
import com.onlineshop.m6.src.items.Wine;

import static com.onlineshop.m6.src.entities.CustomerRepo.*;
import static com.onlineshop.m6.src.handlers.SimpleCurrencyConverter.getEurConverter;

public class App {


    public static void main(String[] args){


        Customer customer = getUsCustomer();
        Order order = new Order(customer);

        order.add(new Chocolate());
        order.add(new Cheese());

        CheckoutHandler checkout = new CheckoutHandler();
        double total = checkout.calculateTotal(order);


        SimpleCurrencyConverter converter = getEurConverter();


        System.out.println("Price in USD: " + total);



        if(!customer.getAddress().getCountry().toString().equalsIgnoreCase("US")){
            System.out.println("Hard-coded in EUR: " + converter.convert(total));
            System.out.println("From a Web Service in EUR: " + converter.convertWithWebService(total));
        }





        if(!customer.getCountry().equalsIgnoreCase("US")){
            // print in EUR
        }



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
