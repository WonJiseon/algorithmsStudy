package day3;

import java.util.Scanner;

public class Stack10828 { 

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int num = keyScan.nextInt();
    Stack stack = new Stack();

    for (int i = 0; i < num; i++) {
      String inputValue = keyScan.next();
      if (inputValue.equals("push")) {
        int pushNum = keyScan.nextInt();
        stack.push(pushNum);
      } else if (inputValue.equals("pop")) {
        stack.pop();
      } else if (inputValue.equals("size")) {
        stack.size();
      } else if (inputValue.equals("empty")) {
        stack.empty();
      } else if (inputValue.equals("top")) {
        stack.top();
      }
    }
  }


  static class Stack {
    int[] stackArr = new int[100000]; 
    static int top = -1;

    void empty() {
      if (top == -1)
        System.out.println(1);
      else
        System.out.println(0);
    }

    void top() {
      if (top == -1) {
        System.out.println(-1);
      } else {
        System.out.println(stackArr[top]);
      }
    }

    void size() {
      System.out.println((top + 1));
    }

    void push(int x) {
      stackArr[++top] = x;
    }

    void pop() {
      if (top == -1) {
        System.out.println(-1);
      } else {
        System.out.println(stackArr[top]);
        top--;
      }
    }
  }
}

