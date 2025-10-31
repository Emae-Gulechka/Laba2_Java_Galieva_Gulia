import java.util.Scanner;
import java.util.InputMismatchException;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ДЕМОНСТРАЦИЯ ЗАДАНИЙ");

        // Задание 1
        demoClass1();

        // Задание 2
        demoClass2();

        // Задание 3
        demoClass3();

        // Задание 4.1
        demoClass4_1();

        // Задание 4.2
        demoClass4_2();

        // Задание 5
        demoClass5();

        scanner.close();
    }

    // Функция для демонстрации Class1 (Задание 1)
    public static void demoClass1() {
        System.out.println("\n ЗАДАНИЕ 1: ТОЧКА");

        // Создание трех точек с разными координатами
        Class1 point1 = new Class1(1, 2);
        Class1 point2 = new Class1(3, 4);
        Class1 point3 = new Class1(5, 6);

        System.out.println("Точка 1: " + point1.getTextRepresentation());
        System.out.println("Точка 2: " + point2.getTextRepresentation());
        System.out.println("Точка 3: " + point3.getTextRepresentation());

        // Ввод точки с клавиатуры
        System.out.println("\nСоздание точки с вводом координат:");
        Class1 userPoint = inputClass1();
        System.out.println("Ваша точка: " + userPoint.getTextRepresentation());
    }

    // Функция для демонстрации Class2 (Задание 2)
    public static void demoClass2() {
        System.out.println("\n ЗАДАНИЕ 2: ЛИНИЯ");

        // 1. Линия 1 с началом в т. {1;3} и концом в т.{23;8}
        Class1 start1 = new Class1(1, 3);
        Class1 end1 = new Class1(23, 8);
        Class2 line1 = new Class2(start1, end1);

        // 2. Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25
        Class1 start2 = new Class1(5, 10);
        Class1 end2 = new Class1(25, 10);
        Class2 line2 = new Class2(start2, end2);

        // 3. Линия 3, которая начинается там же, где линия 1, и заканчивается там же, где линия 2
        Class2 line3 = new Class2(line1.getStart(), line2.getEnd());

        System.out.println("Исходные линии:");
        System.out.println("Линия 1: " + line1.getTextRepresentation());
        System.out.println("Линия 2: " + line2.getTextRepresentation());
        System.out.println("Линия 3: " + line3.getTextRepresentation());

        // 4. Изменение координат первой и второй линий
        System.out.println("\nПосле изменения координат:");
        line1.getStart().setCoordinates(2, 4);
        line2.getEnd().setCoordinates(30, 15);

        System.out.println("Линия 1: " + line1.getTextRepresentation());
        System.out.println("Линия 2: " + line2.getTextRepresentation());
        System.out.println("Линия 3: " + line3.getTextRepresentation());

        // 5. Изменение координат первой линии без влияния на третью
        System.out.println("\nСоздание новой точки для линии 1:");
        Class1 newStart = new Class1(0, 0);
        line1.setStart(newStart);

        System.out.println("Линия 1: " + line1.getTextRepresentation());
        System.out.println("Линия 3: " + line3.getTextRepresentation());
    }

    // Функция для демонстрации Class3 (Задание 3)
    public static void demoClass3() {
        System.out.println("\nЗАДАНИЕ 3: СТУДЕНТ");

        // 1. Создать студента Васю с оценками: 3,4,5
        int[] vasyaGrades = {3, 4, 5};
        Class3 vasya = new Class3("Вася", vasyaGrades);

        // 2. Создать студента Петю и скопировать оценки Васи
        int[] petyaGrades = vasya.getGrades(); // Копирование ссылки!
        Class3 petya = new Class3("Петя", petyaGrades);

        // 3. Заменить первую оценку Пети на число 5
        petya.getGrades()[0] = 5;

        System.out.println("После изменения первой оценки Пети:");
        System.out.println(vasya.getTextRepresentation());
        System.out.println(petya.getTextRepresentation());
        System.out.println("Результат: оценки Васи тоже изменились, потому что была скопирована ссылка на массив");

        // 4. Создать студента Андрея с независимой копией оценок
        int[] andreyGrades = Class3.copyGrades(vasya.getGrades()); // Создание новой копии
        Class3 andrey = new Class3("Андрей", andreyGrades);

        // Изменяем оценки Андрея
        andrey.getGrades()[1] = 2;

        System.out.println("\nПосле создания Андрея с независимой копией:");
        System.out.println(vasya.getTextRepresentation());
        System.out.println(andrey.getTextRepresentation());
        System.out.println("Результат: оценки Васи не изменились при изменении оценок Андрея");
    }

    // Функция для демонстрации Class4_1 (Задание 4.1)
    public static void demoClass4_1() {
        System.out.println("\nЗАДАНИЕ 4.1: ТОЧКА С ОБЯЗАТЕЛЬНЫМИ КООРДИНАТАМИ");

        // Создание точек с обязательными координатами
        Class4_1 point1 = new Class4_1(3, 5);
        Class4_1 point2 = new Class4_1(25, 6);
        Class4_1 point3 = new Class4_1(7, 8);

        System.out.println("Точка 1: " + point1.getTextRepresentation());
        System.out.println("Точка 2: " + point2.getTextRepresentation());
        System.out.println("Точка 3: " + point3.getTextRepresentation());

        // Ввод точки с клавиатуры
        System.out.println("\nСоздание точки с вводом координат:");
        Class4_1 userPoint = inputClass4_1();
        System.out.println("Ваша точка: " + userPoint.getTextRepresentation());
    }

    // Функция для демонстрации Class4_2 (Задание 4.2)
    public static void demoClass4_2() {
        System.out.println("\nЗАДАНИЕ 4.2: ЛИНИЯ С РАЗНЫМИ КОНСТРУКТОРАМИ");

        // 1. Линия 1 с началом в т. {1;3} и концом в {23;8} (через точки)
        Class4_1 start1 = new Class4_1(1, 3);
        Class4_1 end1 = new Class4_1(23, 8);
        Class4_2 line1 = new Class4_2(start1, end1);

        // 2. Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25 (через координаты)
        Class4_2 line2 = new Class4_2(5, 10, 25, 10);

        // 3. Линия 3 которая начинается там же где линия 1 и заканчивается там же где линия 2
        Class4_2 line3 = new Class4_2(line1.getStart(), line2.getEnd());

        System.out.println("Линия 1: " + line1.getTextRepresentation());
        System.out.println("Линия 2: " + line2.getTextRepresentation());
        System.out.println("Линия 3: " + line3.getTextRepresentation());
    }

    // Функция для демонстрации Class6 (Задание 5)
    public static void demoClass5() {
        System.out.println("\nЗАДАНИЕ 5: ЛИНИЯ С ДЛИНОЙ");

        // Создание линии из точки {1;1} в точку {10;15}
        Class5 line = new Class5(1, 1, 10, 15);

        System.out.println(line.getTextRepresentation());
        System.out.println("Длина линии: " + line.getLength());

        // Ввод линии с клавиатуры и вычисление длины
        System.out.println("\nСоздание линии с вводом координат:");
        Class5 userLine = inputClass5();
        System.out.println("Ваша линия: " + userLine.getTextRepresentation());
        System.out.println("Длина вашей линии: " + userLine.getLength());
    }
    //ФУНКЦИИ ВВОДА С ПРОВЕРКАМИ

    // Функция ввода для Class1
    public static Class1 inputClass1() {
        double x = inputDouble("Введите координату X: ");
        double y = inputDouble("Введите координату Y: ");
        return new Class1(x, y);
    }

    // Функция ввода для Class4_1
    public static Class4_1 inputClass4_1() {
        double x = inputDouble("Введите координату X: ");
        double y = inputDouble("Введите координату Y: ");
        return new Class4_1(x, y);
    }

    // Функция ввода для Class5
    public static Class5 inputClass5() {
        System.out.println("Введите координаты начала линии:");
        double x1 = inputDouble("X1: ");
        double y1 = inputDouble("Y1: ");

        System.out.println("Введите координаты конца линии:");
        double x2 = inputDouble("X2: ");
        double y2 = inputDouble("Y2: ");

        return new Class5(x1, y1, x2, y2);
    }

    // Универсальная функция для ввода double с проверкой
    public static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите числовое значение.");
                scanner.nextLine(); // очистка буфера
            }
        }
    }

    // Универсальная функция для ввода int с проверкой
    public static int inputInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.nextLine(); // очистка буфера
            }
        }
    }
}