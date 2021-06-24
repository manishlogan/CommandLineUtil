package com.logan.demo;

import com.logan.demo.command.factory.CommandFactory;
import com.sun.javaws.exceptions.InvalidArgumentException;

public class Main {

    public static void main(String[] args) {
        try {
            CommandTypes commandTypes =getCommandType(args);
            System.out.println(CommandFactory.getCommand(commandTypes).performAction("src", "dest"));
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }

    private static CommandTypes getCommandType(String[] args) throws InvalidArgumentException{
        if(args.length == 0){
            String[] msg = {"Command cannot be empty"};
            throw new InvalidArgumentException(msg);
        }

        return CommandTypes.valueOfCommandName(args[0]);
    }
}
