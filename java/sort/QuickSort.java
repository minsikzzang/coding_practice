import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort {
      static void swap(int[] ar, int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
      }

      static void quickSort(int[] ar, int low, int high) {
        if (high > low) {
          int p = ar[high];
          int stored = low;
          for (int i = low; i < high; ++i) {
            if (ar[i] < p) {
              swap(ar, stored, i);
              stored++;
            }
          }
          swap(ar, stored, high);
          printArray(ar);

          quickSort(ar, low, stored - 1);
          quickSort(ar, stored + 1, high);
        }
      }

      static void printArray(int[] ar) {
         for (int n: ar){
            System.out.print(n+" ");
         }
         System.out.println("");
      }

      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        if (n > 1) {
            quickSort(ar, 0, n - 1);
        }
    }
   }
