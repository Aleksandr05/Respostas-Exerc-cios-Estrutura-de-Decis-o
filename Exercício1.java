import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("Digite um número:");
			num = leitor.nextInt();
		}
		
		if(num>20)		
		   System.out.println(num);
		
		
	}

}
