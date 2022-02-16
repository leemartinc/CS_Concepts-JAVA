public class DoYouHear {
    private static String Person1;
    private static String Person2;
    private static String Action;


    public static void mainChorus(String initPerson1, String initPerson2, String initAction)
    {
        Person1 =  initPerson1;
        Person2 =  initPerson2;
        Action =  initAction;
    }


    public static String getPerson1(){
        return Person1;
    }

    public static String getPerson2(){
        return Person2;
    }

    public static String getAction(){
        return Action;
    }




}
