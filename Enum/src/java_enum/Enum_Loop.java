/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_enum;

/**
 *
 * @author windows
 */
  enum Level1 {
  LOW,
  MEDIUM,
  HIGH
}

public class Enum_Loop {
  public static void main(String[] args) { 
    for (Level1 myVar : Level1.values()) {
      System.out.println(myVar);
    }
  } 
}



