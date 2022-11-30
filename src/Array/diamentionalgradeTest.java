package Array;

public class diamentionalgradeTest {
    public static void greatestStudentSubject1(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println(" highest scoring  student  is  : student 1 scoring  "+num1);
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println("highest scoring  student  is  : student 2 scoring  "+num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(" highest scoring  student  is  : student 3 scoring  "+num3);
        }

    }
    public static void lowestStudentSubject1(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            System.out.println("LOWEST scoring  student  is  : student 1 scoring   "+num1);
        } else if (num2 < num1 && num2 < num3 ) {
            System.out.println("LOWEST scoring  student  is  : student 2 scoring  "+num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println(" LOWEST scoring  student  is  : student  scoring  "+num3);
        }

    }

    public static void greatestStudentSubject2(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println("highest scoring  student  is  : student 1 scoring "+num1);
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println("highest scoring  student  is  : student 2 scoring "+num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("highest scoring  student  is  : student 3 scoring "+num3);
        }

    }
    public static void lowestStudentSubject2(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            System.out.println("LOWEST scoring  student  is  : student 1  scoring : "+num1);
        } else if (num2 < num1 && num2 < num3 ) {
            System.out.println("LOWEST scoring  student  is  : student 2  scoring "+num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("LOWEST scoring  student  is  : student 3 scoring"+num3);
        }

    }
    public static void greatestStudentSubject3(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println("highest scoring  student  is  : student 1 scoring "+num1);
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println(" highest scoring  student  is  : student 2 scoring "+num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("  highest scoring  student  is  : student 3 scoring "+num3);
        }

    }
    public static void lowestStudentSubject3(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            System.out.println("LOWEST scoring  student  is  : student 1 scoring "+num1);
        } else if (num2 < num1 && num2 < num3 ) {
            System.out.println("LOWEST scoring  student  is  : student 2 scoring "+num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("LOWEST scoring  student  is  : student 3 scoring "+num3);
        }

    }
    public static void totalScoreSubject1(int num1, int num2, int num3){
        int sumOfSubject1 = num1 + num2 + num3;
        System.out.println("total score  :  "+sumOfSubject1);

    } public static void totalScoreSubject2(int num1, int num2, int num3){
        int sumOfSubject1 = num1 + num2 + num3;
        System.out.println("total score is :  "+sumOfSubject1);

    } public static void totalScoreSubject3(int num1, int num2, int num3){
        int sumOfSubject1 = num1 + num2 + num3;
        System.out.println("total score  is :  "+sumOfSubject1);

    }
    public static void averageOfSubject1(int num1, int num2, int num3){
        double average = num1 + num2 + num3 / 3;
        System.out.println("the average score is : "+ average);

    } public static void averageOfSubject2(int num1, int num2, int num3){
        double average = num1 + num2 + num3 / 3;
        System.out.println("the average score is : "+ average);

    }
    public static void averageOfSubject3(int num1, int num2, int num3){
        double average = num1 + num2 + num3 / 3;
        System.out.println("the average score is : "+ average);

    }
    public static void numbersPassSubject1(int num1, int num2, int num3){
        int pass = 0;
        if (num1 > 80){
            pass ++;
        } if (num2 > 80){
            pass ++;
        } if (num3 > 80){
            pass ++;
        }
        System.out.println("number of pass : "+ pass);
    }
    public static void numbersPassSubject2(int num1, int num2, int num3) {
        int pass = 0;
        if (num1 > 80) {
            pass++;
        }
        if (num2 > 80) {
            pass++;
        }
        if (num3 > 80) {
            pass++;
        }
    }
    public static void numbersPassSubject3(int num1, int num2, int num3) {
        int pass = 0;
        if (num1 > 80) {
            pass++;
        }
        if (num2 > 80) {
            pass++;
        }
        if (num3 > 80) {
            pass++;
        }
    }



        public static void numbersfailedSubject1(int num1, int num2, int num3){
        int fail = 0;
        if (num1 < 45){
            fail ++;
        } if (num2 < 45){
            fail ++;
        } if (num3 < 45){
            fail ++;
        }
        System.out.println("number of fail : "+ fail);
    }
    public static void numbersfailedSubject2(int num1, int num2, int num3){
        int fail = 0;
        if (num1 < 45){
            fail ++;
        } if (num2 < 45){
            fail ++;
        } if (num3 < 45){
            fail ++;
        }
        System.out.println("number of fail : "+ fail);
    }
    public static void numbersfailedSubject3(int num1, int num2, int num3){
        int fail = 0;
        if (num1 < 45){
            fail ++;
        } if (num2 < 45){
            fail ++;
        } if (num3 < 45){
            fail ++;
        }
        System.out.println("number of fail : "+ fail);
    }
    public static void printSubject1(int num1, int num2, int num3){
        System.out.println("SUBJECT SUMMARY");
        System.out.println("subject 1 ");
        diamentionalgradeTest.greatestStudentSubject1(num1, num2,num3);
        diamentionalgradeTest.lowestStudentSubject1(num1, num2, num3);
        diamentionalgradeTest.totalScoreSubject1(num1, num2, num3);
        diamentionalgradeTest.averageOfSubject1(num1, num2, num3);
        diamentionalgradeTest.numbersPassSubject1(num1, num2, num3);
        diamentionalgradeTest.numbersfailedSubject1(num1, num2, num3);
    }
    public static void printStudent2(int num1, int num2, int num3){
        System.out.println("SUBJECT SUMMARY\n\n" +
                "subject 2");
        diamentionalgradeTest.greatestStudentSubject2(num1, num2, num3);
        diamentionalgradeTest.lowestStudentSubject2(num1, num2, num3);
        diamentionalgradeTest.totalScoreSubject2(num1, num2, num3);
        diamentionalgradeTest.averageOfSubject2(num1, num2, num3);
        diamentionalgradeTest.numbersPassSubject2(num1, num2 , num3);
        diamentionalgradeTest.numbersPassSubject2(num1, num2, num3);
        diamentionalgradeTest.numbersfailedSubject2(num1, num2, num3);

    }
    public static void printStudent3(int num1, int num2, int num3){
        System.out.println("SUBJECT SUMMARY\n\n" +
                "subject 3");
        diamentionalgradeTest.greatestStudentSubject1(num1, num2, num3);
        diamentionalgradeTest.lowestStudentSubject1(num1, num2, num3);
        diamentionalgradeTest.totalScoreSubject3(num1, num2, num3);
        diamentionalgradeTest.averageOfSubject3(num1, num1, num3);
        diamentionalgradeTest.numbersPassSubject3(num1, num2, num3);
        diamentionalgradeTest.numbersfailedSubject3(num1, num2, num3);
    }

    public static void printReportOfStudents(int num1, int num2, int num3){
        System.out.println("""
    =======================================================================================\n
    STUDENT       SUB1     SUB2      SUB3     TOT      AVE          POS \n
    =======================================================================================
    student 1      
    
                """);
    }

}
