package com.logan.demo;

public enum CommandTypes {

    COPY("copy"), MOVE("move");

    private CommandTypes(String commandName){
        this.commandName = commandName;
    }

    private String commandName;

    public static CommandTypes valueOfCommandName(String commandName) {
        for (CommandTypes e : values()) {
            if (e.commandName.equals(commandName)) {
                return e;
            }
        }
        return null;
    }
}
