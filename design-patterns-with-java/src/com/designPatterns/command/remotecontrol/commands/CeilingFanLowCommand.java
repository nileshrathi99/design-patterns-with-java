package com.designPatterns.command.remotecontrol.commands;

import com.designPatterns.command.remotecontrol.entities.CeilingFan;

public class CeilingFanLowCommand implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
        this.prevSpeed = CeilingFan.LOW;
    }

    @Override
    public void undo() {
        if (this.prevSpeed == CeilingFan.HIGH ){
            ceilingFan.high();
        } else if (this.prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (this.prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (this.prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
