package com.qnga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        // TODO: open file
        List<Data> picked = new ArrayList<Data>();

        String line = "NASDAQ:MSFT";
        String[] info = line.split(":");
        String stockExchange = info[0];
        String symbol = info[1];

        Fetchable fetcher = new DataFetcher();
        Data data = fetcher.fetch(symbol, stockExchange);

        Picker picker = new Picker();
        if (picker.shouldPick(data)) {
            picked.add(data);
        }

        Outputable output = new EmailWriter();
        output.write(picked);
    }
}
