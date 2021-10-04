package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(7, 5);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 5);
        graph.addEdge(9, 2);
        graph.addEdge(9, 6);
        graph.addEdge(6, 3);
        graph.addEdge(6, 2);
        graph.addEdge(4, 2);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 3);
//        System.out.println(bfp.hasPathTo(1));
        System.out.println(bfp.pathTo(1));
        System.out.println(bfp.pathTo(4));
        System.out.println(bfp.pathTo(7));

        BreadthFirstPath bfp1 = new BreadthFirstPath(graph, 5);
//        System.out.println(bfp.hasPathTo(1));
        System.out.println(bfp1.pathTo(1));
        System.out.println(bfp1.pathTo(4));
        System.out.println(bfp1.pathTo(3));



//        System.out.println(graph.getVertexCount());
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(4));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));


    }
}
