public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    // constructors
    Tax() { }
    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    // accessors
    public int getFilingStatus()     { return filingStatus;  }
    public int[][] getBrackets()     { return brackets;      }
    public double[] getrates()       { return rates;         }
    public double getTaxableIncome() { return taxableIncome; }

    // mutators
    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }
    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++)
            System.arraycopy(brackets[i], 0, this.brackets[i], 0, brackets[i].length);
    }
    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        System.arraycopy(rates, 0, this.rates, 0, rates.length);
    }
    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0, incomeTaxed = 0;
        double income = taxableIncome;
        if (rates.length >= 2) {
            for (int i = rates.length - 2; i >= 0; i--) {
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTaxed = income - brackets[filingStatus][i]) * rates[i + 1];
                    income -= incomeTaxed;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }

}
