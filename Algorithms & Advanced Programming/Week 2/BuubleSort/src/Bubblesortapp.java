public class Bubblesortapp {


    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Sort Pass Number " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.print("Compare " + array[j - 1] + " and " + array[j]);
                if (array[j - 1] > array[j]) {
                    System.out.println(", incorrect order, Swap");
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;

                    System.out.println("Array After Swap");
                    printArray(array);
                } else {
                    System.out.println(", correct order");
                }
            }
            if (!swapped) {
                System.out.println("No swaps this pass — array already sorted.");
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int v : array) System.out.print(v + " ");
        System.out.println();
    }


    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Sort Pass Number " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.print("Compare " + array[j - 1] + " and " + array[j]);
                if (array[j - 1].compareTo(array[j]) > 0) {
                    System.out.println(", incorrect order, Swap");
                    String tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    swapped = true;

                    System.out.println("Array After Swap");
                    printArray(array);
                } else {
                    System.out.println(", correct order");
                }
            }
            if (!swapped) {
                System.out.println("No swaps this pass — array already sorted.");
                break;
            }
        }
    }

    public static void printArray(String[] array) {
        for (String s : array) System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 4, 24, 10, 3, 33, 28, 52, 6};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("---INT ARRAY BEFORE Bubble Sort---");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("---INT ARRAY AFTER Bubble Sort---");
        printArray(arr);
        System.out.println();
        System.out.println("---STRING ARRAY (DAYS) BEFORE Bubble Sort---");
        printArray(days);
        bubbleSort(days);
        System.out.println("---STRING ARRAY (DAYS) AFTER Bubble Sort---");
        printArray(days);
 
    }
}


