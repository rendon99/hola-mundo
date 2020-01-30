import java.util.Scanner;

public class ascensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner in = new Scanner(System.in);
		
		System.out.println("introducir el numero");
		
		int piso = in.nextInt();
		
		if (piso > 12){ 
			piso --;
		}
			System.out.println("el ascensor tiene que ir realmente al piso" + piso );
		}
		
		
		
		
		
		
		
	}


