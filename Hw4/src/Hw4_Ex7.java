public class Hw4_Ex7 {
    public static void main(String[] x) {
        Tax tax2001 = new Tax();
        double[] rates = {15, 27.5, 30.5, 35.5, 39.1};
        int[][] brackets = {{27050, 65550, 136750, 297350}, {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675}, {36250, 93650, 151650, 297350}};


        tax2001.setRates(rates);
        tax2001.setBrackets(brackets);

        System.out.print("Income:     Single:     Joint:  Separate:      Head:\n");
        for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            tax2001.setTaxableIncome(taxableIncome);
            System.out.printf("%8.0f", taxableIncome);
            tax2001.setFilingStatus(tax2001.SINGLE_FILER);
            System.out.printf("%11.2f", tax2001.getTax());
            tax2001.setFilingStatus(tax2001.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
            System.out.printf("%11.2f", tax2001.getTax());
            tax2001.setFilingStatus(tax2001.MARRIED_SEPARATELY);
            System.out.printf("%11.2f", tax2001.getTax());
            tax2001.setFilingStatus(tax2001.HEAD_OF_HOUSEHOLD);
            System.out.printf("%11.2f\n", tax2001.getTax());
        }

    }
}
