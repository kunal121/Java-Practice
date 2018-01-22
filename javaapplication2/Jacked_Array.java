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
public class Jacked_Array {
    public static void main(String X[]){
        String n[][]=new String[2][];
        n[0]=new String[5];
        n[1]=new String[3];
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<n.length;i++){
        for(int j=0;j<n[i].length;j++){
        n[i][j]=obj.next();
        }
        }
        
        for(String i[]:n){
        for(String j:i ){
            System.out.print(j);
        }
        }
        
    }
    
}
