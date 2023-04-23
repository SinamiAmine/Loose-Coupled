package com.domestic.learnspringframework;

import com.domestic.learnspringframework.game.GameRunner;
import com.domestic.learnspringframework.game.MarioGame;
import com.domestic.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

    public static void main(String[] args ){
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
