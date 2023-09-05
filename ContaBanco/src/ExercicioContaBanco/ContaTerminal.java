package ExercicioContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		double saldo = 237.48;
		
		System.out.print("Por favor, digite o número da agencia: ");
		String AGENCIA = sc.next();
		
		System.out.print("Por favor, digite o número da conta (O dígito entra sem o -): ");
		int Numero = sc.nextInt();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nomeCliente = sc.next();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + AGENCIA + ", conta " + Numero + ", e seu saldo de R$ " + saldo + " já está disponível para saque");
		
	}

}
