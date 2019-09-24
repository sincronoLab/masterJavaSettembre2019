class AperturaConti 
{
	public static void main(String[] args) 
	{

		
		ContoCorrente x=new ContoCorrente("Mario","Rossi");
		ContoCorrente z=new ContoCorrente();
		
		System.out.println("nome del correntista  "+x.getNome());
		System.out.println("cognome del correntista  "+x.getCognome());

		x.setSaldo(1000);

		//ContoConInteressi y=new ContoConInteressi();



		//y.setInteresse(10);
		//y.setSaldo(1000);

		System.out.println("saldo attuale ContoCorrente:"+x.getSaldo());

		//System.out.println("saldo attuale ContoConInteressi:"+y.getSaldo());
	}
}
