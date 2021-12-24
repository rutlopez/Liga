
public class Equipo 
{
	private String nombre;
	private String estadio;
	private int fundacion;
	private Jugador[] jugadores;
	private int puntos;
	private int partidosGanados ;
	private int partidosPerdidos ;
	private int partidosEmpatados ;
	
	public Equipo(String nombre, String estadio, Jugador[] jugadores) 
	{
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = jugadores;
		this.fundacion = (int)((Math.random() * 150) + 1875) ;		 
		this.puntos=(int) (Math.random() * 50);
		this.partidosGanados = (int) (Math.random() * 28);
		this.partidosEmpatados = (int) (Math.random() * (28 - this.partidosGanados));
		this.partidosPerdidos = 28 - this.partidosGanados - this.partidosEmpatados;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	
	
	
	
	
	
	
	
}
