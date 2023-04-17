package no.uib.inf101.sem2.model;

import java.util.ArrayList;
import java.util.List;

import no.uib.inf101.sem2.grid.CellPosition;

public class StartPlayer implements PlayerFactory {
    private List<Character> playerSymbols = new ArrayList<Character>();

    public StartPlayer() {
        playerSymbols.add('P');
        playerSymbols.add('B');
        playerSymbols.add('Q');
        playerSymbols.add('K');
    }

    @Override
    public Player getNext() {
        if (playerSymbols.isEmpty()) {
            return null;
        }
        else{
            char playerSymbol = playerSymbols.get(0);
            Player player = new Player(playerSymbol, new CellPosition(9, 0));
            playerSymbols.remove(0);
            return player;
    }   
    }

    public List<Player> getPlayerList() {
        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i < 4; i++) {
            players.add(getNext());
        }
        return players;
    }

    public boolean hasMorePlayers() {
        return !playerSymbols.isEmpty();
    }
}
