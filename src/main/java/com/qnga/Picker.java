package com.qnga;

public class Picker {
    private static final double MARKET_CAP_THRESHOLD = 2000000000;
    private static final double PE_RATIO_THRESHOLD = 15;
    private static final double DIVIDEND_YIELD_THRESHOLD = 0;

    public Boolean shouldPick(Data stockData) {
        Double marketCap = stockData.getMarketCap();
        Double peRatio = stockData.getPeRatio();
        Double divYield = stockData.getDividendYield();

        return marketCap >= MARKET_CAP_THRESHOLD
                && peRatio <= PE_RATIO_THRESHOLD
                && divYield > DIVIDEND_YIELD_THRESHOLD;
    }
}
