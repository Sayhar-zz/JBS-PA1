/**
 * 
 */
package jbs2011.sahar.maze;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import jbs2011.tjhickey.maze.Direction;
import jbs2011.tjhickey.maze.MazeBoard;
import jbs2011.tjhickey.maze.MazePlayer;
import jbs2011.tjhickey.maze.MazePosition;
import jbs2011.tjhickey.maze.MazeView;

/**
 * @author sahar
 *
 */
public class SaharPlayer extends MazePlayer {
	String myname;
	
	public SaharPlayer (String n){
		super(n);
		myname = n;
	}
	
	public String getName(){
		return this.myname;
		
	}
	/**
	 * 
	 * Given a direction, a board, and a current position, tells you if there are any gems if you go straight from your position to the edge of the maze.
	 * @param dir Direction to check
	 * @param boad Board you're playing on
	 * @param pos Position of your character
	 * @return MazePosition of the first gem found in Direction dir. If none is found, return null;
	 */
	private MazePosition findGem(Direction dir, MazeBoard board, MazePosition pos){
		
		
		return pos;
	}
	/* (non-Javadoc)
	 * @see jbs2011.tjhickey.maze.MazePlayer#nextMove(java.util.HashMap, java.util.ArrayList, jbs2011.tjhickey.maze.MazeView)
	 */
	@Override
	/**
	 * This player will try to see if a gem is in a straight line from her current position. 
	 * For the first gem that matches this, move straight in that direction, even through walls.
	 */
	public Direction nextMove(HashMap<String, MazePosition> players,
			ArrayList<MazePosition> jewels, MazeView maze) {
		// TODO Auto-generated method stub
		// According to Bjorn (and intuition), the Mazeview is a mistake. We should be given MazeBoards. Since we are implementing an abstract class, we don't have the luxury of changing it in code.
		// Instead, I am going to assume every MazeView maze is actually a MazeBoard maze.
		// Thing is, the MazeView interface is clearly insuffient because it doesn't let us see the actual, you know, maze.
		
		MazeBoard board = (MazeBoard)maze;
		MazePosition whereAmI = players.get(this.getName());
		//randomly sort the four directions, and for each direction, see if there's a gem somewhere on that straight line. If so, go there.
		//if there is no gem in any of the 4 directions, then go randomly.
		ArrayList<Direction> dirs = new ArrayList<Direction>();
		dirs.add(Direction.SOUTH);
		dirs.add(Direction.NORTH);
		dirs.add(Direction.WEST);
		dirs.add(Direction.EAST);
		
		Collections.shuffle(dirs);
		for (Direction d: dirs){
			MazePosition m = this.findGem(d);
			if (m != null) {
				//do stuff
				//break;
			}
			//if m is null, there is no gem. 
			
		}
		
		
		return Direction.SOUTH;
	}

}
