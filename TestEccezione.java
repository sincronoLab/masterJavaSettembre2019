class TestEccezione 
{


	public static void main(String[] args) 
	{
		String x=javax.swing.JOptionPane.showInputDialog("INSERISCI LA STRINGA DA VERIFICARE");
		

		try
		{
			Servizio.contaCaratteri(x);
		}
		catch (MiaEccezione t)
		{

			System.out.println(t.getMessage());
		}

		
		
		
	}
}
