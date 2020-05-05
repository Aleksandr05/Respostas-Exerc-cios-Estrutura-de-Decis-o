import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite um número");
			  num = leitor.nextInt();
			  
		
		if(num % 2 ==0)
			System.out.println ("O número digitado é par.");
		
		else
			System.out.println ("O número digitado é ímpar.");	
	}

}
}