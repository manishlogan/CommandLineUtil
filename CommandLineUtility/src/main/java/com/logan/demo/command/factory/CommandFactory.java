package com.logan.demo.command.factory;

import com.logan.demo.CommandTypes;
import com.logan.demo.command.Command;
import com.logan.demo.command.CopyCommand;
import com.logan.demo.command.MoveCommand;
import com.sun.javaws.exceptions.InvalidArgumentException;

public class CommandFactory {

    public static Command getCommand(CommandTypes commandTypes) throws InvalidArgumentException{
        if(commandTypes == null){
            String[] msg = {"Invalid command type passed"};
            throw new InvalidArgumentException(msg);
        }

        switch (commandTypes){
            case COPY:
                return new CopyCommand();
            case MOVE:
                return new MoveCommand();
            default:
                String[] msg = {"Invalid command type passed"};
                throw new InvalidArgumentException(msg);
        }
    }
}
