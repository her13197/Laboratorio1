//Clase:RadioZoe
//Tiene la funcion que implementa. 
//Hecho por: Ma. Isabel Fernandez Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 28-10-2013
//***************************************************************
public class RadioZoe implements Radio {
	private boolean Estado,AmFm;
	private String[] EstacionFav;
	private double Estacion;
	//CONSTRUCTOR.
	public RadioZoe() {
		Estado= true; 
		AmFm=true; 
		Estacion=530;
		EstacionFav = new String[12];
	}
	public void encendidoApagado(){
		if(Estado==true){
			Estado=false;
		}
		else if(Estado==false){
			Estado=true; 
		}
	}
	public void cambiarFrecuencia(){
		if(AmFm==true){
			AmFm=false;
			Estacion=87.9;
		}
		else if(AmFm==false){
			AmFm=true;
			Estacion=530;
		}
	}
	public void guardarEstacion(double estacion,int boton){
		EstacionFav[boton]=Double.toString(estacion);
	}
	public void cambiarEstacion(boolean direccion){
		if(direccion==true){
			if(AmFm==true){
				if(Estacion<1610){
					Estacion=Estacion+10;
				}
				else{
					Estacion=530;
				}
			}
			else if(AmFm==false){
				if(Estacion<107.9){
					Estacion=Estacion+0.2;
				}
				else{
					Estacion=87.9;
				}
			}
		}
		else if(direccion==false){
			if(AmFm==true){
				if(Estacion>530){
					Estacion=Estacion-10;
				}
				else{
					Estacion=1610;
				}
			}
			else if(AmFm==false){
				if(Estacion>87.9){			
					Estacion=Estacion-0.2;
				}
				else{
					Estacion=107.9;
				}
			}
		}
	}
	public String[] getEstacionesFav(){
		return EstacionFav;
	}
	
	//sets y gets
	/**
	 * @return the Estado
	 */
	public boolean getEstado() {
		return Estado;
	}
	/**
	 * @param Estado the Estado to set
	 */
	public void setEstado(boolean estado) {
		this.Estado = estado;
	}
	/**
	 * @return the AmFm
	 */
	public boolean getAmFm() {
		return AmFm;
	}
	/**
	 * @param AmFm the AmFm to set
	 */
	public void setAmFm(boolean amFm) {
		this.AmFm = amFm;
	}
	
	public double getEstacion() {
		return Estacion;
	}
	/**
	 * @param Estacion the Estacion to set
	 */
	public void setEstacion(double estacion) {
		this.Estacion = estacion;
	} 
}