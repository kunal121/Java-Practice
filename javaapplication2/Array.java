package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kunal kalra
 */
import java.util.*;
public class Array {
    void display(int[] arr){ //Recieving Array
     for(int i:arr){
        System.out.println(i); //For Each Loop
        }       
    }
    public static void main(String X[]){
    int arr[];
    int [] arr1;//Intialization of array
    int arr2[]={33,3,4};//Intialize at run time
    arr=new int[5];//default value 0 int //String->Null //float=0.0
    Scanner obj=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
          arr[i]=obj.nextInt();
    }
    Array o1=new Array();//Passing array into function
    o1.display(arr);
//    for(int i:arr){
//        System.out.println(i); //For Each Loop
//    }
    
    }
    
}
