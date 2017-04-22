package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Amber;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Rubin;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by pavel on 10.03.17.
 */
public class TestNecklace {

    private Necklace necklace;

    @Before
    public void before(){
        necklace = new Necklace();
    }

//    @Test(expected = NotCorrectValuesMyException.class)
    @Test
    public void testNecklaceSize(){
        try{
        necklace.addStone(new Amber(1, 1, 1));
        necklace.addStone(new Rubin(1, 1, 1));
        assertEquals(necklace.size(), 2);
        }
        catch (NotCorrectValuesMyException ex){
            fail();
        }
    }

    @Test
    public void testeNecklaceGetElement()throws NotCorrectValuesMyException{
        Stone stone = new Amber(1, 2, 3);
        necklace.addStone(stone);
        assertEquals(stone, necklace.getElement(necklace.size() - 1));
    }
}
