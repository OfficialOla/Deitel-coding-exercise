package Calculator;

public class StateInGeoZones {

    private GeopoliticalZones zone;

    public GeopoliticalZones getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = stateFinder(zone);

    }
    public GeopoliticalZones stateFinder(String name){
        GeopoliticalZones politicalZone = null;
        for(GeopoliticalZones zones : GeopoliticalZones.values()){
            for (String state: zones.getState()) {
                if((name).equalsIgnoreCase(state)){
                    System.out.println(zones);
                politicalZone = zones;}
             }
        }return politicalZone ;
    }
}
