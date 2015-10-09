package paquetePiezas;


public class Torre extends Ficha {

	public Torre(String a, int j, int k) {
		super(a, j, k);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean mover(int filaAnt, int filaN, int colAnt, int colN)
	{
		boolean ban = false;
		if(filaAnt!=filaN && colAnt==colN){ban=true;} 
		if(filaAnt==filaN && colAnt!=colN){ban=true;} 
				
		return ban;
}
	
	
}
