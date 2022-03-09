package entities;

public class ImpleAluguel {

	private int aluguel;
	private String nome;
	private String email;
	private int quarto;

	public ImpleAluguel(int aluguel, String nome, String email, int quarto) {
		this.aluguel = aluguel;
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public ImpleAluguel() {

	}

	public int getAluguel() {
		return aluguel;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

}
