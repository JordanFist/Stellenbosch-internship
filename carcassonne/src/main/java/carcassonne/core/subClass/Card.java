//package carcassonne.core.subClass;

enum cardId {
	CARD_MONASTERY_ROAD, //0. monastery center, connected to one road S (2)
	CARD_MONASTERY_ALONE, //1. monastery center (4)
	CARD_CITY_ALL_SIDES, //2. connected cities on all sides (1)
	CARD_ROAD_STRAIGHT_CITY, //3. road connected N to S, city E, initial card (4 - 1(starting))
	CARD_CITY_ONE_SIDE, //4. city N (5)
	CARD_CITY_TUNNEL_SHLD, //5. city connected E to W, shield
	CARD_CITY_TUNNEL, //6. city connected N to S (1)
	CARD_PLAIN_TUNNEL, //7. plain connected N to S, city elsewhere (3)
	CARD_PLAIN_TWO_CITIES, //8. plain connected W to N, disconnected but jointive cities E and S (2)
	CARD_ROAD_TURN_RIGHT_CITY, //9. city N, road connected S to E (3)
	CARD_ROAD_TURN_LEFT_CITY, //10. city E, road connected W to N (3)
	CARD_JUNCTION_CITY, //11. city E, 3 roads elsewhere connected at center (3)
	CARD_PLAIN_CITY_SHLD, //12. city connected W to N, shield (2)
	CARD_PLAIN_CITY, //13. city connected W to N (3)
	CARD_PLAIN_CITY_ROAD_SHLD, //14. city connected W to N, road connected S to E, shield (2)
	CARD_PLAIN_CITY_ROAD, //15. city connected W to N, road connected S to E (3)
	CARD_CITY_THREE_SHLD, //16. plain S, connected city elsewhere, shield (1)
	CARD_CITY_THREE, //17. plain S, connected city elsewhere (3)
	CARD_CITY_THREE_ROAD_SHLD, //18. road S, connected city elsewhere, shield (2)
	CARD_CITY_THREE_ROAD, //19. road S, connected city elsewhere (1)
	CARD_ROAD_STRAIGHT, //20. road connected N to S (8)
	CARD_ROAD_TURN, //21. road connected W to S (9) 
	CARD_JUNCTION_THREE, //22. plain N, 3 roads elsewhere connected at center (4)
	CARD_JUNCTION_FOUR, //23. 4 roads connected at the center (1)
};

public class Card {
	protected int id;
	protected cardId name;
	//protected boolean shield;
	
	public Card(int id, cardId name) {
		this.id = id;		
		this.name = name;
	}
}
