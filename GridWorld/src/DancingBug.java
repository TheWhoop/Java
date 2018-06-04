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
public class DancingBug extends Bug { 
	private int index;
	private int[] DanceList;
	public DancingBug(int[] DanceSequence) {
		index = 0;
		DanceList = DanceSequence;
	} 
	public void act() { 
		for(int degree = 0 ; degree <DanceList[index]*45; degree += 45) {
			turn();
		}
		if(index < DanceList.length-1) {
			index++;
		}else {
			index = 0;
		}
		super.act();
	}
}