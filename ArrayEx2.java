package test;

import java.util.*;

public class ArrayEx2 {
  public static void main (String [] args) {

    int[][] arr = {{1,2,3},{8,12,3,7},{9,-4,8,-3,4}};

    System.out.println("Given: arrayExerMethod(arr);");
    arrayExerMethod(arr);
  }

  private static void arrayExerMethod(int [][] numArray) {
    int sum;
    boolean flag = false;
  OUTER_LOOP:for (int[] inner : numArray) {
    sum = 0;
    INNER_LOOP:for (int num : inner)
        {
          sum += num;
        if(sum >=20) {
          flag = true;
          break OUTER_LOOP;
        }
      }
      if(flag == false)
        System.out.println("Result: "+sum);
    }

      if(flag == true)
        System.out.println("Bye");
}
}
