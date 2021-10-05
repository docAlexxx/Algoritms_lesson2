package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int TREES_QUANTITY = 20000;
        int MAX_DEEP = 6;
        int notBalncedQuantity = 0;
        int nodeNumber;

        for (int i = 0; i < TREES_QUANTITY; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            nodeNumber = 0;
            while (map.deep() < MAX_DEEP) {
                nodeNumber = random.nextInt(200) - 100;
                map.put(nodeNumber, nodeNumber);
            }

            map.remove(nodeNumber);

            if (!map.isBalanced()) {
                notBalncedQuantity++;
            }
        }

        System.out.println("процент несбалансированных деревьев - " + (double) notBalncedQuantity / TREES_QUANTITY * 100);

        //       MyTreeMap<Integer, String> map = new MyTreeMap<>();

        //       map.put(5, "five");
        //       map.put(4, "four");
        //       map.put(1, "one");
        //       map.put(2, "two");
        //       map.put(3, "three");

        //       System.out.println(map.get(4));
//        map.put(4, "four four");

        //       System.out.println(map.get(4));
        //       System.out.println(map.size());

        //       System.out.println(map);

        //       map.remove(1);
        //       System.out.println(map);
        //       System.out.println(map.deep());
        //       System.out.println(map.isBalanced());
    }
}
