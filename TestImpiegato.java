class TestImpiegato
{
	public static void main(String[] args) {

	Impiegato x=new Impiegato();
	Manager y=new Manager();


	x.setNome("mario");
	x.setCognome("rossi");
	x.setQualifica("sportellista");
	x.setStipendio(30000);


	y.setNome("mario");
	y.setCognome("rossi");
	y.setQualifica("sportellista");
	y.setStipendio(30000);


	System.out.println("Il nome dell'impiegato e: " + x.getNome());
	System.out.println("Il cognome dell'impiegato e: " + x.getCognome());
	System.out.println("La qualifica dell'impiegato e: " + x.getQualifica());

	System.out.println("Lo stipendio dell'impiegato e: " + x.getStipendio());




	System.out.println("Il nome dell'impiegato e: " + y.getNome());
	System.out.println("Il cognome dell'impiegato e: " + y.getCognome());
	System.out.println("La qualifica dell'impiegato e: " + y.getQualifica());

	System.out.println("Lo stipendio dell'impiegato e: " + y.getStipendio());

	System.out.println("Lo stipendio del manager e: " + y.getStipendio());

	


		
}
}
