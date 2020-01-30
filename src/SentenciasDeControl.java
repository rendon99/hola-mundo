import java.util.Scanner;

public class SentenciasDeControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     
     System.out.println("introducir numero 1");
     int num1 = in.nextInt();
     
     System.out.println("introducir numero 2");
     int num2 = in.nextInt();
     
     System.out.println("introducir numero 3");
     int num3 = in.nextInt();
     
     if((num1< 10) && (num2 < 10) && (num3 < 10)){
         System.out.println("todos los numeros son menos de 10");
         
      }
     
     
	}

}
