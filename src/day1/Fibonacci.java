package day1;

import java.util.Scanner;

public class Fibonacci {
  static int zeroCount = 0, oneCount = 0;
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    int caseNum = keyScan.nextInt();
    
    for (int i = 0; i < caseNum; i++) {
      int num = keyScan.nextInt();
      fibonacci(num);
      System.out.println(zeroCount + " " + oneCount);
      zeroCount = 0;
      oneCount = 0;
    }
  }
  
 static int fibonacci(int n) {
    if (n == 0) {
      zeroCount++;
      return 0;
    } else if (n == 1) {
      oneCount++;
      return 1;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}
