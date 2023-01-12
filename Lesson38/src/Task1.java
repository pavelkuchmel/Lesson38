import java.util.*;

public class Task1 {
    /*
    Задание 1
    Для набора случайно сгенерированных целых чисел
    нужно:
            - Количество четных;
            - Количество нечетных;
            - Количество равных 0;
            - Количество равных значению, введенному пользователем.
     */
    public static void main(String[] args) {
        final int size = 10;
        List <Integer> array = new ArrayList<>(size);

        for (int i = 0; i < size; i++) array.add(new Random().nextInt(11) - 5);

        System.out.println(array);

        System.out.println(array.stream().filter(x -> x % 2 == 0).count());

        System.out.println(array.stream().filter(x -> x % 2 != 0).count());

        System.out.println(array.stream().filter(x -> x % 2 == 0).count());

        System.out.print("Enter numbers: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println(array.stream().filter(x -> x == num).count());
    }
}
