package jdp2e.cperbony.ch02.prototype;

public class Nano extends BasicCar {

    //A base price for nano
    public int basePrice = 100000;

    public Nano(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();

    }
}
