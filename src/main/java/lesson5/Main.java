package lesson5;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(100));
//        System.out.println(recFibo(10));

//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3, 8));

//        reversPrint("qwerty".toCharArray());

        System.out.println(exponentiation(2, 5));

        Item[] itemsArray = new Item[5];
        itemsArray[0] = new Item(0, 0);
        itemsArray[1] = new Item(5, 3);
        itemsArray[2] = new Item(10, 5);
        itemsArray[3] = new Item(6, 4);
        itemsArray[4] = new Item(5, 2);

        BackPack backPack = new BackPack(itemsArray,14);
        System.out.println("максимальная ценность: " +backPack.itemsChoose(itemsArray.length - 1, backPack.maxMass));

    }

    public static int exponentiation(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return exponentiation(a, b - 1) * a;
    }


    public static void reversPrint(char[] arr) {
        reversPrint(arr, arr.length - 1);
    }

    private static void reversPrint(char[] arr, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(arr[n]);
        reversPrint(arr, n - 1);
    }

    public static int recMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return recMultiply(a, b - 1) + a;
    }

    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }


    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }
}
