# Merge Sort and Parallel Merge Sort

This repository contains Java implementations of merge sort and its parallel version, designed for efficiently sorting arrays.

## Merge Sort

### Overview

Merge sort is a classic sorting algorithm known for its stability and guaranteed O(n log n) time complexity. The key steps include:

1. **Divide:** Split the array into two halves.
2. **Conquer:** Recursively sort the two halves.
3. **Merge:** Merge the sorted halves to produce a single sorted array.

### Implementation

The Java code for normal merge sort is available in the [`NormalMergeSort.java`](NormalMergeSort.java) file. To use it, provide an array of integers as input, and the program will output the sorted array.

```bash
javac NormalMergeSort.java
java NormalMergeSort
```

# Parallel Merge Sort

### Overview

Parallel merge sort extends the normal merge sort to take advantage of parallelism, particularly in multi-core systems. It parallelizes the recursive sorting step to improve overall performance.

Implementation
The Java code for parallel merge sort is available in the ImprovedParallelMergeSort.java file. It introduces parallelism and allows you to control the depth of parallel execution.
```bash
javac ImprovedParallelMergeSort.java
java ImprovedParallelMergeSort
```

### Adjusting Parameters
Sequential Threshold: Adjust SEQUENTIAL_THRESHOLD in the code to control when the algorithm switches from parallel to sequential execution. Experiment with different values based on the characteristics of the input data.

### Depth: The depth parameter in the main method determines the maximum depth of recursion for parallel execution. Experiment with different values based on the size of the array and your system's capabilities.

### Testing
To test the algorithms, provide an input array in a file named input.txt. Each line of the file should contain an integer. The output will be saved to output.txt.