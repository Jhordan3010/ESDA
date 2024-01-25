public class Nodo {
    private String node;
    private int distance;

    public Nodo(String node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    public String getNode() {
        return node;
    }

    public int getDistance() {
        return distance;
    }
}