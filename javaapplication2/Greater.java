/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.*;
/**
 *
 * @author kunal kalra
 */
public class Greater {
     public static void main(String[] args) {
           Scanner obj=new Scanner(System.in);
           System.out.println("Enter the number you want to compare with");
           int a=obj.nextInt();
           int b=obj.nextInt();
           if(a>b){
               System.out.println(a);
           }
           else{
               System.out.println(b);
           }
     
     }
    
}
