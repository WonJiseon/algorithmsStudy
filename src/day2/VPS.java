package day2;
import java.io.*;
import java.util.*;

public class VPS {
  static Stack stack;

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    int num = keyScan.nextInt();

    for (int i = 0; i < num; i++) {
      String s = keyScan.next();
      isVPS(s);
    }
  }

  static void isVPS(String s) {
    stack = new Stack();
    char[] charArr = s.toCharArray();
    
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == '(') {
        stack.push(charArr[i]);
      } else {
        if(stack.empty()) {
          System.out.println("NO");
          return;
        } else {
          if ((char)stack.peek() == '(') {
            stack.pop();
          }  
        }
      }
    }
    
    if (stack.empty())
      System.out.println("YES");
    else 
      System.out.println("NO");
  }
}