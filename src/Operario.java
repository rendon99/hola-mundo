import java.util.Scanner;

public class Operario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    
    
    System.out.println("introducir el sueldo ");
    int sueldo = in.nextInt();
    
    System.out.println("introducir antiguedad");
    int antiguedad = in.nextInt();
    
    if((sueldo<500)&&(antiguedad>=10)){
    	System.out.println((sueldo * 0.2) + sueldo);
    
    	
    }
    else{
    	if((sueldo<500)&&(antiguedad<10)){    
    		System.out.println(((sueldo * 0.05)+sueldo));
    	
    	}
    	else{
    		System.out.println(sueldo);
    	}
    	}
    
    
    
    
    
	}

}
