import java.util.*;

public class Task3and4 {
    /*
    Задание 3
        Создайте класс Автомобиля. Он должен хранить
        информацию о названии автомобиля, год выпуска, цена,
        цвет, объем двигателя. Нужно создать набор автомобилей
        и выполнить следующие задачи:
            - Показать все автомобили;
            - Показать все автомобили заданного цвета;
            - Показать все автомобили заданного объёма;
            - Показать все автомобили дороже заданной цены;
            - Показать все автомобили чей год выпуска находится
                в указанном диапазоне
     Задание 4
        Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель. Нужно создать набор телевизоров
        и выполнить следующие задачи:
            - Показать все телевизоры;
            - Показать телевизоры с заданной диагональю;
            - Показать все телевизоры одного производителя;
            - Показать все телевизоры текущего года;
            - Показать все телевизоры дороже заданной цены;
            - Показать все телевизоры, отсортированные по цене
                по возрастанию;
            - Показать все телевизоры, отсортированные по цене
                по убыванию.
            - Показать все телевизоры, отсортированные по диагонали по возрастанию;
            - Показать все телевизоры, отсортированные по диагонали по убыванию
     */

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(List.of(new Car("BMW", 2012, 35300, 2.0, "Blue"), new Car("Peugeot", 2008, 5500, 1.6, "Green"),
                new Car("Volkswagen", 2015, 9000, 1.6, "White"), new Car("Audi", 1998, 3000, 2.3, "Blue"),
                new Car("Shkoda", 2021, 13800, 1.6, "Black"), new Car("Renault", 2015, 7500, 1.6, "Green"),
                new Car("Range Rover", 2018, 70000, 5.0, "White"), new Car("Jaguar", 2010, 35400, 3.0, "Blue"),
                new Car("Geely", 2023, 45050, 1.5, "Red"), new Car("Haval", 2023, 41000, 2.0, "Red")));

        //cars.stream().forEach(x -> System.out.println(x.toString() + "\n"));

        /*System.out.print("Enter color: ");
        String colorCar = new Scanner(System.in).next();

        cars.stream().filter(x -> x.getColor().equals(colorCar)).forEach(x -> System.out.println(x.toString() + "\n"));

        System.out.print("Enter volume: ");
        double volumeCar = new Scanner(System.in).nextDouble();

        cars.stream().filter(x -> x.getVolume() == volumeCar).forEach(x -> System.out.println(x.toString() + "\n"));

        System.out.print("Enter price: ");
        int priceCar = new Scanner(System.in).nextInt();

        cars.stream().filter(x -> x.getPrice() == priceCar).forEach(x -> System.out.println(x.toString() + "\n"));

        System.out.print("Enter low year: ");
        int lowYear = new Scanner(System.in).nextInt();
        System.out.print("Enter up year: ");
        int upYear = new Scanner(System.in).nextInt();

        System.out.println();

        cars.stream().filter(x -> x.getYear() > lowYear && x.getYear() < upYear).forEach(x -> System.out.println(x.toString() + "\n"));*/

        /*System.out.println("Price to upper: ");
        cars.stream().sorted(new CarComparatorUp()).forEach(x -> System.out.println(x.toString() + "\n"));
        System.out.println("Price to downer: ");
        cars.stream().sorted(new CarComparatorDown()).forEach(x -> System.out.println(x.toString() + "\n"));*/

        System.out.println(new GregorianCalendar().getTime());
        System.out.println("Cars of now year: ");
        cars.stream().filter(x -> x.getYear() == new GregorianCalendar().get(Calendar.YEAR)).forEach(x -> System.out.println(x.toString() + "\n"));

    }

    static class CarComparatorUp implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
            return Integer.compare(car1.getPrice(), car2.getPrice());
        }
    }
    static class CarComparatorDown implements Comparator<Car> {
        @Override
        public int compare(Car car2, Car car1) {
            return Integer.compare(car1.getPrice(), car2.getPrice());
        }
    }
}
