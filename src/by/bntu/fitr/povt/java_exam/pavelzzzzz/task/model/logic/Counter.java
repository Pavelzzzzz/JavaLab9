package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.logic;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.Necklace;

public class Counter {

    public static int calculationPrice(Necklace necklace){
        int price = 0;
        for(int ind = 0; ind < necklace.size(); ind++) {
            price += necklace.getElement(ind).getPrice();
        }
        return price;
    }

    public static int calculationWeight(Necklace necklace){
        int weight = 0;
        for(int ind = 0; ind < necklace.size(); ind++) {
            weight += necklace.getElement(ind).getWeight();
        }
        return weight;
    }
}
