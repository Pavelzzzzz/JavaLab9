package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;

import java.util.Iterator;

public class CounterByIterator {

    public static int calculationPrice(Iterator<Stone> necklaceIterator){
        int price = 0;
        while(necklaceIterator.hasNext()) {
            price += necklaceIterator.next().getPrice();
        }
        return price;
    }

    public static int calculationWeight(Iterator<Stone> necklaceIterator){
        int weight = 0;
        while(necklaceIterator.hasNext()) {
            weight += necklaceIterator.next().getWeight();
        }
        return weight;
    }
}
