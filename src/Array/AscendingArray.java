package Array;

public class AscendingArray {
    public static void main(String[] args) {

        int[] arrayBoneshaker = {7, 4, 9, 3, 5, 1, 2, 3, 8, 6 };
        int receivingVariable = 0;

        for (int counter1 = 0 ; counter1 < arrayBoneshaker.length; counter1++){
            for (int counter2= 0 ; counter2 < arrayBoneshaker.length; counter2++){

            if (arrayBoneshaker[counter1] < arrayBoneshaker[counter2]){
                receivingVariable = arrayBoneshaker[counter1];
                arrayBoneshaker[counter1] = arrayBoneshaker[counter2];
                arrayBoneshaker[counter2] = receivingVariable;
            }
            }
        }


for (int printOut = 0; printOut < arrayBoneshaker.length; printOut++){
    System.out.println(arrayBoneshaker[printOut]);
}

for (int counter1 = 0; counter1 < arrayBoneshaker.length; counter1++){

    for (int counter2 = arrayBoneshaker.length; counter2 < arrayBoneshaker.length ; counter2++){
        if (arrayBoneshaker[counter1] < arrayBoneshaker[counter2]){
            receivingVariable = arrayBoneshaker[counter1];


        }
    }
}

    }
}
