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
public class TestMyQueue {

    MyQueue queue;

    @Before
    public void myStackInitialization(){
        queue = new MyQueue<Stone>();
    }

    @Test
    public void testPushMethod() throws NotCorrectValuesMyException {
        queue.push(new Amber(1, 3, 4));
        queue.push(new Rubin(3,2, 2));
        assertEquals(queue.getSize(), 2);
    }

    @Test
    public void testPopMethodValue() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        queue.push(stone);
        queue.push(new Rubin(3,2, 2));
        assertEquals(queue.pop(), stone);
    }

    @Test
    public void testPopMethodValueSecondElement() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        queue.push(new Rubin(3,2, 2));
        queue.push(stone);
        queue.pop();
        assertEquals(queue.pop(), stone);
    }

    @Test
    public void testPopMethodSize() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        queue.push(stone);
        queue.pop();
        assertEquals(queue.getSize(), 0);
    }

    @Test
    public void testPeekMethod() throws NotCorrectValuesMyException {
        Stone stone  = new Amber(4, 5, 6);
        queue.push(stone);
        queue.push(new Rubin(3,2, 2));
        assertEquals(queue.peek(), stone);
    }

//    @Test
//    public void testPeek
}
