package jp.ac.uryukyu.ie.e195709;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameMaster ans = new GameMaster();
        ans.answer();

        GameMaster user = new GameMaster();
        user.user();

        GameMaster game = new GameMaster();
        game.game();
    }
}
