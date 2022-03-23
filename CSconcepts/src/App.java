import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;


public class App {
    public static void main(String[] args)
    {



    }

    public static void _2dArrayGrades(){
        String[][] grades= {{"79", "94", "88", "81"},
                {"34", "77", "75", "64"},
                {"100", "67", "66", "92"},
                {"87", "88", "95", "73"}};

        for(int row = 0; row < grades.length; row++)
        {
            for(int col = 0; col < grades[row].length; col++)
            {
                if (Integer.parseInt(grades[row][col]) >= 90 && Integer.parseInt(grades[row][col])  <= 100) //convert the String to Integer
                {
                    grades[row][col] = "A";
                }

                else if (Integer.parseInt(grades[row][col]) >= 80 && Integer.parseInt(grades[row][col]) <= 89)
                {
                    grades[row][col] = "B";
                }

                else if (Integer.parseInt(grades[row][col]) >= 70 && Integer.parseInt(grades[row][col]) <= 79)
                {
                    grades[row][col] = "C";
                }

                else //(Integer.parseInt(grades[row][col]) >= 0 && Integer.parseInt(grades[row][col]) <= 69)
                {
                    grades[row][col] = "F";
                }

            }


        }


        for(int row = 0; row < grades.length; row++)
        {
            for(int col = 0; col < grades[row].length; col++) {
                System.out.print(grades[row][col] + " ,");
            }
            System.out.println();
        }
    }

    public static void awtTest(){
        Frame myFrame = new Frame();
        myFrame.setSize(400,300);
        myFrame.setTitle("Graphics Testing");
        myFrame.setVisible(true);

        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void swingTest(){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Click me");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }

    public static void more2dArray(){
        int [][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}};


        for (int i =0; i < arr.length; i++)
        {

            for (int j =0; j < arr[0].length; j++)
            {

                if(arr[i][j] == 6) {
                    System.out.println("i of 6 is: " + i);
                    System.out.println("j of 6 is: " + j);
                }

            }
            System.out.println();
        }


        //i of 5: 9
        //j of 5: 9


    }

    public static void scannerInfo(){     System.out.print("Put one integer: "); //asks user to input info
        Scanner userInput = new Scanner(System.in); //accepts input from user
        String theString = userInput.nextLine(); //saves user input

        System.out.println(theString);}

    public static void prev(){
        int [] elements = {2,56,98,22,9,1,12,54,33};

        for (int j = 0; j < elements.length-1; j++)      // line 1
        {
            int minIndex = j;                               // line 2
            for (int k = j; k < elements.length; k++)       // line 3
            {
                if (elements[k] < elements[minIndex])        // line 4
                {
                    minIndex = k;                             // line 5
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }

        for(int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
        }
    }

    public static void selectionSort(int[] elements) {
        for (int j = 0; j < elements.length-1; j++)      // line 1
        {
            int minIndex = j;                               // line 2
            for (int k = j; k < elements.length; k++)       // line 3
            {
                if (elements[k] < elements[minIndex])        // line 4
                {
                    minIndex = k;                             // line 5
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void removeZerosArrayList () {
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(0);
        list1.add(0);
        list1.add(32);
        list1.add(65);
        list1.add(24);

        int k = 0;
        //Integer zero = new Integer(0);
        int zero = 0;

        while (k < list1.size())
        {
            if (list1.get(k).equals(zero)){
                // System.out.println("Remove: " + list1.get(k));
                list1.remove(k);
                //this else statement is the fix
            }

            else{
                k++;
            }
        }
        System.out.println(list1);
    }

    public static void singToMe () {
        DoYouHear l1 = new DoYouHear();

        l1.mainChorus( "night wind", "little lamb", "see");
        System.out.println("Said the " + l1.getPerson1()+ " to the " + l1.getPerson2());
        System.out.println("Do you " + l1.getAction() + " what I " + l1.getAction() + " ?");


        DoYouHear l2 = new DoYouHear();
        l2.mainChorus( "little lamb", "shepherd boy", "hear");
        System.out.println("Said the " + l2.getPerson1()+ " to the " + l2.getPerson2());
        System.out.println("Do you " + l2.getAction() + " what I " + l2.getAction() + " ?");

    }

    public static void _2dArray (){


        int[][] arr = new int[10][10];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);


        int[][] arr2 = { { 1, 2 },
                        { 3, 4 } };

        //arr2.length
        for (int i = 0; i < 2; i++)
            //arr2[i].length
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);


        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }

    }

    public static void _ArrayList (){
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //get, set, add, remove, clear, size,


        //for (int i = 0; i < cars.size(); i++) {
        //      System.out.println(cars.get(i));
        //    }


        //for (String i : cars) {
        //      System.out.println(i);
        //    }


        //Collections.sort(cars);  // Sort cars

    }
}
