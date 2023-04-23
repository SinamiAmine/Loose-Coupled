package com.domestic.learnspringframework;

import com.domestic.learnspringframework.game.GameRunner;
import com.domestic.learnspringframework.game.MarioGame;
import com.domestic.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

    public static void main(String[] args ){
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
