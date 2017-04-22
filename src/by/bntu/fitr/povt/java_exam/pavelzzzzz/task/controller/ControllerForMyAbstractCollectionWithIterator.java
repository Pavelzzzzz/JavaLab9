package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.controller;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic.CounterByIterator;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.util.CreatorMyQueueWithIterator;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.view.Printer;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.view.Scan;

import java.util.Random;

public class ControllerForMyAbstractCollectionWithIterator {

    public static void main(String[] args) {
    	Random rand = new Random();
    	Printer.print("Enter necklace count ");
        int count = Scan.scanningInt();
        for (int i = 0; i < count; i++){
            try {
                Printer.print("\n Necklace ");
                Printer.print(i + 1 + "");
                Printer.print(":\n");
                Iterable necklace = CreatorMyQueueWithIterator.createNecklace(rand.nextInt(3) + 1 ,
                        rand.nextInt(6) + 3);
                Printer.print(necklace + "");
                Printer.print("Total:   ");
                Printer.print("Price: " + CounterByIterator.calculationPrice(necklace.iterator()));
                Printer.print(",   Weight: " + CounterByIterator.calculationWeight(necklace.iterator()));
                Printer.print("\n");
            }
            catch (NotCorrectValuesMyException ex){
                Printer.print(ex.getMessage());
                Printer.print("Error");
            }
        }
    }
}
