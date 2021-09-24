package estruturadados.fila.teste;

public class Paciente implements Comparable<Paciente> {
	
	// Exempolo de compareTo, metodo que usa atributos da classe para comparar, facilitando tomadas de decisoes como um IF

	private String nome;
	private Integer prioridade;

	public Paciente() {
		super();
	}

	public Paciente(String nome, Integer prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public int compareTo(Paciente o) {

		if (this.prioridade > o.getPrioridade()) {
			return 1;
		} else if (this.prioridade < o.getPrioridade()) {
			return -1;
		}

		return 0;
	}

}
