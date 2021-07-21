public class Hw5_Ex1 {
    public static void main(String[] x) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please Enter 10 integers: ");
        for (int i = 1; i <= 10; i++)
            list.add(input.nextInt());
        removeDuplicates(list);
        System.out.println(list);
        input.close();
    }
    public static void removeDuplicates(java.util.ArrayList<Integer> list) {
        java.util.ArrayList<Integer> newList = new java.util.ArrayList<Integer>();

        for(Integer ele : list)
        {
            if(!newList.contains(ele))
                newList.add(ele);
        }
        list.clear();
        for (int i = 0; i < newList.size(); i++) 
            list.add(newList.get(i));
    }
}