package carcassonne.core;

import java.util.ArrayList;
import carcassonne.ui.Window;

public class Player {
	public static final int NUMBER_OF_MEEPLES = 8;
	
	public int id;
	public boolean isAlive;
	public ArrayList<Node> meeples = new ArrayList<Node>();
	public int points;

	public Player(int id) {
		this.id = id;
		this.isAlive = true;
		this.points = 0;	
	}	

	/**
	* Remove a meeple in the meeples array
	**/
	public void giveBackMeeple(Node n, Window window) {
		n.meepleOwner = null;
		meeples.remove(n);
		window.removeMeeple(n.round);
		System.out.printf("player %d gets back a meeple, he has now %d meeple(s)\n", id, NUMBER_OF_MEEPLES - meeples.size());
	}
	
	/**
	* Add a meeple in the meeples array
	**/
	public void update(Move m) {
		if (meeples.size() < NUMBER_OF_MEEPLES && m.place != Place.NO_MEEPLE)
			meeples.add(m.tile.nodes[m.place.get()]);
	}

	/**
	* Eject a player of the game
	**/
	public void eject() {
		isAlive = false;
	}
}
