package com.qnga;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataFetcher implements Fetchable {
    @Override
    public Data fetch(String symbol, String stockExchange) {
        Double marketCap = 1000000000000D;
        Double peRatio = 15D;
        Double divYield = 0.003D;

//        Map<String, String> stockExMap = new HashMap<>();
//        stockExMap.put("NASDAQ", "xnas");
//        stockExMap.put("NYSE", "xnys");
//        stockExMap.put("NYSEAMERICAN", "xase");
//
//        // https://www.morningstar.com/stocks/xase/elmd/quote
//        String url = "https://www.morningstar.com/stocks/";
//        String query = stockExMap.get(stockExchange) + "/" + symbol + "/quote";
//
//        try {
//            URLConnection connection = new URL(url + query).openConnection();
//            connection.setRequestProperty("User-Agent", "StockAgent 1.0");
//            InputStream responseStream = connection.getInputStream();
//
//            try (Scanner s = new Scanner(responseStream).useDelimiter("\\A")) {
//                String response = s.hasNext() ? s.next() : "";
//                System.out.println("response: " + response);
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//        }

        Data data = new Data(symbol, stockExchange, marketCap, peRatio, divYield);

        return data;
    }
}
