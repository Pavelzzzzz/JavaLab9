package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

/**
 * Created by pavel on 05.04.17.
 */
public class MyQueue<E> extends MyAbstractCollection<E> {
    @Override
    public void push(E el) {
        addElement(el);
    }

    @Override
    public E pop() {
        if (getSize() < 1) {
            throw new ArrayIndexOutOfBoundsException(getSize());
        }
        E el = getElement(0);
        deleteElementAt(0);
        return el;
    }

    @Override
    public E peek() {
        if (getSize() < 1) {
            throw new ArrayIndexOutOfBoundsException(getSize());
        }
        return getElement(0 );
    }
}
