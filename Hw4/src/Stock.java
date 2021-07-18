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
