import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leitor = new Scanner(System.in)) {
			int x,y;
			
			System.out.println("Digite um n�mero:");
			x=leitor.nextInt();
			System.out.println("Digite outro n�mero:");
			y=leitor.nextInt();
			
			if (x>y)
			System.out.println("Em ordem decrescente eles ficam assim: "+x+","+y);
			if (y>x)
			System.out.println("Em ordem decrescente eles ficam assim:"+y+","+x);
		}
		
	}

}
