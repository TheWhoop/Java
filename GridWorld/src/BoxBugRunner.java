import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

/* AP(r) Computer Science GridWorld Case Study:
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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

/**This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */

public class BoxBugRunner { 
	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
		BoxBug Bethany = new BoxBug(9);
		BoxBug Brooke = new BoxBug(7);
		BoxBug Becky = new BoxBug(5);
		BoxBug Beth = new BoxBug(3);
		Bethany.setColor(Color.GREEN);
		Brooke.setColor(Color.YELLOW);
		Becky.setColor(Color.ORANGE);
		world.add(new Location(9,0), Bethany);
		world.add(new Location(8, 1), Brooke);
		world.add(new Location(7, 2), Becky);
		world.add(new Location(6, 3), Beth);
		world.show();
	}
}