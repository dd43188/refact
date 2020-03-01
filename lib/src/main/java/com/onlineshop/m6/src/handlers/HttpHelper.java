package com.onlineshop.m6.src.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//import static java.net.http.HttpClient.newBuilder;

public class HttpHelper {


//    public String getCurrencyRate(String baseCurrency){
//        HttpClient httpClient = newBuilder().build();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.exchangeratesapi.io/latest?base=" + baseCurrency))
//                .build();
//
//        HttpResponse<String> response = null;
//        try {
//            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return response.body();
//    }

    public String getCurrencyRate(String baseCurrency) {
        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest?base=" + baseCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("GET"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();

            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
