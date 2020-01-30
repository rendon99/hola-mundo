import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sumarDividir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int num1 = in.nextInt();
		
		System.out.println("introduce el numero 2");
		int num2 = in.nextInt();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("introduce operacion");
		String operacion = br.readLine();
		
		
		
		if(operacion.equals("+")){
			System.out.println("suma =" + (num1+num2));
		}
		else{
			if(operacion.equals("-")){
				System.out.println("resta =" + (num1-num2));
			}
			else{ 
				if(operacion.equals("*")){
                  System.out.println("multiplicacion =" + (num1*num2));
				}
				else{
					if(operacion.equals("/")){
						System.out.println("division =" + (num1/num2));
						}
				}
			}
		}

	}

}
