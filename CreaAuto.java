import javax.swing.*;
class  CreaAuto
{
	
	public static void main(String[] args) 
	{

		int v=Integer.parseInt(JOptionPane.showInputDialog("INSERISCI IL NUMERO PORTE"));
		
		
		
		Automobile x=new Automobile();

		if(x.inserisciPorte(v)){

			System.out.println( "numero delle porte attuale --> "+x.leggiNumPorte() );

		}
		

		
		
	}



}
