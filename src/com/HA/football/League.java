package com.HA.football;

public class League {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		player1.playerName = "Raina";
		
		Player player2 = new Player();
		player2.playerName = "John";
		
		Player player3 = new Player();
		player3.playerName = "Dhoni";

		
		Player[] players= new Player[3];
		players[0]=player1;
		players[1]=player2;
		players[2]=player3;
	
		Team team1 = new Team();
		team1.teamName = "CSK";
		team1.playerArray = players;
		
		Player player4 = new Player();
		player4.playerName = "Kohli";
		
		Player player5 = new Player();
		player5.playerName = "Kaif";
		
		Player player6 = new Player();
		player6.playerName = "Yuvi";
		
		Player[] team2Player = {player4,player5,player6}; 
		
		Team team2 = new Team();
		team2.teamName = "RCB";
		team2.playerArray = team2Player;
		
		System.out.println("Team 1 Name: "+team1.teamName);
		System.out.println("Team 1 players are: ");
		
		for(Player p:team1.playerArray)
		{
			System.out.println(p.playerName);
		}
	}

}
