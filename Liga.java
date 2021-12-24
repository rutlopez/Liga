
public class Liga 
{
	private String nombre;
	private Equipo[] clasificacion;
	
	public Liga(Equipo []equipos ) 
	{
		this.nombre= "La Liga";
		this.clasificacion = equipos;
	}
	
	
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
	

}
