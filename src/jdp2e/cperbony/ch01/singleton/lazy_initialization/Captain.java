package jdp2e.cperbony.ch01.singleton.lazy_initialization;

final class Captain {

    private static Captain captain;

    //We make the constructor private to prevent the use of "new"
    private Captain() {
    }

    public static synchronized Captain getCaptain() {
        //Lazy Initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("New Captain is elected for your team");
        } else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
    // We cannot extend Captain class.The constructor is private in this case
    //Only one instance
}
