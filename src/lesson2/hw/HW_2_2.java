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

public class HW_2_2 {
    public static void main(String[] args) {
        int coins = 1000;
        int crewSize = 21;

        int coinsToOwner = coins / 2;
        int coinsToCaptain = (coins - coinsToOwner) / 2;
        int coinsToEachCrewMember =
                (coins - coinsToOwner - coinsToCaptain) / crewSize;

        int coinsDistributed = coinsToOwner + coinsToCaptain + (coinsToEachCrewMember * crewSize);

        System.out.println("coins to owner: " + coinsToOwner);
        System.out.println("coins to captain: " + coinsToCaptain);
        System.out.println("coins to each crew member: " + coinsToEachCrewMember);
        System.out.println("coins distributed: " + coinsDistributed);
        System.out.println("coins leftover: " + (coins - coinsDistributed));


    }
}
