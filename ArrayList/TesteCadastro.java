package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCadastro {
	
	private static Scanner dados1;
	private static Scanner dados;

	public static void main(String[] arg) {
		
		ArrayList<TesteArrayconta> conta = new ArrayList<> ();
		
		dados1 = new Scanner(System.in);
		dados = new Scanner(System.in);
		
		double saldo=0; int opcao =0;
		int agencia= 0; int numero=0;
		 String titular="";
		
		
		while(opcao!=2) {
			
			System.out.println("Digite 1 para se cadastrar ou 2 para sair");
			opcao = dados.nextInt();
			
			
			switch(opcao) {
			case 2:
			    
				break;
						        
			case 1:
				
		
				System.out.println("Digite o numero da sua agencia: ");
				agencia = dados.nextInt();
								
				System.out.println("Digite o numero da conta: ");
				numero=dados.nextInt();
				
				System.out.println("Digite o nome do Titular");
				titular=dados1.nextLine();
				
				System.out.println("Você ganhou 100 reias de bonus por ter se cadastrado");
				
				TesteArrayconta conta1 = new TesteArrayconta (saldo, agencia, numero,titular);
				conta.add(conta1);
				
				conta1.saldo+=100;
				
				break;
				
			}
			
		
		}
		
		for(TesteArrayconta c : conta) {
			
			System.out.println("Titular: "+c.getTitular());
			System.out.println("Agencia: "+c.getAgencia());
			System.out.println("Numero: "+c.getNumero());
			System.out.println("Saldo Atual: R$"+c.saldo);
		}
		
	
	}

}
