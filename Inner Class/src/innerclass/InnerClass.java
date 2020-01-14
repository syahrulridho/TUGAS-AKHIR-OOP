/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author windows
 */



public class InnerClass {
    
    //Class dalam/Inner Class Static
    private static class Programming{
        private String language;
        private void setLanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance dari Kelas Dalam (Programming)
        InnerClass.Programming MyLanguage = new InnerClass.Programming();
        
        //Memasukan Nilai/Value
        MyLanguage.setLanguage("Java");
        
        //Menampilkan Hasil Output
        System.out.println("Saya Sedang Mempelajari: "+MyLanguage.getLanguage());
    }
}

