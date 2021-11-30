package example.ex;

public class Prob {

  public static void main(String[] args) {
    int[] array = {3,24,1,55,17,43,5};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length-1; j++) {

        int temp = array[j];
        if (array[j]> array[j+1]) {
          array[j] = array[j+1];
        }
        array[j+1] = temp;
      }
    }


  }

}
