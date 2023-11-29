import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Laptop> laptops = new HashMap<>();

        laptops.put(
                1,
                new Laptop(
                        "Asus", "GX650PI-N4019W", "Windows 11 Home",
                        "AMD Ryzen 9 7945HX", "RTX 4070",
                        "Black", 16, 32, 1024, 720, 211_500,
                        "https://www.dns-shop.ru/product/0136df66d9c4ed20/16-noutbuk-asus-rog-zephyrus-duo-16-gx650pi-n4019w-cernyj/"
                ));
        laptops.put(
                2,
                new Laptop(
                        "Apple", "MacBook Air", "macOS",
                        "Apple M1", "Apple M1 7-core",
                        "Gold", 13.3, 8, 256, 720, 211_500,
                        "https://www.dns-shop.ru/product/210d3df8e862ed20/133-noutbuk-apple-macbook-air-zolotistyj/"
                ));
        laptops.put(
                3,
                new Laptop(
                        "GIGABYTE", "G5 MF", "Linux",
                        "Intel Core i5-12500H", "GeForce RTX 4050",
                        "Black", 15.6, 16, 512, 720, 74_990,
                        "https://www.dns-shop.ru/product/bbd9468ebcb2ed20/156-noutbuk-gigabyte-g5-mf-cernyj/characteristics/"
                ));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Параметры по которым можно осуществить сортировку:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Физическая память");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.print("Введите один из указанных параметров: ");

        int filterBy = scanner.nextInt();
        scanner.nextLine();

        switch (filterBy) {
            case 1:
                filterByMemory(laptops);
                break;
            case 2:
                filterByStorage(laptops);
                break;
            case 3:
                filterByOS(laptops);
                break;
            case 4:
                filterByColor(laptops);
                break;
            default:
                System.out.println("Ошибка ввода данных, попробуйте иначе");
        }
    }

    private static void filterByMemory(Map<Integer, Laptop> laptops) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер ОЗУ в Гб: ");
        int minMemory = scanner.nextInt();

        System.out.println("Подходящие ноутбуки по данному запросу:");
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            if (laptop.getValue().getMemory() >= minMemory) {
                System.out.println(laptop.getValue().laptopDetails() + "\n");
            }
        }
        scanner.close();
    }

    private static void filterByStorage(Map<Integer, Laptop> laptops) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер жёсткого диска в Гб: ");
        int minStorage = scanner.nextInt();

        System.out.println("Подходящие ноутбуки по данному запросу:");
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            if (laptop.getValue().getStorage() >= minStorage) {
                System.out.println(laptop.getValue().laptopDetails() + "\n");
            }
        }
        scanner.close();
    }

    private static void filterByOS(Map<Integer, Laptop> laptops) {

        Set<String> allOS = new HashSet<>();
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            allOS.add(laptop.getValue().getOS());
        }

        Map<Integer, String> numericOS = new HashMap<>();
        int i = 1;
        for (String OS : allOS) {
            numericOS.put(i, OS);
            i++;
        }

        for (Map.Entry<Integer, String> nameOS : numericOS.entrySet()) {
            System.out.println(nameOS.getKey() + " - " + nameOS.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер нужной ОС: ");
        int selectedOS = scanner.nextInt();

        System.out.println("Подходящие ноутбуки по данному запросу:");
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            if (laptop.getValue().getOS().equals(numericOS.get(selectedOS))) {
                System.out.println(laptop.getValue().laptopDetails() + "\n");
            }
        }
        scanner.close();
    }

    private static void filterByColor(Map<Integer, Laptop> laptops) {

        Set<String> allColors = new HashSet<>();
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            allColors.add(laptop.getValue().getColor());
        }

        Map<Integer, String> numericColors = new HashMap<>();
        int i = 1;
        for (String color : allColors) {
            numericColors.put(i, color);
            i++;
        }

        for (Map.Entry<Integer, String> nameColor : numericColors.entrySet()) {
            System.out.println(nameColor.getKey() + " - " + nameColor.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер нужной ОС: ");
        int selectedColor = scanner.nextInt();

        System.out.println("Подходящие ноутбуки по данному запросу:");
        for (Map.Entry<Integer, Laptop> laptop : laptops.entrySet()) {
            if (laptop.getValue().getColor().equals(numericColors.get(selectedColor))) {
                System.out.println(laptop.getValue().laptopDetails() + "\n");
            }
        }
        scanner.close();
    }
}