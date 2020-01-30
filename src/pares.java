import java.util.Scanner;

public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner (System.in);
       
		System.out.println("introducir un numero");
		int numero = in.nextInt();
		
		if (numero%2==0){                        
			System.out.println("es numero par");
		}
		else{
			System.out.println("es numero impar");
		}
	}

}
