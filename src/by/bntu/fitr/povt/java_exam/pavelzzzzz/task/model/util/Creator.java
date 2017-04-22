package by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.util;

import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.basket.Necklace;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Amber;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Rubin;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.entity.Sapphire;
import by.bntu.fitr.povt.java_exam.pavelzzzzz.task.model.myException.NotCorrectValuesMyException;

import java.util.Random;

/**
 * Created by pavel on 09.03.17.
 */
public class Creator {

        public static Necklace createNecklace(int necklaceType, int stoneCout) throws NotCorrectValuesMyException{
            try {
                Random rand = new Random();
                Necklace necklace = new Necklace();
                if (necklaceType == 1) {
                    for (int i = 0; i < stoneCout; i++) {
                        necklace.addStone(new Amber(rand.nextInt(99999) +1 ,
                                rand.nextInt(49) +1, rand.nextInt(999) + 1));
                    }
                } else {
                    if (necklaceType == 2) {
                        for (int i = 0; i < stoneCout; i++) {
                            necklace.addStone(new Rubin(rand.nextInt(99999) +1 ,
                                    rand.nextInt(49) +1, rand.nextInt(99) + 1));
                        }
                    } else {
                        if (necklaceType == 3) {
                         for (int i = 0; i < stoneCout; i++)
                                necklace.addStone(new Sapphire(rand.nextInt(99999) +1,
                                        rand.nextInt(49) +1, rand.nextInt(99) + 1));
                        } if (necklaceType != 1 && necklaceType != 2 && necklaceType != 3){
                            throw new NotCorrectValuesMyException("The type is not correct");
                        }
                    }
                }
                return necklace;
            }
            catch (NotCorrectValuesMyException ex){
                throw new NotCorrectValuesMyException("Error is in creator " + ex.getMessage());
            }
        }
}

