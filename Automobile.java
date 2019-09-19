

/**
*		classe realizzata per 
*		manipolare e creare oggetti 
*		di tipo automobile
*/
public class Automobile 
{
	
	private int cilindrata=0;
	private String colore=null;

	private int numPorte=5;

	

	/**
	*
	*	metodo che permette di inserire il numero di ruote
	*	sono validi solo i valori 3/5
	*
	*/
	public boolean inserisciPorte(int n)
	{
			boolean x=true;
			if (n<3 || n>5 || n==4)
			{
				System.out.println("numero di porte non valido");
				x=false;
			}
			else{
				numPorte=n;
			}
		return x;
	}


	/**
	*
	*	metodo che restituisce il numero attuale di porte
	*
	*/
	public int leggiNumPorte(){

		

		return numPorte;
	}
	


}
