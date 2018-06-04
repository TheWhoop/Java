import info.gridworld.actor.Bug;
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
public class ZBug extends Bug { 
	private int steps;
	private int sideLength;
	private int sides;
	public ZBug(int length) {
		steps = 0;
		sides = 0;
		sideLength = length;
	} 
	public void act() { 
		if (sides == 0 && steps == 0) {
			setDirection(90);
			move();
			steps++;
		}
		if(sides == 0){
			if (steps < sideLength && canMove()) {
				move();
				steps++; 
			}else if(steps == sideLength ){
				setDirection(225);
				steps = 0;
				sides++;
			}
		}
		if(sides == 1){
			if (steps < sideLength && canMove()) {
				move();
				steps++; 
			}else if(steps == sideLength ){
				setDirection(90);
				steps = 0;
				sides++;
			}
		}
		if (sides == 2 && steps < sideLength && canMove()) {
			move();
			steps++;
		}
	}
}