package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Amber;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Rubin;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pavel on 05.04.17.
 */
public class TestMyStack {

    MyStack stack;

    @Before
    public void myStackInitialization(){
        stack = new MyStack<Stone>();
    }

    @Test
    public void testPushMethod() throws NotCorrectValuesMyException {
        stack.push(new Amber(1, 3, 4));
        stack.push(new Rubin(3,2, 2));
        assertEquals(stack.getSize(), 2);
    }

    @Test
    public void testPopMethodValue() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        stack.push(stone);
        assertEquals(stack.pop(), stone);
    }

    @Test
    public void testPopMethodValueSecondElement() throws NotCorrectValuesMyException {
        Stone stone1  = new Amber(4, 5, 6);
        Stone stone2  = new Amber(4, 5, 6);
        stack.push(stone1);
        stack.push(stone2);
        assertEquals(stack.pop(), stone2);
        assertEquals(stack.pop(), stone1);
//        assertTrue(stack.pop().equals(stone2));
//        assertTrue(stack.pop().equals(stone1));
    }

    @Test
    public void testPopMethodSize() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        stack.push(stone);
        stack.pop();
        assertEquals(stack.getSize(), 0);
    }

    @Test
    public void testPeekMethod() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        stack.push(stone);
        assertEquals(stack.peek(), stone);
    }

//    @Test
//    public void testPeek
}
