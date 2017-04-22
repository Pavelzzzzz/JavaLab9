package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.Necklace;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by pavel on 16.03.17.
 */
public class TestCounter {

    private static Necklace necklace;

    @BeforeClass
    public static void beforeTestCounter(){
        try{
        necklace = new Necklace();
        necklace.addStone(new Stone(new Random().nextInt(99999) + 1,
                new Random().nextInt(999) + 1));
        necklace.addStone(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        necklace.addStone(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        necklace.addStone(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        }
        catch (NotCorrectValuesMyException Ex){}
    }

    @Test
    public void testCalculationPrice(){
        int allPrice = 0;
        for (int i = 0; i < necklace.size(); i++){
            allPrice += necklace.getElement(i).getPrice();
        }
        assertEquals(allPrice, Counter.calculationPrice(necklace));
    }

    @Test
    public void testCalculationWeight(){
        int allWeight = 0;
        for (int i = 0; i < necklace.size(); i++){
            allWeight += necklace.getElement(i).getWeight();
        }
        assertEquals(allWeight, Counter.calculationWeight(necklace));
    }

}
