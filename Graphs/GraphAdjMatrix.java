public class GraphAdjMatrix {
    private int[][] adjMatrix;
    private int vertices;

    // Constructor
    public GraphAdjMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    // Add an edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;

        // If the graph is undirected, add the edge in both directions
        adjMatrix[dest][src] = 1;
    }

    // Remove an edge
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = 0;

        // If the graph is undirected, remove the edge in both directions
        adjMatrix[dest][src] = 0;
    }

    // Print the adjacency matrix
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjMatrix graph = new GraphAdjMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Adjacency Matrix Representation:");
        graph.printGraph();
    }
}
