package ArrayList;


import java.util.Iterator;

import java.util.Scanner;

public class CadastroCliente {
	
	
	private static Scanner ler2;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler2 = new Scanner(System.in);
	
		String nome = "",telefone = "",email="";
		int id=0, op=0, idade=0;
		
		while(op!=5) {
			
			 Clientes clientes = new Clientes();
			
			System.out.println("(1) Cadastro (2) Listar (3) Buscar (4) Excluir Cliente (5) Sair");
			op=ler.nextInt();
			
			switch(op) {
			
			case 5: System.out.println("Finalizando Sistema......");
			        ler.close();
			        break;
			        
			case 1:  
				     System.out.println("Nome: ");
			         nome = ler.next();
			        
			         System.out.println("Telefone: ");
			         telefone = ler.next();
			      
			         System.out.println("Email: ");
			         email = ler.next();
			         
			         System.out.println("Idade: ");
			         idade = ler.nextInt();
			         
			         clientes.novosClientes(nome, telefone, email, idade);
			         
			         clientes.listaCliente(clientes);
			       
			         System.out.println("\n Cadastro Finalizado com sucesso!");
			         
			         break;
			         
			case 2:   
				     for(Clientes c: Clientes.lista) {
				    	 
				    	 System.out.println("-----------------------------------");
				    	 System.out.println("ID: "+c.getIdCliente());
				    	 System.out.println("Nome: "+c.getNome());
				    	 System.out.println("Telefone: "+c.getTelefone());
				    	 System.out.println("Email: "+c.getEmail());
				    	 System.out.println("Idade: "+c.getIdade());
				    	 System.out.println("-----------------------------------");
				    	 
				    	 
				     }
				     
				     break;
				     
			case 3:  
				       System.out.println("Digite o Id do cliente: ");
				       id=ler2.nextInt();
				       
				       for(Clientes c:Clientes.lista) {
				    	   clientes = c;
				    	  if(id==clientes.getIdCliente()) {
				    		  
				    		  System.out.println("-----------------------------------");
						    	 System.out.println("ID: "+c.getIdCliente());
						    	 System.out.println("Nome: "+c.getNome());
						    	 System.out.println("Telefone: "+c.getTelefone());
						    	 System.out.println("Email: "+c.getEmail());
						    	 System.out.println("Idade: "+c.getIdade());
						    	 System.out.println("-----------------------------------");
				    	
				    	  }
				    	   
				    	   
				       }
				       
				       break;
				       
			case 4:    
				       Iterator<Clientes> contaIterator = Clientes.lista.iterator();
				       
				       System.out.println("Digite o id do cliente que deseja excluir: ");
				       id=ler2.nextInt();
				       
				       while(contaIterator.hasNext()) {
				    	   
				    	   if(contaIterator.next().getIdCliente()==id) {
				    		   
				    		   System.out.println("Cliente "+id+" removido com sucesso");
				    		   contaIterator.remove();
				    		   
				    	   }
				    	   
				       }
				       
			         break;
			         
			}
			
			
		}
		
	}

}
