import java.util.Scanner;

public class calcularRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in =  new Scanner (System.in);
		
		final double PI = 3.1416;
		
		System.out.println("introduce el radio");
		double radio = in.nextDouble();
		
		
		double resultado = 2 * PI * radio;
		
		
		System.out.println ("la longitud de la cincunferencia es : "+resultado);
		 resultado = PI * radio * radio * radio;
	     System.out.println("el area de la circunferencia es :"+resultado);
	 
		
		
		
		
		
		
		
	}
	
	
	

}
