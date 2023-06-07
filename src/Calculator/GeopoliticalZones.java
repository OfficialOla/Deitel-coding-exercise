package Calculator;

public enum GeopoliticalZones {
    NORTHCENTRAL(new String[]{"FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTHEAST(new String[] {"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTHWEST(new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTHEAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTHSOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTHWEST(new String[]{"Ekiti", "Lagos", "Osun", "Oyo", "Ondo", "Ogun"});

    private String[] state;

    GeopoliticalZones(String[] state){
        this.state = state;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }
    public static GeopoliticalZones stateFinder(String name){
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
