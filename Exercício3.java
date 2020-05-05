import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leitor = new Scanner(System.in)) {
			float num;
			
			
			System.out.printf("Digite um número");
			num = leitor.nextFloat();
			
			if(num>0) 
				System.out.println("O número digitado é positivo");
			
			else
			     System.out.println("O número digitado é negativo");
		}
		
		
		
		
		
	}

}
