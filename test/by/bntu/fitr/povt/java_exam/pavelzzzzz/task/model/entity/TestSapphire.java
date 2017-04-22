package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by pavel on 16.03.17.
 */
public class TestSapphire {

    @Test
    public void testSapphireTheNumberOfFaces(){
        try {
            int j = new Random().nextInt(99) + 1;
            Sapphire sapphire = new Sapphire(10, 10, j);
            Assert.assertTrue(true);
        }
        catch (NotCorrectValuesMyException ex){
            Assert.fail();
        }
    }

    @Test
    public void testStoneWrongTheNumberOfFaces(){
        try {
            int j = 0;
            Sapphire sapphire = new Sapphire(10, 10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testStoneWrong2TheNumberOfFaces(){
        try {
            int j = 100001;
            Sapphire sapphire = new Sapphire(10, 10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }
}
