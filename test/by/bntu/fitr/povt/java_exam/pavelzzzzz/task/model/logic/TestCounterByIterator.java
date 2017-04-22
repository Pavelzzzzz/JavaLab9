package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.MyAbstractCollectionWithIterator;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.MyQueueWithIterator;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

/**
 * Created by pavel on 16.03.17.
 */
public class TestCounterByIterator {

    private static MyAbstractCollectionWithIterator<Stone> necklace;

    @BeforeClass
    public static void beforeTestCounter(){
        try{
        necklace = new MyQueueWithIterator<Stone>();
        necklace.push(new Stone(new Random().nextInt(99999) + 1,
                new Random().nextInt(999) + 1));
        necklace.push(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        necklace.push(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        necklace.push(new Stone(new Random().nextInt(99999) + 1,
                    new Random().nextInt(999) + 1));
        }
        catch (NotCorrectValuesMyException Ex){}
    }

    @Test
    public void testCalculationPrice(){
        int allPrice = 0;
        for (Stone stone: necklace){
            allPrice += stone.getPrice();
        }
        //assertEquals(allPrice, CounterByIterator.calculationPrice(necklace));
    }

    @Test
    public void testCalculationWeight(){
        int allWeight = 0;
        for (Stone stone: necklace){
            allWeight += stone.getWeight();
        }
        //assertEquals(allWeight, CounterByIterator.calculationWeight(necklace));
    }

}
