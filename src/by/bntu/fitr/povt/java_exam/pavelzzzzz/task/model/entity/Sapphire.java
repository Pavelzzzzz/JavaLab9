package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;

public class Sapphire extends Stone {

	private int theNumberOfFaces;

    public Sapphire(int inputPrice, int inputWeight, int inputTheNumberOfFaces) throws NotCorrectValuesMyException {
        super(inputPrice, inputWeight);
        if (inputTheNumberOfFaces <= 0 || inputTheNumberOfFaces > 100){
            throw new NotCorrectValuesMyException("inputTheNumberOfFaces is not correct");
        }
        theNumberOfFaces = inputTheNumberOfFaces;
    }
@Override
    public String toString(){
        return ("Sapphire: " + super.toString() + "  The number of faces = " + theNumberOfFaces);
    }
}
