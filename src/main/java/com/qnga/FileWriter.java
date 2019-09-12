package com.qnga;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileWriter implements Outputable {
    private static final String RESULT_FILE_PATH = "/home/nga/Desktop/StockScreening/results/";

    @Override
    public void write(List<Data> stockData) {
        List<String> symbols = new ArrayList<>();
        for (Data stock : stockData) {
            symbols.add(stock.getSymbol());
        }

        String fileName = "Picked_Stocks_" + DateTimeFormatter.ofPattern("yyyy_MM_dd").format(LocalDate.now());

        try {
            Path file = Paths.get(RESULT_FILE_PATH + fileName);
            Files.write(file, symbols, StandardCharsets.UTF_8);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
