package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;


/**
 * Created by pavel on 16.03.17.
 */
public class TestStone {

    @Test
    public void testStonePrice(){
        try {
            int j = new Random().nextInt(99999) + 1;
            Stone stone = new Stone(j, 10);
            assertEquals(stone.getPrice(), j);
        }
        catch (NotCorrectValuesMyException ex){
            Assert.fail();
        }
    }

    @Test
    public void testStoneWrongPrice(){
        try {
            int j = 0;
            Stone stone = new Stone(j, 10);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testStoneWrong2Price(){
        try {
            int j = 100001;
            Stone stone = new Stone(j, 10);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testStoneWeight(){
        try {
            int j = new Random().nextInt(999) + 1;
            Stone stone = new Stone( 10, j);
            assertEquals(stone.getWeight(), j);
        }
        catch (NotCorrectValuesMyException ex){
            Assert.fail();
        }
    }

    @Test
    public void testStoneWrongWeight(){
        try {
            int j = 0;
            Stone stone = new Stone(10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testStoneWrong2Weight(){
        try {
            int j = 1001;
            Stone stone = new Stone(10, j);
            Assert.fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }
}
