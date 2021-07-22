public class Hw5_Ex10 {
    public static void main(String[] x) {
        Integer[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, 4));
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 6));
    }


    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int compare, interval;
        int index = ((list.length - 1) / 2);
        int low = 0;
        int high = list.length - 1;

        do {
            compare = list[index].compareTo(key);
            if ((high - index) > (index - low))
                interval = ((high - index) / 2);
            else 
                interval = ((index - low) / 2);
            if (high - low == 2)
                interval = 1;
            if (compare == 0)
                return index;
            if (compare > 0) {
                high = index;
                index -= interval;
            }
            else if (compare < 0) {
                low = index;
                index += interval;
            }
        } while (interval > 0);
        return -1;
    }
}
