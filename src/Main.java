import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosTercerizados;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários deseja informar? ");
		int f = sc.nextInt();

		List<Funcionarios> lista = new ArrayList<>();

		for (int i = 1; i <= f; i++) {
			System.out.printf("\n\nFuncionário #" + i + "\nNome: ");
			String nome = sc.next();
			System.out.printf("Quantidade de horas trabalhadas: ");
			Integer horaTrab = sc.nextInt();
			System.out.printf("Valor por hora (R$): ");
			Double valHora = sc.nextDouble();
			System.out.printf("Esse funcionário é terceirizado (s/n)? ");
			char c = sc.next().charAt(0);
			if (c == 's' || c == 'S') {
				System.out.printf("Taxa adicional do terceirizado: ");
				Double adicional = sc.nextDouble();
				Funcionarios func = new FuncionariosTercerizados(nome, horaTrab, valHora, adicional);
				lista.add(func);
			} else {
				Funcionarios func = new Funcionarios(nome, horaTrab, valHora);
				lista.add(func);
			}
		}
		for (Funcionarios x : lista) {
			System.out.printf("\n\nNome: " + x.getNome() + "\nSalário: " + x.pagamento());
		}
		sc.close();
	}

}
