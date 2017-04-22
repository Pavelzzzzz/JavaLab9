package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by pavel on 16.03.17.
 */
public class TestAmber {

    @Test
    public void testAmberDia(){
        try {
            int j = new Random().nextInt(999) + 1;
            Amber amber = new Amber(10, 10, j);
            Assert.assertTrue(true);
        }
        catch (NotCorrectValuesMyException ex){
            Assert.fail();
        }
    }

    @Test
    public void testAmberWrongDia(){
        try {
            int j = 0;
            Amber amber = new Amber(10, 10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testAmberWrong2Dia(){
        try {
            int j = 1001;
            Amber amber = new Amber(10, 10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }
}
