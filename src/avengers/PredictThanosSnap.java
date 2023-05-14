package avengers;

/**
 * Given an adjacency matrix, use a random() function to remove half of the nodes. 
 * Then, write into the output file a boolean (true or false) indicating if 
 * the graph is still connected.
 * 
 * Steps to implement this class main method:
 * 
 * Step 1:
 * PredictThanosSnapInputFile name is passed through the command line as args[0]
 * Read from PredictThanosSnapInputFile with the format:
 *    1. seed (long): a seed for the random number generator
 *    2. p (int): number of people (vertices in the graph)
 *    2. p lines, each with p edges: 1 means there is a direct edge between two vertices, 0 no edge
 * 
 * Note: the last p lines of the PredictThanosSnapInputFile is an ajacency matrix for
 * an undirected graph. 
 * 
 * The matrix below has two edges 0-1, 0-2 (each edge appear twice in the matrix, 0-1, 1-0, 0-2, 2-0).
 * 
 * 0 1 1 0
 * 1 0 0 0
 * 1 0 0 0
 * 0 0 0 0
 * 
 * Step 2:
 * Delete random vertices from the graph. You can use the following pseudocode.
 * StdRandom.setSeed(seed);
 * for (all vertices, go from vertex 0 to the final vertex) { 
 *     if (StdRandom.uniform() <= 0.5) { 
 *          delete vertex;
 *     }
 * }
 * Answer the following question: is the graph (after deleting random vertices) connected?
 * Output true (connected graph), false (unconnected graph) to the output file.
 * 
 * Note 1: a connected graph is a graph where there is a path between EVERY vertex on the graph.
 * 
 * Note 2: use the StdIn/StdOut libraries to read/write from/to file.
 * 
 *   To read from a file use StdIn:
 *     StdIn.setFile(inputfilename);
 *     StdIn.readInt();
 *     StdIn.readDouble();
 * 
 *   To write to a file use StdOut (here, isConnected is true if the graph is connected,
 *   false otherwise):
 *     StdOut.setFile(outputfilename);
 *     StdOut.print(isConnected);
 * 
 * @author Yashas Ravi
 * Compiling and executing:
 *    1. Make sure you are in the ../InfinityWar directory
 *    2. javac -d bin src/avengers/*.java
 *    3. java -cp bin avengers/PredictThanosSnap predictthanossnap.in predictthanossnap.out
*/

public class PredictThanosSnap {
	 
    public static void main (String[] args) {
 
        if ( args.length < 2 ) {
            StdOut.println("Execute: java PredictThanosSnap <INput file> <OUTput file>");
            return;
        }
        
    	// WRITE YOUR CODE HERE
               
        String predictInputFile = args[0];
        StdIn.setFile(predictInputFile);
        String predictOutputFile = args[1];
        StdOut.setFile(predictOutputFile);

        long seed = StdIn.readLong(); 
        StdRandom.setSeed(seed);
        int numberOfNodes = StdIn.readInt();

        int[][] matrix = new int[numberOfNodes][numberOfNodes];

        for(int i = 0; i < numberOfNodes; i++){
            for(int j = 0; j < numberOfNodes; j++){
                matrix[i][j] = StdIn.readInt(); 
            }
        }

        boolean[] removedVertices = new boolean[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++){
            if(StdRandom.uniform() <= 0.5){
                for(int j = 0; j < numberOfNodes; j++){
                    matrix[i][j] = 0;
                    matrix[j][i] = 0;
                }
                removedVertices[i] = true; //True at the positions of the removed vertices 
            }
        }
        /* 
        for(int i = 0; i < numberOfNodes; i++) {
                for(int j = 0; j < numberOfNodes; j++) {
                    StdOut.print(matrix[i][j] + " ");
                }
                StdOut.println(); 
        }
        
        for(int i = 0; i < numberOfNodes; i++) {
            StdOut.println(removedVertices[i]);
        }
        */
       
        boolean[] check = new boolean[numberOfNodes];
        int count = 0;
        for(int i = 0; i < numberOfNodes; i++){
            if(removedVertices[i] == true){
                check[i] = true;
            } 
            else if(count == 0){
                connectedGraph(i, matrix, check);
                count++;
            }
        }

        boolean connected = true;
        for(int i = 0; i < numberOfNodes; i++){
            if(check[i] == false){
                connected = false;
                break;
            }
        }
        StdOut.print(connected);
        
    }      

    private static void connectedGraph(int vertex, int[][] matrix, boolean[] check) {
        check[vertex] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (check[i] == false && (matrix[i][vertex] == 1 && matrix[vertex][i] == 1)) {
                connectedGraph(i, matrix, check);
            }
        }
    }
    
}
