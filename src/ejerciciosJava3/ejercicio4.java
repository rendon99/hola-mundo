package ejerciciosJava3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("INTRODUCE LA HORA");
        int hora= in.nextInt();
        System.out.println("introduce los minutos");
        int minutos = in.nextInt();
        System.out.println("introduce los segundos");
        int segundos = in.nextInt();
        
        minutos += 15;
        
        if(minutos>=60){
        minutos -=60;
        hora++;
        if (hora>23){
        	hora -=24;
        	
        	System.out.println("pasados 15 mintos seran las: "+ hora +":"+minutos + ":" +segundos);
        }
        
        }
        }

}
