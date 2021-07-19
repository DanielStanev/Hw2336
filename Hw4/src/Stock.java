/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #02
 Version:        Java SE 11 (LTS)

 Description: Stock Class for
 exercise 2.

 *************************************/

public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    // constructor
    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // returns percent change from previous day
    double getChangePercent() {
        return 100 * ((currentPrice - previousClosingPrice) / previousClosingPrice);
    }
}
