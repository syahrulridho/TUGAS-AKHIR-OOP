/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exception;

/**
 *
 * @author windows
 */
    public class Throw2 {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Akses Ditolak - Kamu paling tidak harus berumur 18 tahun.");
    }
    else {
      System.out.println("Akses Diterima - Kamu sudah cukup dewasa!");
    }
  }

  public static void main(String[] args) {
    checkAge(20);
  }
}
