import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite um n�mero:");
			num = leitor.nextInt();
		}
		
		if(num>20)		
		   System.out.println(num);
		
		
	}

}
