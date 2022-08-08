package design_patterns.command.service;

import design_patterns.command.concrete_classes.TubeLight;

public class TubeLightOnCommand implements Command{

    private TubeLight tubeLight;

    public TubeLightOnCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.turnOn();
    }
}
