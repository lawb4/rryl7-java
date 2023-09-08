package lesson9;

public class MyResult {
    int sum;
    int mul;
    int module;
    int dev;

    void printAll() {
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(module);
        System.out.println(dev);
    }

    public MyResult myMethodV3(int a, int b) {
        MyResult myResult = new MyResult();

        myResult.sum = a + b;
        myResult.mul = a * b;
        myResult.module = a % b;

        return myResult;
    }
}
