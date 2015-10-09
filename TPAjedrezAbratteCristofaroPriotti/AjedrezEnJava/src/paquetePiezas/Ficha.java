package paquetePiezas;

public class Ficha {
	
	String color;
	int x,y;
	String estado;
	
	
	
	
	public Ficha() {
		super();
	}


	public Ficha(String a, int j, int k)
	{
		this.color=a;
		this.x=j;
		this.y=k;
		this.estado="activa";
		
	}
}
