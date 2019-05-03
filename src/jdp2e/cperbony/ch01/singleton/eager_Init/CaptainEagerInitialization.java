package jdp2e.cperbony.ch01.singleton.eager_Init;

class CaptainEagerInitialization {

    //Early initialization
    private static final CaptainEagerInitialization captain = new CaptainEagerInitialization();

    //We make the constructor private to prevent the use of "new"
    private CaptainEagerInitialization() {
        System.out.println("A Captain is elected for your team");
    }

    /* Global point of access.The method getCaptain() is a public static method*/
    public static CaptainEagerInitialization getCaptain() {
        System.out.println("You have a captain for your team.");
        return captain;
    }

    public static void dummyMethod(){
        System.out.println("It is a dummy method");
    }
}
