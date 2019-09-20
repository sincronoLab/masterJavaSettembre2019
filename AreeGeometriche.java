class AreeGeometriche 
{
	public static void main(String[] args) 
	{	
		int a=20;

		Quadrato q = new Quadrato();

		q.setLato(a);

		q.setArea();

		System.out.println("L'area del quadrato e "+ q.getArea());
	}
}
