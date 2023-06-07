package chapterEight;

public class RaceTrack {
    private String[][] lanes;

    public RaceTrack(){
        int numberOfLanes = 2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];

    }
}
