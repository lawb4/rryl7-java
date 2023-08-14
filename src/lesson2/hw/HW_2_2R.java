package lesson2.hw;

// Task Description:
/*
Создать программу дележа добычи на пиратском корабле.
По обычаю, половина добычи идет владельцу корабля,
    половина оставшегося — капитану,
    остальное делится поровну между всеми членами команды,
    включая капитана.
Размер добычи (например, в пиастрах)
и количество пиратов на корабле задать переменными.
Вывести на экран кому сколько пиастров полагается.
*/

public class HW_2_2R {
    public static void main(String[] args) {
        int totalLoot = 199;
        int crewSize = 25;

        int ownerShare = totalLoot / 2;
        int captainShare = (totalLoot - ownerShare) / 2;
        int commonShare = (totalLoot - ownerShare - captainShare) / crewSize;

        int totalDistibuted = ownerShare + captainShare + (commonShare * crewSize);

        System.out.println("Money to the owner: " + ownerShare);
        System.out.println("Money to the captain: " + captainShare);
        System.out.println("Money to a crew member: " + commonShare);
        System.out.println("Total Loot: " + totalDistibuted);
        System.out.println("Leftover: " + (totalLoot - totalDistibuted));
    }
}
