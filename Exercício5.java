import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite um n�mero");
			  num = leitor.nextInt();
			  
		
		if(num % 2 ==0)
			System.out.println ("O n�mero digitado � par.");
		
		else
			System.out.println ("O n�mero digitado � �mpar.");	
	}

}
}