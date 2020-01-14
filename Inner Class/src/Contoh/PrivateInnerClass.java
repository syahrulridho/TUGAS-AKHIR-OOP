/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author windows
 */
public class PrivateInnerClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

class MyMainClass {
  public static void main(String[] args) {
    PrivateInnerClass myOuter = new PrivateInnerClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}


