package Treinos.SelfStudy.HowToJava10ed.Chapter6.RandomNumbers;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {


        SecureRandom randomNumbers = new SecureRandom();
        int randomValue = randomNumbers.nextInt(6);

        for (int i = 1; i <= 10; i++){

            System.out.printf("%d  ",randomValue);
            randomValue = randomNumbers.nextInt(6);
        }

    }
}
