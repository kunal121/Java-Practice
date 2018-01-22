package javaapplication2;

import java.util.*;
public class TwoArray {
    static void display(int [][] p){//Recieving array
    for(int i[]:p){    //First row passed 
        for(int j:i){     //printing each element of the array
        System.out.println(j);
        }
    }
    }
    public static void main(String X[]){
    int mat[][]=new int[1][2];
    Scanner obj=new Scanner(System.in);
    for(int i=0;i<1;i++){
    for(int j=0;j<2;j++){
        mat[i][j]=obj.nextInt();
        }
       }
    
//    for(int i[]:mat){    //First row passed 
//        for(int j:i){     //printing each element of the array
//        System.out.println(j);
//        }
//    }
    display(mat);//Passing two d array in function
    //System.out.println(mat.length);//Number of Rows
    //System.out.println(mat[0].length);//Number of Columns
    }
    
}
