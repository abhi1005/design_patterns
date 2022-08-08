package design_patterns.command.service;

import design_patterns.command.concrete_classes.Radio;

public class RadioControlTurnOffCommand implements Command{

    private Radio radio;

    public RadioControlTurnOffCommand(Radio radio){
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.turnOff();
    }
}
