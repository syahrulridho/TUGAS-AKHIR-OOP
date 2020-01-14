/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_attribute;

/**
 *
 * @author windows
 */
public class Multiple_object {
     int x = 900;

  public static void main(String[] args) {
    Multiple_object myObj1 = new Multiple_object();  // Object 1
    Multiple_object myObj2 = new Multiple_object();  // Object 2
    myObj2.x = 255;
    System.out.println(myObj1.x);  // Outputs 900
    System.out.println(myObj2.x);  // Outputs 255
  }
}
