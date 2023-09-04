package lesson7.hw7_2;

/*Необходимо создать класс Employee с полями как у Person
(из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee)
который возвращает true,
если у сотрудника у которого был вызван метод
и сотрудника который был передан как параметр, одинаковое имя.*/

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Yahor";

        Employee emp2 = new Employee();
        emp2.name = "yahor";

        Employee emp3 = new Employee();
        emp3.name = "Yahor";

        Employee emp4 = new Employee();
        emp4.name = "Yanina";

        System.out.println(emp1.isSameName(emp1)); //true
        System.out.println(emp1.isSameName(emp2)); //true (because of isSameName() method implementation
        System.out.println(emp1.isSameName(emp3)); //true
        System.out.println(emp1.isSameName(emp4)); //false
    }
}
