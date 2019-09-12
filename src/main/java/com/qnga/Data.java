package com.qnga;

public class Data {
    private String symbol;
    private String stockExchange;
    private Double marketCap;
    private Double peRatio;
    private Double dividendYield;

    public Data(String symbol,
                String stockExchange,
                Double marketCap,
                Double peRatio,
                Double divYield) {
        this.symbol = symbol;
        this.stockExchange = stockExchange;
        this.marketCap = marketCap;
        this.peRatio = peRatio;
        this.dividendYield = divYield;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public Double getPeRatio() {
        return peRatio;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getDividendYield() {
        return dividendYield;
    }
}
