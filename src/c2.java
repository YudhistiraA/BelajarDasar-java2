/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Arya Rajasa
 */
public class c2 {
    public static void main (String[]args){
        int x;
        int y;
        Scanner yudhis = new Scanner (System.in);
          System.out.println( " masukan nilai akhir : ");
        y = yudhis.nextInt();
         
       
        for(x=1;x <= y ;x++){
            System.out.print(x + " ");
        }
      //while
      x=1;
      while(x<=y){
          System.out.println(x + " ");x++;
      }
        //do while
        x=1;
        do{System.out.println(x + " ");x++;
        
        }while(x<=y);
                
    }
    
}
