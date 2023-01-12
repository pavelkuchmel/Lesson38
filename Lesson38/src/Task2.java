import java.util.*;

public class Task2 {
    /*
    Задание 2
    Для набора названий городов (города могут повторяться) нужно:
            - Показать все города;
            - Показать все города с названием длиннее шесть символов;
            - Посчитать сколько раз встречается город, чье название ввёл пользователь;
            - Показать все города, которые начинаются на заданную букву;
    */
    public static void main(String[] args) {
        List<String> sities = new ArrayList<>(List.of("Минск", "Гомель", "Витебск", "Могилев", "Гродно", "Брест", "Бобруйск", "Барановичи", "Борисов", "Пинск", "Орша", "Мозырь", "Лида", "Солигорск", "Полоцк"));

        sities.stream().forEach(x -> System.out.print(x + " "));

        List<String> dubSities = new ArrayList<>();
        while (dubSities.size() < 30){
            for (String city : sities) {
                if (new Random().nextBoolean()) {
                    dubSities.add(city);
                }
            }
        }
        System.out.println("\n");
        dubSities.stream().forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
        dubSities.stream().filter(x -> x.length() > 6).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
        System.out.print("Enter city name: ");
        String city = new Scanner(System.in).next();
        System.out.println(dubSities.stream().filter(x -> x.equals(city)).count());
        System.out.println("\n");
        System.out.print("Enter firs symbol: ");
        char ch = new Scanner(System.in).next().charAt(0);
        dubSities.stream().filter(x -> x.charAt(0) == ch).forEach(x -> System.out.print(x + " "));

    }
}
