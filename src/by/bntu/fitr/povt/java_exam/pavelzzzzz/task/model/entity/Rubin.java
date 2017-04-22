package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;

public class Rubin extends Stone {

	private int theNumberOfFaces;

    public Rubin(int inputPrice, int inputWeight, int inputTheNumberOfFaces) throws NotCorrectValuesMyException {
        super(inputPrice, inputWeight);
        if (inputTheNumberOfFaces <= 0 || inputTheNumberOfFaces > 100){
            throw new NotCorrectValuesMyException("inputTheNumberOfFaces is not correct");
        }
        theNumberOfFaces = inputTheNumberOfFaces;
    }
@Override
    public String toString(){
        return ("Rubin: " + super.toString() + "  The number of faces = " + theNumberOfFaces);
    }
}
