package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

import java.util.Iterator;

/**
 * Created by pavel on 04.04.17.
 */
public abstract class MyAbstractCollectionWithIterator<E> extends MyAbstractCollection<E> implements Iterable<E> {

    public MyIterator<E> iterator() {
        return new MyIterator<E>();
    }

    private class MyIterator<E> implements Iterator<E> {
        private int coursor = 0;

        @Override
        public boolean hasNext() {
            if (coursor < getSize() -1) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            return (E) getElement(coursor++);
        }
    }
}
