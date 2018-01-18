/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author kunal kalra
 */

public class Numberofobj {
    static int c;
    Numberofobj(){
        c++;
    }
     public static void main(String[] args) {
          Numberofobj c1=new Numberofobj();
          Numberofobj c2=new Numberofobj();
          Numberofobj c3=new Numberofobj();
          System.out.println(c);
     
     }
}
