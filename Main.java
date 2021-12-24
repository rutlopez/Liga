
public class Main {

	public static void main(String[] args) {
		
		Liga laLiga = CrearLiga();
		
		Equipo[] equipos = laLiga.getClasificacion();
		
		//Para cada equipo 
		for (int i = 0; i< equipos.length;i++) 
		{
			//Guardar un equipo del array
			Equipo equipo = equipos[i];
			//Imprimir el nombre
			System.out.println(equipo.getNombre());
			System.out.println(equipo.ge);
			//Guardar los jugadores del equipo
			Jugador[] jugadores = equipo.getJugadores();
			//Para cada jugador
			for(int j = 0; j < jugadores.length; j++)
			{
				//Imprimir el nombre del jugador j
				System.out.println("       " + jugadores[j].getNombre());
			}
		}
	}

	
	private static Liga CrearLiga()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	{
		Equipo[] equipos = CrearEquipos();
		
		Liga laLiga = new Liga (equipos);
		return laLiga;
	}
	
	public static Equipo[] CrearEquipos()
	{

		String nombresEquipos[] = 
			{
				"RealZaragoza", "Atletico de Madrid", "Barcelona", "Betis",
				"Real Madrid", "Valencia", "Real Sociedad","Atletico de Bilbao",
				"Celta","Espanyol","Rayo Vallecano","Sevilla","Levante", "Alaves",
				"Huesca"
			};
	
		String estadios[] =
			{
					"La Romareda", "Estadio Metropolitano", "Camp Nou", "Benito Villamarin",
					"Santiago Bernabeu","Mestalla","Reale Arena","SanMames","AbancaBalaidos",
					"RCDE Stadium","Estadio de Vallecas", "Ramon SanchezPizjuan","Ciutat de Valencia",
					"Mendizorroza","El Alcoraz"
			};
		
		
		Equipo equipos [] = new Equipo[15];
		
		for(int i = 0; i<15;i++) 
		{
			
			 Jugador[] jugadores = CrearJugadores();
			 Equipo nuevoEquipo = new Equipo(nombresEquipos[i], estadios[i],jugadores);
			 equipos[i] = nuevoEquipo;
		}
		
		return equipos;
	}
	
	
	public static Jugador[] CrearJugadores()
	{
		String nombresJugadores [] = { "Andrea", "David", "Diego", "Alfonso", "Andres", "Baltasar", "Juan", "Bartolo",
				"Cristiano", "Messi", "Raul", "Sergio", "Luis", "Rutt", "Dani"};
		
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Calvo", "Cardona", "Gomez", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Lopez", "Castro", "Grande", "Bolson", "Fernandez", "Grasia", "Griego",
				"Grigalva" };
		
		Jugador[] jugadores = new Jugador[11];
		
		for(int j = 0; j < 11; j++) 
		{ 
			int numeroNombre =(int)(Math.random() * nombresJugadores.length);
			int numeroApellido =(int)(Math.random() * apellidos.length);
			
			Jugador jugador = new Jugador(nombresJugadores[numeroNombre], apellidos [numeroApellido],j);
			jugadores[j] = jugador;
		}
		
		return jugadores;
	}
	
}
