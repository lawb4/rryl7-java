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
        int crewSize = 19;
        int crewSizeWithCaptain = crewSize + 1;

        // owner gets half the loot
        int coinsToOwner = coins / 2;
        // captain gets half the loot remaining from owner
        int coinsToCaptain = (coins - coinsToOwner) / 2;
        // each crewMember + the captain gets the rest of the money proportionally
        int coinsToEachCrewMember =
                (coins - coinsToOwner - coinsToCaptain) / crewSizeWithCaptain;

        int coinsDistributed = coinsToOwner + coinsToCaptain + (coinsToEachCrewMember * crewSizeWithCaptain);

        System.out.println("coins to owner: " + coinsToOwner);
        System.out.println("coins to captain: " + coinsToCaptain);
        System.out.println("coins to each crew member: " + coinsToEachCrewMember);
        System.out.println("coins to all the  crew member: " + coinsToEachCrewMember * crewSizeWithCaptain);
        System.out.println("coins distributed: " + coinsDistributed);
        System.out.println("coins leftover: " + (coins - coinsDistributed));


    }
}
