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
public class Area_of_rect {
    Scanner obj=new Scanner(System.in);
    int length,breadth,area;
    void input(){
        length=obj.nextInt();
        breadth=obj.nextInt();
    }
    void area(){
        area=length*breadth;
    }
    void show(){
        System.out.println(area);
    }
    public static void main(String X[]){
        Area_of_rect obj1=new Area_of_rect();
//        obj1.input();
        obj1.length=5;
        obj1.breadth=6;
        Area_of_rect obj2=obj1;//Call by refrence both will change 
                              //Copying an object into another object;
        obj2.area();
        obj2.show();
        obj1.show();
    }
    
}
