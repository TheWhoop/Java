import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import java.util.ArrayList; 
import java.awt.Color; 

public class Web extends Flower {
	
	public Web() {
		setColor(Color.white);
	}
	
	public void act(){
		if (getGrid() == null)
			return;
		ArrayList<Actor> actors = getActors();
		processActors(actors);
	}
	
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actor = new ArrayList<Actor>();
		
		int[] dirs = {Location.NORTH, Location.SOUTH, Location.EAST, Location.WEST};
		for (Location spot : getLocationsInDirections(dirs)){
			Actor a = getGrid().get(spot);
			if ( (a instanceof Bug) || (a instanceof Critter))
				actor.add(a);
        }
		
		return actor;
	}
    
	public void processActors(ArrayList<Actor> actors){
		for (Actor a : actors){
			if(!(a instanceof Rock) && !(a instanceof Flower) && !(a instanceof SpiderCritter) && !(a instanceof WebCritter) && !(a instanceof WebBug)) {
				Grid<Actor> gr = getGrid();
				Location replace = a.getLocation();
				a.removeSelfFromGrid();
				if (a instanceof Critter) {
					WebCritter deadCritter = new WebCritter();
					deadCritter.putSelfInGrid(gr, replace);
				}
				if (a instanceof Bug) {
					WebBug deadBug = new WebBug();
					deadBug.putSelfInGrid(gr, replace);
				}
			}
		}
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] directions){
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		for (int d : directions){
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		return locs;
	}
	
}	
