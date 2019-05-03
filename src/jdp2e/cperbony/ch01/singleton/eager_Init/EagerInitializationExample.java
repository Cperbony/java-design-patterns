package jdp2e.cperbony.ch01.singleton.eager_Init;

public class EagerInitializationExample {

    public static void main(String[] args) {

        System.out.println("*** Singleton Pattern Demo With Eager Initialization *** \n");

        CaptainEagerInitialization.dummyMethod();

        /*
        CaptainEagerInitialization cei1 = CaptainEagerInitialization.getCaptain();
        System.out.println("Trying to make another captain for your team: ");
        CaptainEagerInitialization cei2 = CaptainEagerInitialization.getCaptain();

        if (cei1 == cei2) {
            System.out.println("Captain and Captain 2 are the same Instance");
        }
        */
    }

}
