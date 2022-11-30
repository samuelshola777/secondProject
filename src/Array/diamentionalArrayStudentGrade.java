package Array;

import java.util.Scanner;

public class diamentionalArrayStudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of student  ");
        int student = input.nextInt();

        System.out.println(" enter number of subject ");
        int subject = input.nextInt();

        int[][] classroom = new int[student][subject];

        for (int i = 0; i < classroom.length; i++) {
            System.out.printf("please enter grade for student  %d%n%n ", i + 1);

            for (int j = 0; j < classroom.length; j++) {
                System.out.printf("please enter grade for  student %d%n ",i+1);
                System.out.printf("please enter score for  subject %d%n%n ", j + 1);
            int counter = 0;

                classroom[i][j] = input.nextInt();
                System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>\n\n" +
                        "saved successfully\n");
            }

        }
        int Student1sub1 = classroom[0][0];
        int student1sub2 = classroom[0][1];
        int student1sub3 = classroom[0][2];

        int Student2sub1 = classroom[1][0];
        int student2sub2 = classroom[1][1];
        int student2sub3 = classroom[1][2];

        int student3sub1 = classroom[2][0];
        int student3sub2 = classroom[2][1];
        int student3sub3 = classroom[2][2];

       diamentionalgradeTest.printSubject1(Student1sub1, Student2sub1, student3sub1);
       diamentionalgradeTest.printStudent2(Student2sub1, student2sub2, student2sub3);
       diamentionalgradeTest.printStudent3(student3sub1, student3sub2, student3sub3);
    }

}
