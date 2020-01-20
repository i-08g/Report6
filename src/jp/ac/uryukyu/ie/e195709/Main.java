package jp.ac.uryukyu.ie.e195709;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.answer();

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
}