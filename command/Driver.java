package design_patterns.command;

import design_patterns.command.concrete_classes.Radio;
import design_patterns.command.concrete_classes.TubeLight;
import design_patterns.command.controller.RemoteControl;
import design_patterns.command.service.Command;
import design_patterns.command.service.RadioControlChangeVolumeCommand;
import design_patterns.command.service.TubeLightOffCommand;
import design_patterns.command.service.TubeLightOnCommand;

public class Driver {
    public static void main(String[] args) {

        TubeLight tubeLight = new TubeLight();
        Radio radio = new Radio();

        RemoteControl remoteControl = new RemoteControl();

        Command c1 = new TubeLightOnCommand(tubeLight);
        remoteControl.setCommand(c1);
        remoteControl.execute();

        Command c2 = new TubeLightOffCommand(tubeLight);
        remoteControl.setCommand(c2);
        remoteControl.execute();

        Command c3 = new RadioControlChangeVolumeCommand(radio, 10);
        remoteControl.setCommand(c3);
        remoteControl.execute();

    }
}
