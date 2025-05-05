package labreport;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, 8, 2};

        // Call the method to find min and max
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }

    // Method to find minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

