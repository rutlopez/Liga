
public class Liga 
{
	private String nombre;
	private Equipo[] clasificacion;
	
	//metodo constructor de Liga
	
	public Liga(Equipo []equipos ) //variable que necesitamos de crearEquipos()
	{
		this.nombre= "La Liga";
		this.clasificacion = equipos;
	}
	
	//metodos get y set
	
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
	

}
