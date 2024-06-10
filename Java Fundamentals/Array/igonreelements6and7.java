public class igonreelements6and7 {
  public static void main(String args[]) {
    int[] a = {3, 6, 5, 7, 1};
    int n = a.length;
    int sum = 0;
    boolean flag = false;

    for (int num : a) {
      if (num == 6) {
        flag = true;
      } else if (num == 7) {
        flag = false;
      } else if (!flag) {
        sum += num;
      }
    }

    System.out.println("Sum: " + sum);
  }
}
