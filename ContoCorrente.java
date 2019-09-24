class  ContoCorrente
{
	
	private String nome;
	private String cognome;
	private double saldo;
	
	public ContoCorrente(){


	}
	
	
	public ContoCorrente(String nome,String cognome){

		this.nome=nome;
		this.cognome=cognome;


	}

	public void setNome(String nome){

		this.nome=nome;
	}

	public void setCognome(String cognome){

		this.cognome=cognome;
	}

	public void setSaldo(double saldo){

		this.saldo=saldo;
	}

	public String getNome(){

		return nome;
	}
	
	public String getCognome(){

		return cognome;
	}

	public double getSaldo(){

		return saldo;
	}
}
