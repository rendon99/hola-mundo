import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    
    System.out.println("introducir un numero");
    int num1 = in.nextInt();
    
    System.out.println("introducir numero 2");
    int num2 = in.nextInt();
    
    InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
    
	System.out.println("introduce el signo");
	String operacion = br.readLine();
	
	switch(operacion){
	case("+"): System.out.println("la suma es: " + (num1+num2));
	break;
	
	case("-"): System.out.println("la resta es: " + (num1-num2));
	break;

	case("*"): System.out.println("la multiplicacion es: " + (num1*num2));
	break;

	case("/"): System.out.println("la division es: " + (num1/num2));
	break;

	
	}
	
	
	
    
	
    
    }
	}


