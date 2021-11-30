package project.test;

import java.util.Arrays;

public class Prob {

  public static void main(String[] args) {
    int[] array = {3, 24, 1, 55, 17, 43, 5};
    for(int i=0; i<array.length-1; i++) {
      for(int j=i+1; j<array.length; j++) {
        if(array[i]>array[j]) {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }

}
