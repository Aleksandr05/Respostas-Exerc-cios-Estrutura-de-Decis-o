import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leitor = new Scanner(System.in)) {
			float num;
			
			
			System.out.printf("Digite um n�mero");
			num = leitor.nextFloat();
			
			if(num>0) 
				System.out.println("O n�mero digitado � positivo");
			
			else
			     System.out.println("O n�mero digitado � negativo");
		}
		
		
		
		
		
	}

}
