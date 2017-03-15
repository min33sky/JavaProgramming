package datastructure.graph;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 22..
 */
public class GraphTest {
    AdjMatrix adjMatrix;
    AdjList adjList;

    @Before
    public void setUp() {
        adjMatrix = new AdjMatrix();
        for (int i=0; i<4; i++)
            adjMatrix.insertVertex(i);

        adjMatrix.insertEdge(0, 3);
        adjMatrix.insertEdge(0, 1);
        adjMatrix.insertEdge(1, 3);
        adjMatrix.insertEdge(1, 2);
        adjMatrix.insertEdge(1, 0);
        adjMatrix.insertEdge(2, 3);
        adjMatrix.insertEdge(2, 1);
        adjMatrix.insertEdge(3, 2);
        adjMatrix.insertEdge(3, 1);
        adjMatrix.insertEdge(3, 0);


        adjList = new AdjList();
        for (int i=0; i<4; i++)
            adjList.insertVertex(i);

        adjList.insertEdge(0, 3);
        adjList.insertEdge(0, 1);
        adjList.insertEdge(1, 3);
        adjList.insertEdge(1, 2);
        adjList.insertEdge(1, 0);
        adjList.insertEdge(2, 3);
        adjList.insertEdge(2, 1);
        adjList.insertEdge(3, 2);
        adjList.insertEdge(3, 1);
        adjList.insertEdge(3, 0);

    }

    @Test
    public void graphTest() {
        System.out.printf("\n그래프 G1의 인접행렬: ");
        adjMatrix.printMatrix();
        System.out.println();

        System.out.printf("\n그래프 G1의 인접리스트: ");
        adjList.printAdjList();
        System.out.println();
    }
}
