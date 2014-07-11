//Clase:principalPortal
//Tiene la funcion de clase Main del programa. 
//Hecho por: Ma. Isabel Fernandez Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 18-09-2013
//***************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class principalRadio{ //clase Principal 
	public static void main(String[] args) {
		InterfazGraficaRadio ig=new InterfazGraficaRadio();
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ventana.setContentPane(ig);
		ig.setVisible(true);
		//Añadi)r Panel a la venta
		//Haver visible la ventana
		//ventana.setVisible(true);
		//ig.ingresarCant();//para mostrar la interfaz grafica
	}
}