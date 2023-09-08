package lesson9;

public class Main {
    public static void main(String[] args) {
        MyResult result1 = myMethod(1, 7);

        //myMethod
        System.out.println("myMethod()");
        System.out.println(result1.sum);
        System.out.println(result1.mul);
        System.out.println(result1.module);

        //myMethodV2
        System.out.println("myMethodV2()");
        myMethodV2(2, 10, result1);
        System.out.println(result1.sum);

        //printAll
        System.out.println("printAll()");
        result1.printAll();

        //myMethodV3
        System.out.println("myMethodV3()");
        MyResult result3 = new MyResult();
        result3.myMethodV3(1, 7);
        result3.printAll();

        //using MyResultUtils class with createResult()
        System.out.println("using MyResultUtils class with createResult()");
        MyResult result4 = MyResultUtils.createResult(4, 7);
        result4.printAll();

        //using MyResultUtils class with createResultAndPrintAll()
        System.out.println("using MyResultUtils class with createResultAndPrintAll()");
        MyResult result5 = MyResultUtils.createResultAndPrintAll(4, 7);
        result5.printAll();
    }

    public static MyResult myMethod(int a, int b) {
        MyResult myResult = new MyResult();

        myResult.sum = a + b;
        myResult.mul = a * b;
        myResult.module = a % b;

        return myResult;
    }

    public static void myMethodV2(int a, int b, MyResult myResult) {
        myResult.sum = a + b;
        myResult.mul = a * b;
        myResult.module = a % b;
    }
}
