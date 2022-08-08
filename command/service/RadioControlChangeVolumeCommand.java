package design_patterns.command.service;

import design_patterns.command.concrete_classes.Radio;

public class RadioControlChangeVolumeCommand implements Command{

    private Radio radio;
    private Integer volumeLevel;

    public RadioControlChangeVolumeCommand(Radio radio, int volumeLevel){
        this.radio = radio;
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void execute() {
        radio.setVolumeLevel(volumeLevel);
    }
}
