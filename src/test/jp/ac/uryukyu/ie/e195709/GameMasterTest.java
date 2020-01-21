package jp.ac.uryukyu.ie.e195709;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class GameMasterTest {

    @Test
    void user() {System.out.println("３桁の数字を入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("入力された文字は「" + str + "」です");
        String[] user = str.split("");
    }
}