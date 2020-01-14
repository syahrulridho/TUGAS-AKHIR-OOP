/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class MyProfile {
   long modelNim;
  String modelName;

  public MyProfile(long year, String name) {
    modelNim = year;
    modelName = name;
  }

  public static void main(String[] args) {
    MyProfile myProfile = new MyProfile(201869040018L,"Lailatul Afidah");
    System.out.println(myProfile.modelNim + " " + myProfile.modelName);
  }
} 

