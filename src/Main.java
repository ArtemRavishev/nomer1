import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 18, 113),
                new Person("Иван", 31, 114),
                new Person("Кевин", 26, 115),
        };
        Customer[] customers = {
                new Customer("Лиза", 24, 122, 1301),
                new Customer("Андрей", 26, 123, 3100),
                new Customer("Роберт", 32, 124, 3133),
                new Customer("Надя", 19, 125, 6757),
        };
        Gamer[] gamers = {
                new Gamer("Вова", 16, 132, "ПК"),
                new Gamer("Вадим", 17, 133, "PS5"),
                new Gamer("Серёга", 19, 134, "XBOX"),
                new Gamer("Костя", 23, 135, "PS5")
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }
}


