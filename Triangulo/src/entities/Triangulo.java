package entities;

public class Triangulo {
	
	public void medidas(int a, int b, int c) {
		
		if((a == b) && (b == c ) && (a == c)){
			System.out.println("Equilátero");
		}else if((a != b) && (b != c) && (a != c)) {
			System.out.println("Escaleno");
		}else {
			System.out.println("Isósceles");
		}
	}

}
