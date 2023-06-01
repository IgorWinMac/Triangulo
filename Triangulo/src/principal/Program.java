package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o lado a: ");
		int a = entrada.nextInt();
		
		System.out.println("Informe o lado b: ");
		int b = entrada.nextInt();
		
		System.out.println("Informe a base: ");
		int c = entrada.nextInt();
		
		triangulo.medidas(a, b, c);
		
		entrada.close();

	}

}
