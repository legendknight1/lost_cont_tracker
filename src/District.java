public class District {
    String name;
    District[] connections;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District[] getConnections() {
        return connections;
    }

    public void setConnections(District[] connections) {
        this.connections = connections;
    }
}
