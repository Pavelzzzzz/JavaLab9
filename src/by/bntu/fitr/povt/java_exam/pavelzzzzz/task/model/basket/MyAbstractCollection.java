package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

/**
 * Created by pavel on 04.04.17.
 */
public abstract class MyAbstractCollection<E> implements MyInterface<E> {
    private int size;
    private E[] array;

    public MyAbstractCollection() {
        this.array = (E[]) new Object[0];
        this.size = 0;
    }

//    public MyIterator<E> iterator() {
//        return new MyIterator<E>();
//    }
    private void incCapasity() {
        E[] array2 = (E[]) new Object[size + 1];
        System.arraycopy(array, 0, array2, 0, size);
        array = array2;
    }
    
    public void deleteElementAt(int index){
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    size);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int j = size - index - 1;
        if (j > 0) {
            System.arraycopy(array, index + 1, array, index, j);
        }
        size--;
    }

    public void addElement(E element) {
        incCapasity();
        array[size] = element;
        size++;
    }

    public E getElement(int index){
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    size);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return array[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < size; i++){
            out.append("   ");
            out.append(array[i].toString());
            out.append("\n");
        }
        return out.toString();
    }

    //    public void removeOf(
//    )

//    private class MyIterator<E> implements Iterator<E> {
//        private int coursor = 0;
//
//        @Override
//        public boolean hasNext() {
//            if (coursor < size) {
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        public E next() {
//            return (E) array[coursor++];
//        }
//    }
}
