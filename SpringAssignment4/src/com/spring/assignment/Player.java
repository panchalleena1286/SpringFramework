package com.spring.assignment;

public class Player {
	String playerId;
	String playerName;
	Object country;
	
	public Player() {
		
	}

	public Player(String playerId, String playerName, Object country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Object getCountry() {
		return country;
	}

	public void setCountry(Object country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player Id = " + playerId + ", Player Name = " + playerName + ", Country = " + country;
	}
	
	

}
