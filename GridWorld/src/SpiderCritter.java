import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import java.awt.Color;
import java.util.ArrayList;

public class SpiderCritter extends Critter{
	
	public SpiderCritter(){
		setColor(Color.black);
	}
	public SpiderCritter(Color input){
		setColor(input);
	}
	public void act() {
		ArrayList<Location> moveLocs = getMoveLocations();
		Location loc = selectMoveLocation(moveLocs);
		makeMove(loc);
	}
	
	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> Loc = new ArrayList<Location>();
		
		int[] dirs = {Location.NORTH, Location.SOUTH, Location.EAST, Location.WEST};
		for (Location spot : getLocationsInDirections(dirs, getLocation() ) ){
			Actor a = getGrid().get(spot);
			if ( a == null || (a instanceof Web) || (a instanceof WebCritter) || (a instanceof WebBug) )
				Loc.add(spot);
        }
		
		return Loc;
	}
	
    public ArrayList<Location> getLocationsInDirections(int[] directions, Location Loc)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        Location loc = Loc;
    
        for (int d : directions)
        {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc))
                locs.add(neighborLoc);
        }
        return locs;
    }
	public void processActors(ArrayList<Actor> actors) {
		
	}
	public void makeMove(Location loc){
		Location WebSpot = getLocation();
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
		if(!WebSpot.equals(loc) && getPossibleWebLocation(WebSpot)){
			Web Trap = new Web();
			Trap.putSelfInGrid(getGrid(), WebSpot);
		}
	}
	public boolean getPossibleWebLocation(Location loc){
		int[] dirs = {Location.NORTH, Location.SOUTH, Location.EAST, Location.WEST};
		for (Location spot : getLocationsInDirections(dirs, loc ) ){
			Actor actor = getGrid().get(spot);
			if ( (actor instanceof Rock) || (actor instanceof Flower) )
				return true;
        }
		return false;
	}
}

