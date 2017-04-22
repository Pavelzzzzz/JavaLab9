package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.controller;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.Necklace;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic.Counter;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.util.Creator;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.view.Printer;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.view.Scan;

import java.util.Random;

public class Controller {

    public static void main(String[] args) {
    	Random rand = new Random();
    	Printer.print("Enter necklace count ");
        int count = Scan.scanningInt();
        for (int i = 0; i < count; i++){
            try {
                Printer.print("\n Necklace ");
                Printer.print(i + 1 + "");
                Printer.print(":\n");
                Necklace necklace = Creator.createNecklace(rand.nextInt(3) + 1 ,
                        rand.nextInt(6) + 3);
                Printer.print(necklace + "");
                Printer.print("Total:   ");
                Printer.print("Price: " + Counter.calculationPrice(necklace));
                Printer.print(",   Weight: " + Counter.calculationWeight(necklace));
            }
            catch (NotCorrectValuesMyException ex){
                Printer.print(ex.getMessage());
                Printer.print("Error");
            }
        }
    }
}
