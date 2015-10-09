package paquetePiezas;

public class Reina extends Ficha {

	public Reina(String a, int j, int k) {
		super(a, j, k);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean mover(int filaAnt, int filaN, int colAnt, int colN)
	{
		boolean ban = false;
		if(filaAnt!=filaN && colAnt!=colN){if((Math.abs((filaN-filaAnt))==(Math.abs(colN-colAnt)))){ban=true;}} 
		if(filaAnt!=filaN && colAnt==colN){ban=true;} 
		if(filaAnt==filaN && colAnt!=colN){ban=true;} 
			
		
		return ban;
}
	

}
