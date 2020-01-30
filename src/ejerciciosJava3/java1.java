package ejerciciosJava3;

import java.util.Scanner;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("introducir  numero 1");
		int num1 = in.nextInt();
		
		System.out.println("introducir numero 2");
		int num2 = in.nextInt();
		
		System.out.println("introducir numero 3");
		int num3 = in.nextInt();
		
		
			if((num1>num2)&&(num2>num3)){
		System.out.println(num1 +" ," +num2+", " +num3);
		
			}else{
				if((num1>num3)&&(num3>num2)){
					System.out.println(num1 +" ," +num3+", " +num2);
				}
				else{
				if((num2>num1)&&(num1>num3)){
					System.out.println(num2 +" ," +num1+", " +num3);
				}
				else{
				if((num3>num2)&&(num2>num1)){
					System.out.println(num3 +" ," +num2+", " +num1);
				}
				else{
					if((num2>num3)&&(num3>num1)){
						System.out.println(num2 +" ," +num3+", " +num1);
					}
					else{
						if((num3>num1)&&(num1>num2)){
							System.out.println(num3 +" ," +num1+", " +num2);
					}
					}
				}
				}
				
				
				
				}
			}
			
			
			
	}
	
	
}

