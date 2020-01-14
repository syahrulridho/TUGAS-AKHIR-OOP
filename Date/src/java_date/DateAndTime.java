/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_date;

/**
 *
 * @author windows
 */
    import java.time.LocalDateTime; // import the LocalDateTime class

public class DateAndTime {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}


