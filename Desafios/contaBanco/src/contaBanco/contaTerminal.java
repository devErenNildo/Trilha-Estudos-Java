package contaBanco;

import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		int numeroConta;
		String numeroAgencia;
		String nomeCliente;
		float saldoConta;
		
		System.out.println("Para começar, informe o número da sua conta !");
		numeroConta = input.nextInt();
		
		System.out.println("Agora digite o número da sua agância.");
		numeroAgencia = input.next();
		
		System.out.println("Por favor, digite seu nome !");
		nomeCliente = input.next();
		
		System.out.println("Por fim, digite o saldo da sua conta.");
		saldoConta = input.nextFloat();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque\n");

		input.close();
		
	}

}
