import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número inteiro:");
			x = leitor.nextInt();
			
			System.out.println("Digite o segundo número inteiro:");
			y = leitor.nextInt();
		}
		if ((x+y)>10)
			System.out.println(x+y);
			
	}

}
