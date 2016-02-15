package test;

import java.util.*;

public class ArrayEx1 {
  public static void main (String [] args) {

    int[] arr = {1,3,2};

    System.out.println("Given: arrayExerMethod(arr,3);");
    System.out.println("Result: " +arrayExerMethod(arr,3));
    System.out.println("Given: arrayExerMethod(arr,9);");
    System.out.println("Result: " +arrayExerMethod(arr,9));
    System.out.println("Given: arrayExerMethod(arr,0);");
    System.out.println("Result: " +arrayExerMethod(arr,0));
  }

  private static int arrayExerMethod(int [] numArray, int inputNum) {
    Arrays.sort(numArray);
    int search = Arrays.binarySearch(numArray,inputNum);

    if(search < 0)
      search = 0;

    return search;
  }
}
