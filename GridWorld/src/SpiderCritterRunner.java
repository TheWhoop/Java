import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

public class SpiderCritterRunner { 
	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
		
		//Class of 2018
		SpiderCritter ConnorBeaudoin = new SpiderCritter();
		SpiderCritter NicholasSigler = new SpiderCritter();
		SpiderCritter MichaelSeyoum = new SpiderCritter();
		Critter KellenSappington = new Critter();
		Critter WaqarSultan = new Critter();
		
		ChameleonCritter KaneTapscott = new ChameleonCritter();
		Bug StephanieRivera = new Bug(Color.MAGENTA);
		Bug RobertNewberg = new Bug(Color.MAGENTA);
		Bug KevinMensah = new Bug(Color.MAGENTA);
		Bug WilberPerez = new Bug(Color.MAGENTA);
		
		//Class of 2019
		Rock OscarSoto = new Rock(Color.GREEN);
		Rock EdgardoRivera = new Rock(Color.pink);
		Rock RahulMalakar = new Rock(Color.MAGENTA);
		Rock DrakeInada = new Rock(Color.RED);
		Rock BrandonBishop = new Rock(Color.LIGHT_GRAY);
		Rock BrandonAmores = new Rock(Color.YELLOW);
		
		//Birth
		world.add(ConnorBeaudoin);
		world.add(NicholasSigler);
		world.add(MichaelSeyoum);
		world.add(KellenSappington);
		world.add(WaqarSultan);
		
		world.add(KaneTapscott);
		world.add(StephanieRivera);
		world.add(RobertNewberg);
		world.add(KevinMensah);
		world.add(WilberPerez);
		
		world.add(OscarSoto);
		world.add(EdgardoRivera);
		world.add(RahulMalakar);
		world.add(DrakeInada);
		world.add(BrandonBishop);
		world.add(BrandonAmores);
		
		//Show World
		world.show();
	}
}