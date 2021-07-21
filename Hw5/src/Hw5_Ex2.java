public class Hw5_Ex2 {
    public static void main(String[] x) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>(5);
        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.print("Please enter 5 integers: ");
        for (int i = 1; i <= 5; i++)
            list.add(input.nextInt());
        input.close();

        sort(list);
        System.out.print(list);
    }
    public static void sort(java.util.ArrayList<Integer> list) {
        for (int i = 4; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (list.get(j) > list.get(j + 1)) {
                    list.add(j, list.get(j + 1));
                    list.remove(j + 2);
                }
    }
}
