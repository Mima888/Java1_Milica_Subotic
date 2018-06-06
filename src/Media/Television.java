package Media;

public class Television {

    private int volume;
    private int currentProgram = 0;
    private boolean turnOn;
    
    public Television() {
    
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Current volume is: " + volume);
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
        System.out.println("Current program is: " + currentProgram);
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
        
        if (turnOn == true) {
            System.out.println("TV is ON!");
        } else {
            System.out.println("TV is OFF");
        }
    }

    public void setCurrentProgram() {
        throw new UnsupportedOperationException("Current program is: " + currentProgram); //To change body of generated methods, choose Tools | Templates.
    }

}
