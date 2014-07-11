//Clase:RadioZoe
//Tiene la funcion que implementa. 
//Hecho por: Ma. Isabel Fernandez Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 28-10-2013
//***************************************************************
public class RadioZoe implements Radio {
	private boolean estado,amFm;
	private String[] estacionesFav;
	private double estacion;
	//CONSTRUCTOR.
	public RadioZoe() {
		estado= true; 
		amFm=true; 
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
		if(amFm==true){
			amFm=false;
			estacion=87.9;
		}
		else if(amFm==false){
			amFm=true;
			estacion=530;
		}
	}
	public void guardarEstacion(double estacion,int boton){
		estacionesFav[boton]=Double.toString(estacion);
	}
	public void cambiarEstacion(boolean direccion){
		if(direccion==true){
			if(amFm==true){
				if(estacion<1610){
					estacion=estacion+10;
				}
				else{
					estacion=530;
				}
			}
			else if(amFm==false){
				if(estacion<107.9){
					estacion=estacion+0.2;
				}
				else{
					estacion=87.9;
				}
			}
		}
		else if(direccion==false){
			if(amFm==true){
				if(estacion>530){
					estacion=estacion-10;
				}
				else{
					estacion=1610;
				}
			}
			else if(amFm==false){
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
	 * @return the amFm
	 */
	public boolean getAmFm() {
		return amFm;
	}
	/**
	 * @param amFm the amFm to set
	 */
	public void setAmFm(boolean amFm) {
		this.amFm = amFm;
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