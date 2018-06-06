package Media;

public class Radio {

    private double fmFrequency;
    private double amFrequency;
    private String band;

    public Radio(double fmFrequency, double amFrequency, String band) {

        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public void showData() {

        System.out.println("FM Frequency is: " + fmFrequency);
        System.out.println("AM Frequency is: " + amFrequency);
        System.out.println("Band value is: " + band);
    }

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;

        System.out.println("FM Frequency is: " + fmFrequency);

    }

    public double getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(double amFrequency) {
        this.amFrequency = amFrequency;

        System.out.println("AM Frequency is: " + amFrequency);

    }

    public String getBand() {
        return this.band;
    }

    public void setBand(String band) {
        this.band = band;

        System.out.println("Band value is: " + band);
    }

}
