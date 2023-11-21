import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class NormalMergeSort {
    private static void merge(int arr[], int l, int m, int r) {
        int l_size = m - l + 1;
        int left_array[] = new int[l_size + 1];
        int r_size = r - m;
        int right_array[] = new int[r_size + 1];
        for (int i = 0; i < l_size; ++i) {
            left_array[i] = arr[l + i];
        }
        for (int i = 0; i < r_size; ++i) {
            right_array[i] = arr[m + i + 1];
        }
        left_array[l_size] = Integer.MAX_VALUE;
        right_array[r_size] = Integer.MAX_VALUE;
        int l_i = 0;
        int r_i = 0;
        for (int i = l; i <= r; ++i) {
            if (left_array[l_i] <= right_array[r_i]) {
                arr[i] = left_array[l_i++];
            } else {
                arr[i] = right_array[r_i++];
            }
        }
    }

    private static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        // Change the file paths to the locations of your input and output files
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            Scanner sc = new Scanner(new File(inputFile));

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

            long startTime = System.currentTimeMillis();

            mergeSort(arr, 0, n - 1);

            long endTime = System.currentTimeMillis();

            System.out.println("Total time taken: " + (endTime - startTime) + " milliseconds");

            // Save the sorted array to the output file
            PrintWriter writer = new PrintWriter(new File(outputFile));
            for (int i : arr) {
                writer.print(i + " ");
            }
            writer.close();

            System.out.println("Sorted array saved to " + outputFile);

            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
