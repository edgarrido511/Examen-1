import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		Examen a = new Examen();
		//a.fizzBuzz();
		//a.primeraMayuscula();
		//a.invertirCadena();
		a.vocalesMayuscula();
		//a.palindromo();
	}
	
	public static void fizzBuzz() {
		for(int i = 1;i<=100;i++ ) {
			if(i%3==0) {
				System.out.println("Fizz");
				continue;
			}
			if(i%5==0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}
	public static void primeraMayuscula(){
		String frase = "anita lava la tina";
		String mayuscula = "";
		String newMayuscula;
		String[] sep = frase.split("");
		for(int i = 0;i<sep.length;i++) {
			mayuscula = sep[0];
			newMayuscula = mayuscula.toUpperCase();
			sep[0] = newMayuscula;
			System.out.print(sep[i]);
		}
	}
	public static void invertirCadena() {
		String frase = "anita lava la tina";
		String[] sep = frase.split("");
		for(int i = sep.length-1;i>=0;i--) {
			System.out.print(sep[i]);
		}
	}
	public static void vocalesMayuscula() {
		String frase = "Hasta luego cocodrilo";
		String[] sep = frase.split("");
		frase = frase.replace("a", "A");
		frase = frase.replace("e", "E");
		frase = frase.replace("i", "I");
		frase = frase.replace("o", "O");
		frase = frase.replace("u", "U");
		System.out.println(frase);
	}
	public static void palindromo() {
		String frase = "anita lava la tina";
		frase = frase.toLowerCase();
		String fraseJunta = frase.replace(" ","");
		String nuevaFrase = "";
		String[] sep = fraseJunta.split("");
		for(int i = sep.length-1;i>=0;i--) {
			nuevaFrase += sep[i];
		}
		boolean resultado = fraseJunta.equals(nuevaFrase);
		System.out.println(resultado);
	}
}
