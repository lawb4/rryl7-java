package lesson7.hw7_1;

/*Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
если пол указан как мужской и префикс “Mrs. ” если женский*/

public class Main {
    public static void main(String[] args) {
        Person man = new Person();
        man.name = "Yegor";
        man.sex = true;
        System.out.println(man.getName());

        Person woman = new Person();
        woman.name = "Yanina";
        woman.sex = false;
        System.out.println(woman.getName());
    }
}
