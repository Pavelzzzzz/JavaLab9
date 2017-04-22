package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Stone;

import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private List<Stone> array;

    public Necklace(){
        array = new ArrayList<>();
    }

    public Necklace(List<Stone> list){
        array = list;
    }

    public void addStone(Stone x){
        array.add(x);
    }

    public Stone getElement(int ind){
        return (array.get(ind));
    }

    public int size(){
        return array.size();
    }

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < array.size(); i++){
            out.append("   ");
            out.append(array.get(i).toString());
            out.append("\n");
        }
        return out.toString();
    }
}
