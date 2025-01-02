package com.pedropathing.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import com.pedropathing.pathgen.PathChain;
import com.pedropathing.follower.Follower;
import com.pedropathing.pathgen.Path;


public class TeleopMovement extends CommandBase {
    private final Follower follower;

    public TeleopMovement(Follower follower) {
        this.follower = follower;
    }

    @Override
    public void initialize() {
    }

    @Override
    public boolean isFinished() {
    }

    @Override
    public void end(boolean interrupted) {
    }
}
