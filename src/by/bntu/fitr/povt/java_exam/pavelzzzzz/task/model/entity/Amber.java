package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;

public class Amber extends Stone {

	private int dia;

    public Amber(int inputPrice, int inputWeight, int inputDia) throws NotCorrectValuesMyException {
        super(inputPrice, inputWeight);
        if (inputDia <= 0 || inputDia > 1000){
            throw new NotCorrectValuesMyException("inputDia is not correct");
        }
        dia = inputDia;
    }

    @Override
    public String toString(){
        return ("Amber: " + super.toString() + "  Diameter = " + dia);
    }
}
