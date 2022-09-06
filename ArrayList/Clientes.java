package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Clientes {
	
	Random aleatorio = new Random();
	
	static List<Clientes> lista = new ArrayList<>();
	
	
	private int idCliente;
	private String nome;
	private String telefone;
	private String email;
	private int idade;
	
	public void novosClientes(String nome, String telefone, String email, int idade) {
		
		this.idCliente=aleatorio.nextInt(1,1000);
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
		this.idade=idade;
		
	}
	
	
	public boolean listaCliente(Clientes clientes) {
		return lista.add(clientes);
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
	
	
	

}
