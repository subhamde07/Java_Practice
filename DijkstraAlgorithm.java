import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node implements Comparable<Node> {

    private final String id;
    private List<Edge> adjacencies;
    private int distance;
    private Node previous;

    public Node(String id) {
        this.id = id;
        this.adjacencies = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
    }

    public void addEdge(Edge edge) {
        adjacencies.add(edge);
    }

    public String getId() {
        return id;
    }

    public List<Edge> getAdjacencies() {
        return adjacencies;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}
class Edge {
    private final Node target;
    private final int weight;

    public Edge(Node target, int weight) {
        this.target = target;
        this.weight = weight;
    }

    public Node getTarget() {
        return target;
    }

    public int getWeight() {
        return weight;
    }
}


class Dijkstra {

    public static void computePaths(Node source) {
        source.setDistance(0);

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Edge edge : current.getAdjacencies()) {
                Node target = edge.getTarget();
                int distance = edge.getWeight();

                if (target.getDistance() > current.getDistance() + distance) {
                    queue.remove(target);

                    target.setDistance(current.getDistance() + distance);
                    target.setPrevious(current);

                    queue.add(target);
                }
            }
        }
    }

    public static List<Node> getShortestPathTo(Node target) {
        List<Node> path = new ArrayList<>();

        for (Node node = target; node != null; node = node.getPrevious()) {
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}

/**
 * DijkstraAlgorithm
 */
public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        A.addEdge(new Edge(B, 10));
        A.addEdge(new Edge(C, 20));
        B.addEdge(new Edge(D, 1));
        C.addEdge(new Edge(D, 5));
        C.addEdge(new Edge(E, 10));
        D.addEdge(new Edge(E, 1));
        E.addEdge(new Edge(F, 2));

        Dijkstra.computePaths(A);

        List<Node> path = Dijkstra.getShortestPathTo(F);

        for (Node node : path) {
            System.out.print(node.getId() + " ");
        }
    }
}
