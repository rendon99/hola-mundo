package ejerciciosJava3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      
      System.out.println("introducir un numero del 1 al 7");
      int num = in.nextInt();
      
		
		switch(num){
		
		case (1):System.out.println("es lunes");
		break;
		
		case (2):System.out.println("es martes");
		break;
		case(3):System.out.println("es miercoles");
		break;
		case(4):System.out.println("es jueves");
		break;
		case(5):System.out.println("es viernes");
		break;
		case(6):System.out.println("es sabado");
		break;
		case(7): System.out.println("es domingo");
		break;
		
		}
	}
	

}
