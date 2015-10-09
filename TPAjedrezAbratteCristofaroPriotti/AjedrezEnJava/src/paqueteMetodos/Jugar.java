package paqueteMetodos;

import paqueteAjedrez.*;
import paquetePiezas.*;

public class Jugar {

	private static Ficha[][] tabs;

	public static void main (String[] args)
	{
	
	Grafico1 g1= new Grafico1();
	
	
	g1.setVisible(true);
	
	}
	
	public static Ficha[][] nuevaPartida()
	{
		Ficha[][] tabs = new Ficha[9][9];
		
	
		tabs[1][1]=new Torre("n",1,1);
		tabs[1][2]=new Caballo("n",1,2);
		tabs[1][3]=new Alfil("n", 1,3);
		tabs[1][4]=new Reina("n",1,4);
		tabs[1][5]=new Rey("n",1,5);
		tabs[1][8]=new Torre("n",1,8);
		tabs[1][7]=new Caballo("n",1,7);
		tabs[1][6]=new Alfil("n", 1,6);
		tabs[2][1]=new Peon("n",2,1);
		tabs[2][2]=new Peon("n",2,2);
		tabs[2][3]=new Peon("n",2,3);
		tabs[2][4]=new Peon("n",2,4);
		tabs[2][5]=new Peon("n",2,5);
		tabs[2][6]=new Peon("n",2,6);
		tabs[2][7]=new Peon("n",2,7);
		tabs[2][8]=new Peon("n",2,8);
		
		tabs[8][1]=new Torre("b",8,1);
		tabs[8][2]=new Caballo("b",8,2);
		tabs[8][3]=new Alfil("b",8,3);
		tabs[8][4]=new Reina("b",8,4);
		tabs[8][5]=new Rey("b",8,5);
		tabs[8][8]=new Torre("b",8,8);
		tabs[8][7]=new Caballo("b",8,7);
		tabs[8][6]=new Alfil("b",8,6);
		tabs[7][1]=new Peon("b",7,1);
		tabs[7][2]=new Peon("b",7,2);
		tabs[7][3]=new Peon("b",7,3);
		tabs[7][4]=new Peon("b",7,4);
		tabs[7][5]=new Peon("b",7,5);
		tabs[7][6]=new Peon("b",7,6);
		tabs[7][7]=new Peon("b",7,7);
		tabs[7][8]=new Peon("b",7,8);
		
		return tabs;
			
		}
	
		
}
