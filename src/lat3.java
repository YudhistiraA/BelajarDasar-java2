/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arya Rajasa
 */
public class lat3 {
    public static void main (String[]args){
        //ganjil
        int x;
        for (x = 1 ; x<20;x+=2){
            System.out.print(x + " " );
        }
       //genap
        for (x = 2 ; x<20;x+=2){
            System.out.print(x + " " );}
            
            
              //while ganjil
              x=1;
              while(x<=20){
                  
         System.out.print(x + " " );x+=2;
         
    }//genap while
          x=2;
              while(x<=20){
                  
         System.out.print(x + " " );x+=2; }
              
              // do while ganjil
              x = 1;
              do {System.out.print(x + " " );
              x+=2; }
              while (x<=20);
                      
                // do while genap
              x = 2;
              do {System.out.print(x + " " );
              x++; }
              while (x<=20);
                      
    }
    
}
