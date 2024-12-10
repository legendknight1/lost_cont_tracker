public abstract class Creature {
    District currentLocation;
    String name;
    Integer[] Stats = {null,null,null,null,null};

    public District getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(District currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer[] getStats() {
        return Stats;
    }

    public void setStats(Integer[] stats) {
        Stats = stats;
    }

    public void makeScoutCheck(District district){
        int Roll = Main.rolld20()+getStat(StatParameters.Luck);
    }
    public void makeScoutCheck(District[] districts){

    }

    protected int getStat(StatParameters sp){
        return Stats[sp.ordinal()];
    }
}
