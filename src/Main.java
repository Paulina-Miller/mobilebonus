public class Main {
    public static void main(String[] args) {
        int account = 90;   // начальный счет клента
        int amount = 1436;   //  сумма пополнения
        int bonus;


        if (amount > 1000) {
            int fullHundred = amount / 100;   // полные 100 рублей
            bonus = fullHundred * 1;     // количество бонусов
            System.out.println("Количество бонусов: " + bonus + " рублей");
        } else {
            bonus = 0;
            System.out.println("Бонусов нет");
        }

        int totalAmount = account + amount + bonus;
        System.out.println("Итоговая сумма на счету клиента: " + totalAmount + " рублей");
    }
}
