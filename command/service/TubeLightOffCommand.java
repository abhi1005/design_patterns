package design_patterns.command.service;

import design_patterns.command.concrete_classes.TubeLight;

public class TubeLightOffCommand implements Command{

    private TubeLight tubeLight;

    public TubeLightOffCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.turnOff();
    }
}
