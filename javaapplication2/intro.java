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
public class intro {

    /**
     * @param args the command line arguments
     */
            //    static int n;//Shared Variable;
      //*********Instance *********************
            //    int a=5;//Instance variable
            //    void s(){
            //        a++;   //Instance Methods
            //    }
            //    void show(){
            //           System.out.print(a); //Instance Method
            //     } 
//    //** Static *****************
//    int n1=5;
//    static int n2=6,n3=7,n4=0;
//    static {
//        intro obj=new intro();
//        System.out.println(obj.n1);    //Static Block.....
//        System.out.println(n3);
//   }
//    static int c=0;
//    intro(){
//     c++;
//    }
  public static void main(String[] args) {
        //*************Autoboxing Unboxing Wrapping Class Type Casting**************
        //            	int a =20; //Simple variable declaration
        
        
        //		Integer b= a;//AutoBoxing
        //		Integer c=new Integer(30);//Assigning Value to wrapping class
        //		Integer d=Integer.valueOf(a);//Autoboxing Mannualy
        //		int f=c;//Unboxing Automatically
        //		int j=c.intValue();//Unboxing Manually 
        //		System.out.println(a);//print ln for one line space
        //		System.out.println(b);
        //		//System.out.println(c+d);//Doubt?????
        //		System.out.println(d);
        //		System.out.println("Hello Java");
        //		System.out.print("JAva");//Normal in same line
        //		System.out.print("JAva"+a+d);//Write in a single line
        //                int l=10;
        //                double k;
        //                k=l;//Automatic widening
        //                double m=1;
        //                int o;
        //                o=(int)m;
        
        

             //                System.out.print(n);// Can be used directly calling of shared variable
            //                System.out.print(a);// throw an error because instance variable can only be used in  instance method;
            
        
            //intro n2= new intro();//Instance variable should be call like this
           //System.out.print(n2.a);
           // intro obj=new intro();
            // obj.s();
            //            intro obj1=new intro();//Named Object
            //            obj1.show();
            //            new intro().s();//Always Allocate the new memory each time
            //            new intro().show();//Unnamed Object
            //     
//          intro c1=new intro();
//          intro c2=new intro();
//          intro c3=new intro();
//          System.out.println(c);
  
    //***********Function Overloading***************
        // If two function have same identical signature we cannot do a function overloading
        // Function signature consist of function name number of parameter and sequence of parameter
        //Function Overloading is performed at compile time
        // In case of a function overloading if the argument type and parameter type is mismatching but parameter datatype have wider range then
            //Compiler will automatically prefer type casting but not vice versa.
            // If a data passed using argument matches the higher datatype argument or can be typecasted to higher datatype argument then the overloaded function 
            //Which will have the higher datatype will be called and lower one will be ignored 
        //    void abc(int ,float){}
        //    void abc(int, double){}
        //    abc(3,2.5)//Second one will be called;
        //    void abc(int,int);
        //    void abc('A',56)//int will type cast into char widening
        //      
      // Two types are there default and parameterized
     // Same case with constructor and constructor cannot be static;
      
    
	}
	

  }
