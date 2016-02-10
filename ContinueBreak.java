public class ContinueBreak {
  public static void main (String ... args) {
    int[] arr2 = {1,2,3,4,5,6,7,8,9,0};
    int sum = 0;
    FOR_LOOP:for(int i=0; i<arr2.length/2;i++) {
      if(arr2[i]%2==0) {
        continue FOR_LOOP;
      }
      sum += arr2[i];
    }

    System.out.println(sum);
  }
}
