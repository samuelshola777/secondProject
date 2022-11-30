package Enum;

import java.security.SecureRandom;

public class Chapter6CharEnum {
    public static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE , WON , LOST };

    private static final int SNAKE_EYES = 2;
    private  static final  int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11 ;
    private static final int BOX_CARS = 12;


    public static int rollDice(){

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("player rolled %d + %d = %d%n ", die1 , die2, sum);

        return sum;
    }

    public static void main(String[] args) {


        int myPoint = 0;

    Status gameStaus;

    int sumOfDice = rollDice();

    switch (sumOfDice){
        case SEVEN :
        case YO_LEVEN:
            gameStaus = Status.WON;
            break;
        case SNAKE_EYES:
        case TREY:
        case BOX_CARS:
            gameStaus = Status.LOST;
            break;
        default:
            gameStaus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("point is %d%n", myPoint);
        break;
    }
while (gameStaus == Status.CONTINUE){
    sumOfDice = rollDice();

    if (sumOfDice == myPoint){
        gameStaus = Status.WON;
    }
    else {
        if (sumOfDice == SEVEN){
            gameStaus = Status.LOST;
        }
    }
}


    }


}
