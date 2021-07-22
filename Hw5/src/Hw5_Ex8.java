import javax.lang.model.util.ElementScanner6;

public class Hw5_Ex8 {
    public static void main(String[] x) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        System.out.printf("The decimal equivalent is: %d", hex2Dec(input.next()));
        input.close();

    }
    public static int hex2Dec(String hex) {
        int value;
        if (hex.length() == 0)
            return 0;
        if (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')
            value = hex.charAt(0) - 55;
        else if (hex.charAt(0) >= 'a' && hex.charAt(0) <= 'f')
            value = hex.charAt(0) - 87;
        else
            value = hex.charAt(0) - 48;
            
        value *= Math.pow(16, hex.length() - 1);
        return value + hex2Dec(hex.substring(1));
    }
}
