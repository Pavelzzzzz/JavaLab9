package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

public class MyBadStack<E>{
    private int mSize;
    private E[] stackArray;
    private int top;

    public MyBadStack(E[] stackArray) {
        this.stackArray = stackArray;
        this.mSize = stackArray.length;
        this.top = -1;
    }

    public void addElement(E element) {
        if (isFull()){
            resizeArray();
        }
        stackArray[++top] = element;
    }

    public E deleteElement() {
        return stackArray[top--];
    }

    public E readTop() {
        return stackArray[top];

    }

    public int getSize() {
        return mSize;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    private boolean isFull() {
        return (top == mSize - 1);
    }

    private void resizeArray(){
        E[] newStackArray = (E[])new Object[mSize + 5];
        for (int ind = 0; ind < mSize; ind++){
            newStackArray[ind] = stackArray[ind];
        }
        stackArray = newStackArray;
        mSize = stackArray.length;
    }

//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }
//
//    @Override
//    public void forEach(Consumer<? super E> action) {
//
//    }
//
//    @Override
//    public Spliterator<E> spliterator() {
//        return null;
//    }

//    private class Itr implements Iterator<E> {
//        int cursor;       // index of next element to return
//        int lastRet = -1; // index of last element returned; -1 if no such
//        int expectedModCount = modCount;
//
//        public boolean hasNext() {
//            return cursor != size;
//        }
//
//        @SuppressWarnings("unchecked")
//        public E next() {
//            checkForComodification();
//            int i = cursor;
//            if (i >= size)
//                throw new NoSuchElementException();
//            Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void remove() {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try {
//                ArrayList.this.remove(lastRet);
//                cursor = lastRet;
//                lastRet = -1;
//                expectedModCount = modCount;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//
//        @Override
//        @SuppressWarnings("unchecked")
//        public void forEachRemaining(Consumer<? super E> consumer) {
//            Objects.requireNonNull(consumer);
//            final int size = ArrayList.this.size;
//            int i = cursor;
//            if (i >= size) {
//                return;
//            }
//            final Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length) {
//                throw new ConcurrentModificationException();
//            }
//            while (i != size && modCount == expectedModCount) {
//                consumer.accept((E) elementData[i++]);
//            }
//            // update once at end of iteration to reduce heap write traffic
//            cursor = i;
//            lastRet = i - 1;
//            checkForComodification();
//        }
//
//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }
//    }
}
