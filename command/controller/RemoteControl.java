package design_patterns.command.controller;

import design_patterns.command.service.Command;

public class RemoteControl {
    Command command;

    public RemoteControl(){}

    public void setCommand(Command command){
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
}
