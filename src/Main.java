public class Main {
    public static void main(String[] args) {
        int moneyAccaunt = 150;
        int depositAmount = 1789;
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусов - " + bonus + " рублей");
        int totalAmount = moneyAccaunt + depositAmount + bonus;
        System.out.println("Итоговый счет - " + totalAmount + "рублей");
    }
}

/* public class Main {
    public static void main(String[] args) {
        int moneyAccaunt = 150;
        int depositAmount = 654;
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусов - " + bonus + " рублей");
        int totalAmount = moneyAccaunt + depositAmount + bonus;
        System.out.println("Итоговый счет - " + totalAmount + "рублей");
    }
} */