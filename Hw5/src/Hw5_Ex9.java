public class Hw5_Ex9 {
    public static void main(String[] x) {
        

    }
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++)
            if (list[i].equals(key))
                return i;
        return -1;
    }
}
