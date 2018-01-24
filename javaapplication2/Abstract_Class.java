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
//The class in which there is no need to define object
//THese classes can contain abstract method
//One cannot create object of a abstract clsss;
abstract class A{
    abstract void run();
}
public class Abstract_Class extends A {
    void run(){
        System.out.println("ji");
    }
    public static void main(String X[]){
        A obj=new Abstract_Class();
        obj.run();     
        
    }
    
}
