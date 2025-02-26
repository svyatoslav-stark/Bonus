public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishmentOne = 300;
        int replenishmentTwo = 1100;

        int bonus = 0;
        if (replenishmentOne > 1000) {
            bonus = replenishmentOne / 100;
        }
        if (replenishmentTwo > 1000) {
            bonus = replenishmentTwo / 100;
        }
        int clientAccount = initialBalance + replenishmentOne + replenishmentTwo + bonus;


        System.out.println("Итоговый баланс: " + clientAccount + " рублей.");
        System.out.println("Количество бонусных рублей " + bonus);
    }
}
