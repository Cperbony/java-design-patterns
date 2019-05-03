package jdp2e.cperbony.ch01.singleton.bill_pugh;

public class Captain1 {

    private Captain1() {
        System.out.println("A captain is elected for your team");
    }

    //Bill Pugh Solution
    private static class SingletonHelper {
        /*Nested class is referenced after getCaptain() is called*/

        private static final Captain1 captain = new Captain1();
    }

    public static Captain1 getCaptain(){
        return SingletonHelper.captain;
    }
    /*public static void dummyMethod()
    {
        System.out.println("It is a dummy method");
    }  */

}
