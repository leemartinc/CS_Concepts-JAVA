import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
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
            }else{
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
