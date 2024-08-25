public class GraphAdjMatrix {
    private int[][] adjMatrix;
    private int vertices;

    public GraphAdjMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    // Add an edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // If undirected graph
    }

    // Remove an edge
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0; // If undirected graph
    }

    // Getter for vertices
    public int getVertices() {
        return vertices;
    }

    // Getter for adjMatrix
    public int[][] getAdjMatrix() {
        return adjMatrix;
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
}
