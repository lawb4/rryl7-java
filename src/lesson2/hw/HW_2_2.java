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
        //int owner = 1;
        int captain = 1;
        int crewWithoutCaptainCount = 10;
        int crewWithCaptainCount = crewWithoutCaptainCount + captain;

        int coinsToOwner = coins / 2;
        int coinsToCaptain = coinsToOwner / 2;
        int coinsToEachCrewMember =
                coinsToCaptain / (crewWithoutCaptainCount + captain);

        System.out.println(coinsToOwner);
        System.out.println(coinsToCaptain);
        System.out.println(coinsToEachCrewMember);

        System.out.println(isCorrectCoinsDivision
                (coinsToOwner, coinsToCaptain, coinsToEachCrewMember, crewWithCaptainCount));
    }

    public static boolean isCorrectCoinsDivision
            (int coinsToOwner, int coinsToCaptain, int coinsToCrew, int crewWithCaptainCount) {

        int allCoins = coinsToOwner + coinsToCaptain + (coinsToCrew * crewWithCaptainCount)
        return allCoins % 2 == 0;
    }
}
