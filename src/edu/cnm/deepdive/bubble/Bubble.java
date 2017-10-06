package edu.cnm.deepdive.bubble;

/**
 * Page 141 Bubble Program
 */
public class Bubble {

  public static void main(String agrs[]) {
    int nums[] = {8, 5, 10, 2, 3, 6, 9, 7, 4, 1};

    int a, b, t;
    int size;

    size = 10;  //number of elements to sort

    //display orig array
    System.out.print("Original array is:");
    for (int i=0; i < size; i++) {
      System.out.print(" " + nums[i]);
      //System.out.println();
    }

      for (a = 1; a < size; a++)
        for (b = size - 1; b >= a; b--) {
          if (nums[b - 1] > nums[b]) {
            //exchange elements
            t = nums[b - 1];
            nums[b - 1] = nums[b];
            nums[b] = t;
          }
        }

      //display sorted array
      System.out.print("\nSorted array is:");
      for (int i = 0; i < size; i++)
        System.out.print(" " + nums[i]);
      System.out.println();
    }
  }
