
import java.util.Scanner;

public class quadrantes {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		double x = dados.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		double y = dados.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0 ) {
			System.out.println("Eixo Y");
		}
		else if (y == 0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("quadrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("quadrante 3");
		} else {
			System.out.println("quadrante 4");
		}
		
		dados.close();
	}

}
