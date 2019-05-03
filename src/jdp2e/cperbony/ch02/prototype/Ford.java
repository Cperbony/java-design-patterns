package jdp2e.cperbony.ch02.prototype;

public class Ford extends BasicCar {

    //A base price for nano
    public int basePrice = 100000;

    public Ford(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
