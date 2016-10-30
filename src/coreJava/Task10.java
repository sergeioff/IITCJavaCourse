package coreJava;

/**
 * Consider the following array of sorted integers:
 10,15,25,30,33,34,46,55,78,84,96,99
 Using the binary search algorithm, search for 23.
 Show the sequence of array elements that are compared, and for each comparison,
 indicate the values for low and high.
 */
public class Task10 {
    private static final int[] sortedArray = {10, 15, 25, 30, 33, 34, 46, 55, 78, 84, 96, 99};

    public static void main(String[] args) {
        System.out.println(binarySearch(10, sortedArray));
        System.out.println();
        System.out.println(binarySearch(15, sortedArray));
        System.out.println();
        System.out.println(binarySearch(25, sortedArray));
        System.out.println();
        System.out.println(binarySearch(30, sortedArray));
        System.out.println();
        System.out.println(binarySearch(33, sortedArray));
        System.out.println();
        System.out.println(binarySearch(34, sortedArray));
        System.out.println();
        System.out.println(binarySearch(46, sortedArray));
        System.out.println();
        System.out.println(binarySearch(55, sortedArray));
        System.out.println();
        System.out.println(binarySearch(78, sortedArray));
        System.out.println();
        System.out.println(binarySearch(84, sortedArray));
        System.out.println();
        System.out.println(binarySearch(96, sortedArray));
        System.out.println();
        System.out.println(binarySearch(99, sortedArray));
    }

    private static int binarySearch(int value, int[] array) {
        return binarySearch(value, array, 0, array.length);
    }

    private static int binarySearch(int value, int[] array, int low, int high) {
        System.out.printf("low: %d\thigh: %d\n", low, high);
        int centerIdx = (high + low) / 2;

        if (centerIdx == 1) {
            for (int i = low; i < high ; i++) {
                if (sortedArray[i] == value) return i;
            }

            return -1;
        }

        int centerElement = array[centerIdx];

        System.out.printf("Comparing %d and %d\n", value, centerElement);

        if (value == centerElement) {
            return centerIdx;
        }

        if (value > centerElement) {
            low = centerIdx;
        } else if (value < centerElement) {
            high = centerIdx;
        }

        return binarySearch(value, array, low, high);
    }
}
