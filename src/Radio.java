//Clase:InterfazRadio
//Tiene la funcion de interfaz de radio. 
//Hecho por: Ma. Isabel Fernandez Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 28-10-2013
//***************************************************************
public interface Radio {
	public void encendidoApagado();
	public void cambiarFrecuencia();
	public void guardarEstacion(double estacion,int boton);
	public void cambiarEstacion(boolean direccion);
	public String[] getEstacionesFav();
	public boolean getFrecuencia();
	public boolean getEstado();
	public double getEstacion();	
}