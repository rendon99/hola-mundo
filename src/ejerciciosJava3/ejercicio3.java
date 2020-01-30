package ejerciciosJava3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
    System.out.println("introducir una letra");
    
    String vocal = br.readLine();
    
    switch (vocal){
    case ("A"): System.out.println("esto es una vocal");
    break;
    
    case ("a"): System.out.println("esto es una vocal");
    break;
    
    case ("E"): System.out.println("esto es una vocal");
    break;
    
    case ("e"): System.out.println("esto es una vocal");
    break;
    
    case ("I"): System.out.println("esto es una vocal");
    break;
    case ("i"): System.out.println("esto es una vocal");
    break;
    case ("O"): System.out.println("esto es una vocal");
    break;
    case ("o"): System.out.println("esto es una vocal");
    break;
    case ("U"): System.out.println("esto es una vocal");
    break;
    case ("u"): System.out.println("esto es una vocal");
    break;
    default:System.out.println("esto no es una vocal");
	}
	}
}
