public class Hw4_Ex2 {
    public static void main(String[] x) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");

        // The instructions for the stock class did not say to make a constructor that has a previousClosingPrice,
        // therefore I decide to just set it in main().
        stock1.previousClosingPrice = 34.5;

        // sets current price
        stock1.currentPrice = 34.35;

        // I decided to display all outputs just to make sure it works
        System.out.print("Stock 1: \n");
        System.out.print("Symbol: " + stock1.symbol + '\n');
        System.out.print("Name:   " + stock1.name + '\n');
        System.out.printf("Previous Closing Price: $%.2f\n", stock1.previousClosingPrice);
        System.out.printf("Current Price:          $%.2f\n", stock1.currentPrice);
        System.out.printf("Percent Change: %.2f%%\n", stock1.getChangePercent());
    }
}