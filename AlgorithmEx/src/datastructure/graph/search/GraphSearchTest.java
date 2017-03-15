package datastructure.graph.search;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 22..
 */
public class GraphSearchTest {
    AdjList g9;

    @Before
    public void setUp() {
        g9 = new AdjList();

        for (int i=0; i<7; i++)
            g9.insertVertex(i);

        g9.insertEdge(0, 2);
        g9.insertEdge(0, 1);
        g9.insertEdge(1, 4);
        g9.insertEdge(1, 3);
        g9.insertEdge(1, 0);
        g9.insertEdge(2, 4);
        g9.insertEdge(2, 0);
        g9.insertEdge(3, 6);
        g9.insertEdge(3, 1);
        g9.insertEdge(4, 6);
        g9.insertEdge(4, 2);
        g9.insertEdge(4, 1);
        g9.insertEdge(5, 6);
        g9.insertEdge(6, 5);
        g9.insertEdge(6, 4);
        g9.insertEdge(6, 3);
    }

    @Test
    public void graphSearchTest() {
        System.out.printf("\n그래프 G9의 인접리스트: ");
        g9.printAdjList();
        System.out.println();

        System.out.printf("\n깊이 우선 탐색: ");
        g9.DFS(0);

        System.out.printf("\n너비 우선 탐색: ");
        g9.BFS(0);
    }


}
