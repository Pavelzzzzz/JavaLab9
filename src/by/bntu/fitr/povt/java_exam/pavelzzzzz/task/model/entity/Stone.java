package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;

public class Stone {

    private int price;
    private int weight;

    public Stone(int inputPrice, int inputWeight) throws NotCorrectValuesMyException {

        if (inputPrice <= 0 || inputPrice > 100000){
            throw new NotCorrectValuesMyException("inputPrice is not correct");
        }
        if (inputWeight <= 0 || inputWeight > 1000){
            throw new NotCorrectValuesMyException("inputWeight is not correct");
        }
        price = inputPrice;
        weight = inputWeight;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Price: ");
        output.append(price);
        output.append(",  Weight: ");
        output.append(weight);
        return output.toString();
    }

    public int getPrice(){
        return (price);
    }

    public int getWeight(){
        return weight;
    }
}
