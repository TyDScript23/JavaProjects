package com.example.objectsandclasses;

public class Stock {
    private String symbol;
    private double sharePrice;

    public Stock(String symbol, double sharePrice)
    {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    public Stock(Stock object2)
    {
        symbol = object2.symbol;
        sharePrice = object2.sharePrice;
    }

    public Stock(String sym)
    {
        this(sym, 0.0);
    }

    public String getSymbol()
    {
        return symbol;
    }

    public double getSharePrice()
    {
        return sharePrice;
    }

    public String toString()
    {
        String str = "Trading symbol: " + symbol + "\nShare price: "
    + sharePrice;

        return str;
    }

    public boolean equals(Stock object2)
    {
        boolean status;

        if (this.symbol.equals(object2.symbol) && this.sharePrice == object2.sharePrice)
            status = true;
        else
            status = false;

        return status;
    }

    public Stock copy()
    {
        Stock copyObject = new Stock(symbol, sharePrice);

        return copyObject;
    }
}
