package paquetePiezas;

public class Peon extends Ficha {

	public Peon(String a, int j, int k) {
		super(a, j, k);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean mover(int filaAnt, int filaN, int colAnt, int colN)
	{
		boolean ban = false;
		if(filaAnt!=filaN && colAnt==colN) { if(filaAnt+1==filaN) {ban=true;} }
		
		//estos van adentro de otro if q indica si hay ficha contraria o no
		
		if(filaAnt!=filaN && colAnt!=colN) { if(filaAnt+1==filaN && colAnt+1==colN) {ban=true;} }
		if(filaAnt!=filaN && colAnt!=colN) { if(filaAnt+1==filaN && colAnt-1==colN) {ban=true;} }
				
		return ban;
}
 
}
