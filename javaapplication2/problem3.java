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
public class problem3 {
   public static void main(String X[]){
                for(int i=0;i<5;i++){
                     if(i%2!=0){
                             for(int j=5-i;j>0;j--){
                                 System.out.print(j);
                             }
                     }
                     else {
                     for(int j=1;j<5-i+1;j++){
                             System.out.print(j);
                     }
                     }
                     System.out.println();
                }
   
   } 
}
