import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class JumperRunner { 
	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
		
		//Class of 2018
		Jumper ConnorBeaudoin = new Jumper();
		Jumper NicholasSigler = new Jumper(Color.WHITE);
		Jumper MichaelSeyoum = new Jumper(Color.GREEN);
		Jumper KellenSappington = new Jumper(Color.BLUE);
		Jumper WaqarSultan = new Jumper(Color.MAGENTA);
		
		Jumper KaneTapscott = new Jumper(Color.BLACK);
		Bug StephanieRivera = new Bug(Color.CYAN);
//		Bug RobertNewberg = new Bug();
		Bug KevinMensah = new Bug();
//		Bug WilberPerez = new Bug();
		
		//Class of 2019
		Rock OscarSoto = new Rock(Color.GREEN);
//		Rock EdgardoRivera = new Rock(Color.pink);
//		Rock RahulMalakar = new Rock();
//		Rock DrakeInada = new Rock();
//		Rock BrandonBishop = new Rock();
		Rock BrandonAmores = new Rock(Color.RED);
		
		//TEST CASE: 1b, 1c
		world.add(new Location(0, 0), KaneTapscott);
		KaneTapscott.setDirection(Location.WEST);
		world.add(new Location(1, 2), ConnorBeaudoin);
		
		//TEST CASE: 1e
		world.add(new Location(4, 1), NicholasSigler);
		NicholasSigler.setDirection(Location.SOUTH);
		world.add(new Location(8, 1), MichaelSeyoum);
		
		//TEST CASE: 1a , 1d
		world.add(new Location(8, 3), KellenSappington);
		world.add(new Location(6, 3), OscarSoto);
		
		world.add(new Location(1, 3), KevinMensah);
		KevinMensah.setDirection(Location.SOUTH);
		
		//TEST CASE: 1f
		world.add(new Location(8, 5), WaqarSultan);
		world.add(new Location(7, 5), StephanieRivera);
		world.add(new Location(6, 5), BrandonAmores);
		
		
		//EXTRA		
//		world.add(RobertNewberg);
//		world.add(WilberPerez);
//		world.add(EdgardoRivera);
//		world.add(RahulMalakar);
//		world.add(DrakeInada);
//		world.add(BrandonBishop);
		
		//Show World
		world.show();
	}
}