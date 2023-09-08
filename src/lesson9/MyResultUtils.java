package lesson9;

public class MyResultUtils {
    public static MyResult createResult(int a, int b) {
        MyResult myResult = new MyResult();
        myResult.myMethodV3(a, b);

        return myResult;
    }

    public static MyResult createResultAndPrintAll(int a, int b) {
        MyResult myResult = new MyResult();
        myResult.myMethodV3(a, b);
        myResult.printAll();

        return myResult;
    }
}
