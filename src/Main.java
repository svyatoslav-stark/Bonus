public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishment = 1100;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int clientAccount = initialBalance + replenishment + bonus;


        System.out.println("Итоговый баланс: " + clientAccount + " рублей.");
        System.out.println("Количество бонусных рублей " + bonus);
    }
}
