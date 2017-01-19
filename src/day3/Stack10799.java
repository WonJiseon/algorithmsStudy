package day3;

import java.util.Scanner;
import java.util.Stack;

public class Stack10799 {
  static Stack stack;
  
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    String s = keyScan.next();
    isLaser(s);
  }
  
  static void isLaser(String s) {
    stack = new Stack();
    char[] charArr = s.toCharArray();
    int count = 0;
    
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == '(') {
        stack.push(charArr[i]);
      } else {
        if (charArr[i-1] == ')') {
          stack.pop();
          count++;
        } else {
          stack.pop();
          count += stack.size();
        }
      }
    }
    System.out.println(count);
  }
}
