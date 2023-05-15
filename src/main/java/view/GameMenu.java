package view;

import controller.Controller;
import model.map.Map;
import model.User;

import java.util.ArrayList;

public class GameMenu {
    private Controller controller;
    private User currentPlayer;
    private ArrayList<User> allPlayers;
    private Map map;

    public GameMenu(Controller controller) {
        this.controller = controller;
    }
    public String run(){
        return null;
    }
    public void goToNextTurn(){
        return;
    }

    public Map getMap() {
        return map;
    }

    public void setAllPlayers(ArrayList<User> allPlayers) {
        this.allPlayers = allPlayers;
    }
}
