package one_lamda;

public class MyTest {
    public static void main(String[] args) {
        MyLambda myLambda = new MyLambdaImpl();
        System.out.println(myLambda.test());
        testX(myLambda);
        MyLambda myLambda1 = () -> true;
        MyLambdaImpl myLambdaImpl = new MyLambdaImpl();
        testX(myLambdaImpl);

        testX(() -> true);
        testX(new MyLambda() {
            @Override
            public boolean test() {
                return true;
            }
        });
    }

    public static void testX(MyLambda myLambda) {
        System.out.println(myLambda.test());
    }
}
