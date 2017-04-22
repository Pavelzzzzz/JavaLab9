package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.controller;

/**
 * Created by pavel on 05.04.17.
 */
public class Random {
    public static void main(String arg[]){
        java.util.Random rand = new java.util.Random();
        int j[]= {7, 4, 7, 8};
        for (int i: j) {
            System.out.println(i);
        }
        System.out.print(rand.nextInt(6));
    }
}
