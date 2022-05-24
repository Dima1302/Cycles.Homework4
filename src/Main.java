public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task2() {
        int fridayNumber;
        for (fridayNumber = 3; fridayNumber <= 31; fridayNumber = fridayNumber + 7) {

            System.out.println("Сегодня пятница, " + fridayNumber + " число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int startingYear = 1896;
        int endingYear = 2122;
        for (int i = startingYear; i <= endingYear; i = i + 79) {
            System.out.println(i);
        }
    }
}
