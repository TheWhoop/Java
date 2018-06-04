
import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */
/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class.
 */
public class Question5{
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
	////////////////////////////////////////////////
		Bug partA = new Bug();
		world.add(new Location(0,0), partA);
		//partA.putSelfInGrid(partA.getGrid(),new Location(3,3)); 
		//java.lang.IllegalStateException
	////////////////////////////////////////////////
		Bug partB = new Bug();
		partB.setColor(Color.YELLOW);
		world.add(new Location(1,1), partB);
		partB.removeSelfFromGrid();
		//partB.removeSelfFromGrid();
		//java.lang.IllegalStateException
	////////////////////////////////////////////////
		Bug partC = new Bug();
		partC.setColor(Color.GREEN);
		world.add(new Location(1,3),partC);
		partC.removeSelfFromGrid();
		partC.putSelfInGrid(partA.getGrid(),new Location(2,2)); 
	////////////////////////////////////////////////
		Bug part5 = new Bug();
		part5.setColor(Color.BLUE);
		world.add(new Location(4,4),part5);
		part5.setDirection(part5.getDirection() + 90);
		world.show();
	}
}