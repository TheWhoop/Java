import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
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
public class Jumper extends Actor { 
	
	public Jumper() {
		setColor(Color.YELLOW);
	}
	
	public Jumper(Color input) {
		setColor(input);
	}
	
	public void act() {
		if(canJump()) {
			jump();
		}else if ( canMove() ){
			move();
		}else {
			turn();
		}
	}
	
	public boolean canJump() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {return false;}
		
		Location landing = getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		 
		if (!gr.isValid(landing)) {return false;}
		Actor neighbor = gr.get(landing);
		return (neighbor == null) || (neighbor instanceof Flower);
	}
	
	public void jump() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {return;}
		
		Location loc = getLocation();
		Location landing = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		
		if (gr.isValid(landing)) {
			moveTo(landing);
		}else {
			removeSelfFromGrid();
		}
	}
	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {return false;}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next)) {return false;}
		Actor neighbor = gr.get(next);
		return (neighbor == null) || (neighbor instanceof Flower); 
	}
	
	public void move() {
		 Grid<Actor> gr = getGrid();
		 if (gr == null) {return;}
		 Location loc = getLocation();
		 Location next = loc.getAdjacentLocation(getDirection());
		 if (gr.isValid(next)) {moveTo(next);}
		 else {removeSelfFromGrid();}
	}
	public void turn() {
		setDirection(getDirection() + 45); 
	}

} 
