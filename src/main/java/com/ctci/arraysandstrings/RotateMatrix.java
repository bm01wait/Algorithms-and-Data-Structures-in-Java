package com.ctci.arraysandstrings;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author rampatra
 * @since 2019-01-20
 */
public class RotateMatrix {
     // Function to rotate the matrix in a clockwise
    // direction
    public static void
    rotateMatrix(List<List<Integer> > matrix) {
        int n = matrix.size();
 
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }
 
        // Reverse the columns
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix.get(j).get(i);
                matrix.get(j).set(i, matrix.get(k).get(i));
                matrix.get(k).set(i, temp);
            }
        }
    }
 
    // Function to print the matrix
    public static void
    printMatrix(List<List<Integer> > matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j)
                                 + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        List<List<Integer> > matrix = new ArrayList<>();
        matrix.add(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        });
        matrix.add(new ArrayList<Integer>() {
            {
                add(4);
                add(5);
                add(6);
            }
        });
        matrix.add(new ArrayList<Integer>() {
            {
                add(7);
                add(8);
                add(9);
            }
        });
        System.out.println("Original matrix:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Rotated matrix:");
        printMatrix(matrix);
    }
}
