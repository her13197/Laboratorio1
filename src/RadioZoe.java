//Clase:RadioZoe
//Tiene la funcion que implementa. 
//Hecho por: Ma. Isabel Fernandez Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 28-10-2013
//***************************************************************
public class RadioZoe implements Radio {
	private boolean estado,frecuencia;
	private String[] estacionesFav;
	private double estacion;
	//CONSTRUCTOR.
	public RadioZoe() {
		estado= true; 
		frecuencia=true; 
		estacion=530;
		estacionesFav = new String[12];
	}
	public void encendidoApagado(){
		if(estado==true){
			estado=false;
		}
		else if(estado==false){
			estado=true; 
		}
	}
	public void cambiarFrecuencia(){
		if(frecuencia==false){
			frecuencia=true;
			estacion=87.9;
		}
		else if(frecuencia==true){
			frecuencia=false;
			estacion=530;
		}
	}
	public void guardarEstacion(double estacion,int boton){
		estacionesFav[boton]=Double.toString(estacion);
	}
	public void cambiarEstacion(boolean direccion){
		if(direccion==true){
			if(frecuencia==false){
				if(estacion<1610){
					estacion=estacion+10;
				}
				else{
					estacion=530;
				}
			}
			else if(frecuencia==true){
				if(estacion<107.9){
					estacion=estacion+0.2;
				}
				else{
					estacion=87.9;
				}
			}
		}
		else if(direccion==false){
			if(frecuencia==false){
				if(estacion>530){
					estacion=estacion-10;
				}
				else{
					estacion=1610;
				}
			}
			else if(frecuencia==true){
				if(estacion>87.9){			
					estacion=estacion-0.2;
				}
				else{
					estacion=107.9;
				}
			}
		}
	}
	public String[] getEstacionesFav(){
		return estacionesFav;
	}
	
	//sets y gets
	/**
	 * @return the estado
	 */
	public boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * @return the frecuencia
	 */
	public boolean getFrecuencia() {
		return frecuencia;
	}
	/**
	 * @param frecuencia the frecuencia to set
	 */
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public double getEstacion() {
		return estacion;
	}
	/**
	 * @param estacion the estacion to set
	 */
	public void setEstacion(double estacion) {
		this.estacion = estacion;
	} 
}