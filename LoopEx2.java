public class LoopEx2 {
  public static void main (String [] args) {

    int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
    String printResult = "";
    for(int num: arr2) {
      if(num%2 == 0)
      {
        printResult +="+";
      }
      else
      {
        printResult += num;
      }
    }

    int i   = 0;
    int sum=0;
    while (i < arr2.length) {
      sum += arr2[i];
      i++;
    }
    System.out.println("Sum: "+sum);

    final int quotient = sum / 10;
    switch(quotient)
    {
      case 1:
      case 2:
      printResult += "@";
      break;
      case 3:
      case 4:
      case 5:
      printResult += "#";
      break;
      default:
      printResult += "*";
    }

    System.out.println("Result: "+printResult);

  }
}
