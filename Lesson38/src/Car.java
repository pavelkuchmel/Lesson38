public class Car {

    private String name;
    private int year;
    private int price;
    private double volume;
    private String color;

    public Car(String name, int year, int price, double volume, String color) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.volume = volume;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return  "Name: " + name  +
                "\nYear=" + year +
                "\nPrice=" + price +
                "\nVolume=" + volume;
    }
}
