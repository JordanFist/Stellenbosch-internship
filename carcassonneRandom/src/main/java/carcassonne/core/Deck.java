package carcassonne.core;

import java.util.Stack;
import java.util.Collections;
import carcassonne.core.tiles.*;

public class Deck {
	public static final int NUMBER_OF_CARDS = 71;
	public Stack<Tile> pile = new Stack<Tile>();
	
	public Deck() {
		fill();
		shuffle();
	}

	/**
	* Return true if the deck is empty
	**/
	
	public boolean isEmpty() {
		return pile.isEmpty();
	}

	/**
	* Return the first card on the deck
	**/
	public Tile drawCard() {
		if (pile.isEmpty() == false) {
			return pile.remove(0);
		}
		return null;
	}
	
	/**
	* Shuffle the deck
	**/
	public void shuffle() {
		Collections.shuffle(pile);
	}
	
	/**
	* Fill the deck with all the cards of the game
	**/
	public void fill() {
		int j = 0;
		for (int i = 0; i < 1; ++i) {
			pile.add(new CityAllSidesShield());
			pile.add(new CityTunnel());
			pile.add(new CityThreeShield());
			pile.add(new CityThreeRoad());
			pile.add(new JunctionFour());
		}
		for (int i = 0; i < 2; ++i) {
			pile.add(new MonasteryRoad());
			pile.add(new CityTunnelShield());
			pile.add(new PlainTwoCities());
			pile.add(new PlainCityShield());
			pile.add(new PlainCityRoadShield());
			pile.add(new CityThreeRoadShield());
		}
		for (int i = 0; i < 3; ++i) {
			pile.add(new RoadStraightCity());
			pile.add(new PlainTunnel());
			pile.add(new RoadTurnRightCity());
			pile.add(new RoadTurnLeftCity());
			pile.add(new JunctionCity());
			pile.add(new PlainCity());
			pile.add(new PlainCityRoad());
			pile.add(new CityThree());
		}
		for (int i = 0; i < 4; ++i) {
			pile.add(new MonasteryAlone());
			pile.add(new JunctionThree());
		}
		for (int i = 0; i < 5; ++i) 
			pile.add(new CityOneSide());
		for (int i = 0; i < 8; ++i) 
			pile.add(new RoadStraight());
		for (int i = 0; i < 9; ++i) 
			pile.add(new RoadTurn());
	}
}
