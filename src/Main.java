public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int money[] = {356, 213, 415, 362, 211};
        int moneySum = 0;
        for (int current : money) {
            moneySum += current;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", moneySum);
        System.out.println(" ");
        System.out.println("Exercise 2");
        int moneyForADay[] = {65, 89, 21, 95, 74};
        int maxMoneyFoeADay = 0;
        int minMoneyFoeADay = 1000;
        for (int current : moneyForADay) {
            if (current > maxMoneyFoeADay) {
                maxMoneyFoeADay = current;
            }
            if (current < minMoneyFoeADay) {
                minMoneyFoeADay = current;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. " +
                "Максимальная сумма трат за неделю составила %s рублей.\n", minMoneyFoeADay, maxMoneyFoeADay);
        System.out.println(" ");
        System.out.println("Exercise 3");
        int moneyForaWeek[] = {325, 419, 301, 512, 362};
        int moneyForAWeekSum = 0;
        for (int current : moneyForaWeek) {
            moneyForAWeekSum += current;
        }
        double averageMoneyForAWeek = (double) moneyForAWeekSum / moneyForaWeek.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", averageMoneyForAWeek);
        System.out.println(" ");
        System.out.println("Exercise 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}