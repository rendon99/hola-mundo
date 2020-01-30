import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class añoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      
      System.out.println("introducir un año");
      int año = in.nextInt();
      
     if ((año %4 == 0)  && (año%100 != 0)){
    	 System.out.println("el año es bisiesto");
     }
     else{
    	 if ((año %4 == 0) && (año %100 == 0) && (año %400 == 0)){
    		 
    		 System.out.println("el año  es bisiesto");
    		 
    	 }
    	 else{
    		 
    			 System.out.println("el año no es bisiesto");
    		 }
    	 }
     }
      
      
      
      
	}


