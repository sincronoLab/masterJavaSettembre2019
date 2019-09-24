class ContoConInteressi extends ContoCorrente 
{
	
		private double tassoInteresse;
		

		public ContoConInteressi(){

		}

		public ContoConInteressi(String nome,String cognome,double interesse){
			
			
			super(nome,cognome);//passaggio dei parametri al costruttore
								//della superclasse

			tassoInteresse=interesse;

		}

		public void setInteresse(double tassoInteresse){
		
		
					this.tassoInteresse=tassoInteresse;
		
		}

		public double getInteresse(){

			return tassoInteresse;
		}

		@Override
		public double getSaldo(){

		return super.getSaldo()*tassoInteresse;
		}

}
