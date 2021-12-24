
public class Jugador 
{
	private String nombre ;
	private int dorsal ;
	private int goles ;
	private int tarjetasRojas;
	private int tarjetasAmarillas;
	
	public Jugador(String nombre,String apellido, int dorsal) 
	{
		this.nombre = nombre + " " + apellido;
		this.dorsal = dorsal;
		this.goles =  (int) (Math.random() * 70);
		this.tarjetasRojas =  (int) (Math.random() * 10);
		this.tarjetasAmarillas = (int) (Math.random() * 30);
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	} 
	

}
