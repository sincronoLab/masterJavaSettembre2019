class Servizio 
{
	

	public static void contaCaratteri(String stringaDaVerificare) throws MiaEccezione
	{
			
			if (stringaDaVerificare.length()<2 || stringaDaVerificare.length()>6)
			{
				throw new MiaEccezione("sono valide solo stringhe comprese tra 2 e 6 caratteri");
			}

	}




}
