package design_patterns.command.concrete_classes;

public class Radio {
    int volumeLevel;
    public void turnOn(){
        System.err.println("radio turned on");
    }
    public void turnOff(){
        System.err.println("radio turned off");
    }
    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel = volumeLevel;
        System.err.println("volume set to : "+volumeLevel);
    }
}
