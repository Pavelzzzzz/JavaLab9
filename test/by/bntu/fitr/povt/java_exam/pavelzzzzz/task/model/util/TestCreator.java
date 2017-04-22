package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.util;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.Necklace;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Amber;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Rubin;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Sapphire;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestCreator {

    @Test
    public void testCreateNecklaceAmber() throws NotCorrectValuesMyException{
        Necklace necklace = Creator.createNecklace(1, 1);
        if(!(necklace.getElement(0) instanceof Amber)){
            Assert.fail();
        }
    }

    @Test
    public void testCreateNecklaceRubin() throws NotCorrectValuesMyException{
        Necklace necklace = Creator.createNecklace(2, 1);
        if(!(necklace.getElement(0) instanceof Rubin)){
            Assert.fail();
        }
    }

    @Test
    public void testCreateNecklaceSapphire() throws NotCorrectValuesMyException{
        Necklace necklace = Creator.createNecklace(3, 1);
        if(!(necklace.getElement(0) instanceof Sapphire)){
            Assert.fail();
        }
    }

    @Test
    public void testCreateNecklaceElse(){
        try {
        Necklace necklace = Creator.createNecklace(4, 1);
        fail();
        }
        catch (NotCorrectValuesMyException ex){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreateNecklaceCount() throws NotCorrectValuesMyException{
        int j = new Random().nextInt(5);
        Necklace necklace = Creator.createNecklace(1, j);
        assertEquals(j, necklace.size());
    }
}
