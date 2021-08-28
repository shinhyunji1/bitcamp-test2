package example.ch6;

public class Exercise6_20 {

  static int[] shuffle(int[] arr) {

    int temp = 0;
    for(int i = 0; i < arr.length; i++) {
      int j =  (int)(Math.random() * arr.length);
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(java.util.Arrays.toString(original));

    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }

}
