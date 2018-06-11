import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{
	
	public ChameleonKid(){}
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_CIRCLE };
		for (Location spot : getLocationsInDirections(dirs, getLocation() )){
			Actor a = getGrid().get(spot);
			if (a != null) {
				actors.add(a);
			}
		}
		return actors;
	} 
    public ArrayList<Location> getLocationsInDirections(int[] directions, Location Loc){
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        Location loc = Loc;
    
        for (int d : directions){
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc))
                locs.add(neighborLoc);
        }
        return locs;
    }
}
