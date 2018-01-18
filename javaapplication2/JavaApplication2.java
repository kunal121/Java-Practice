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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	int a =20; //Simple variable declaration
		Integer b= a;//AutoBoxing
		Integer c=new Integer(30);//Assigning Value to wrapping class
		Integer d=Integer.valueOf(a);//Autoboxing Mannualy
		int f=c;//Unboxing Automatically
		int j=c.intValue();//Unboxing Manually 
		System.out.println(a);//print ln for one line space
		System.out.println(b);
		//System.out.println(c+d);//Doubt?????
		System.out.println(d);
		System.out.println("Hello Java");
		System.out.print("JAva");//Normal in same line
		System.out.print("JAva"+a+d);//Write in a single line
	}
	

  }
