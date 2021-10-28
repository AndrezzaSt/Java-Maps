package Classes;

import java.util.HashMap;

public class AgendaTelefonica {
	private String nome;
	private String numero;

	HashMap<String, AgendaTelefonica> agenda_map = new HashMap();

	public AgendaTelefonica() {

	}

	public AgendaTelefonica(String nome, String numero) {

		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void inserir(String nome, String numero) {
		AgendaTelefonica novo_contato = new AgendaTelefonica(nome, numero);
		agenda_map.put(nome, novo_contato);
	};

	public String buscarNumero(String nome) {
		if (agenda_map.containsKey(nome)) {
			return agenda_map.get(nome).getNumero();
		} else
			return "Numero de "+ nome + " não encontrado!";
	};

	public void remover(String nome) {
		 if(agenda_map.containsKey(nome)){
			System.out.print("Numero de " + nome + " removido!" + "\n");
			agenda_map.remove(nome);
		 } else
			 System.out.print("Numero não encontrado!");
	};

	public int tamanho() {
		return agenda_map.size();
	};
}
