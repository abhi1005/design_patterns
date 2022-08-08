package design_patterns.command.service;

import design_patterns.command.concrete_classes.Radio;

public class RadioControlTurnOnCommand implements Command{

    private Radio radio;

    public RadioControlTurnOnCommand(Radio radio){
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.turnOn();
    }
}
