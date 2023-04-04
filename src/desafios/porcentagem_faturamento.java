package desafios;

import java.util.Scanner;

public class porcentagem_faturamento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double sp = 67836.43;
		double rj = 36679.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double total = 180759.98;
		float porcentagem;
		int op;

		System.out.println("Qual estado você gostaria de consultar a porcentagem de faturamento?");
		System.out.println("1- SP");
		System.out.println("2- RJ");
		System.out.println("3- MG");
		System.out.println("4- ES");
		System.out.println("5- Outros");
		op = leia.nextInt();

		if (op < 0 && op > 5) {
			System.out.println("Digite uma opção válida!");
		}

		switch (op) {
		case 1:
			porcentagem = (float) ((sp * 100) / total);
			System.out.printf("A porcentagem de SP é de: %.2f", porcentagem);
			break;
		case 2:
			porcentagem = (float) ((rj * 100) / total);
			System.out.printf("A porcentagem de RJ é de: %.2f", porcentagem);
			break;
		case 3:
			porcentagem = (float) ((mg * 100) / total);
			System.out.printf("A porcentagem de MG é de: %.2f", porcentagem);
			break;
		case 4:
			porcentagem = (float) ((es * 100) / total);
			System.out.printf("A porcentagem de ES é de: %.2f", porcentagem);
			break;
		case 5:
			porcentagem = (float) ((outros * 100) / total);
			System.out.printf("A porcentagem de outros estados é de: %.2f", porcentagem);
			break;
		}

	}
}
