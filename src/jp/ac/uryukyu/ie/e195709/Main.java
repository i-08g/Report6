package jp.ac.uryukyu.ie.e195709;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.answer();

        Answer u = new Answer();
        u.user();

    }
}
class Answer{
    void answer(){
        Random rand = new Random();
        int val = rand.nextInt(9) + 1;
        int a = 0;
        a = val;
        String s = String.valueOf(a);
        //System.out.print(s);

        Random rand2 = new Random();
        int val2 = rand.nextInt(10);
        int b = 0;
        b = val2;
        String t = String.valueOf(b);
        //System.out.print(t);

        Random rand3 = new Random();
        int val3 = rand.nextInt(10);
        int c = 0;
        c = val3;
        String r = String.valueOf(c);
        //System.out.println(r);

        String answer = (s + t + r);
        System.out.println(answer);
    }
    void user(){
        System.out.println("３桁の数字を入力してください");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("入力された文字は「" + str + "」です");

        String[] user = str.split("");
        //System.out.println(user[1]);
    }
}