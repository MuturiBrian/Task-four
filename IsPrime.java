/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package a.isprime;

/**
 *
 * @author MINCHA
 */
public class IsPrime {
      public static boolean isPrime (int j) {

        int prime = 0;  
        for (j = 2; j < prime; j++) {
            if (prime % j == 0) {
                return false;
            }
            if (prime == j) {
                return true;
            }
        }  
        return false;
    }

 //Main method
    public static void main(String[] args) {
    {		
       int prime =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (prime = 1; prime <= 500; prime++)         
       { 		  	  
          int counter=0; 	  
          for(num =prime; num>=1; num--)
	  {
             if(prime%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + prime + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 500 are :");
       System.out.println(primeNumbers);
   }
}
   
}
    






