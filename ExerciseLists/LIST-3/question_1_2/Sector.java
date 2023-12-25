package question_1_2;

public class Sector {
    private static int sectorCounter = 1;

    private int sectorCode;
    private String sectorName;

    public Sector(String sectorName) {
        this.sectorCode = sectorCounter++;
        this.sectorName = sectorName;
    }

    public int getSectorCode() {
        return this.sectorCode;
    }

    public String getSectorName() {
        return this.sectorName;
    }
}
