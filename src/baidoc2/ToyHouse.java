package baidoc2;

public class ToyHouse implements Toy,Movable,Flyable {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("ToyPlace: Start moving plane.");
    }

    @Override
    public void move() {
        System.out.println("ToyPlace: Start moving plane.");
    }
}
