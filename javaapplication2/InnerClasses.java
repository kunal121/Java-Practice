/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// The class that is defined inside another class the top level class can be public,final ,abstract 
// Top level class cannot be static, protected,private 
//Inner class can use methods,variables directly where outer can directly use method of inner class
package javaapplication2;

/**
 *
 * @author kunal kalra
 */
public class InnerClasses {
        int n1,n2;
        void put(){
        n1=10;
        n2=10;
        System.out.println(n1+n2);
        }
        class b{
           int n5=6;
           void show(){
               put();
           }
        }
        public static void main(String x[]){
            b obj=new InnerClasses().new b();
//            InnerClasses obj=new InnerClasses();
//            InnerClasses.b obj1=obj new b();
            obj.show();
        }
 //If the inner class contain static method we try to call outer class instance method then error will come
}
