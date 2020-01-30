import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class entradasalida {

	private static Object in;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	System.out.println("dime tu nombre");
	String nombre = in.nextLine();
	
    System.out.println ("dime tu edad");
    int edad = in.nextInt();
    
    
    
    

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
    System.out.println ("dime tu estado civil");
    
    String estado = in.nextLine();
   estado = br.readLine();

   
    System.out.println("hola me llamo " + nombre + " tengo " + edad + " años " + " y estoy " + estado);
	
    System.out.println("dentro de 5 años tendre " + (edad + 5));
	
			

	
	
	
		
	}

}
