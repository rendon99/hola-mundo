import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class a�oBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      
      System.out.println("introducir un a�o");
      int a�o = in.nextInt();
      
     if ((a�o %4 == 0)  && (a�o%100 != 0)){
    	 System.out.println("el a�o es bisiesto");
     }
     else{
    	 if ((a�o %4 == 0) && (a�o %100 == 0) && (a�o %400 == 0)){
    		 
    		 System.out.println("el a�o  es bisiesto");
    		 
    	 }
    	 else{
    		 
    			 System.out.println("el a�o no es bisiesto");
    		 }
    	 }
     }
      
      
      
      
	}


