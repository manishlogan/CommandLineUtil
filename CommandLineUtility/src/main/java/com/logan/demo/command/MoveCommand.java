package com.logan.demo.command;

public class MoveCommand implements Command{

    public boolean performAction(String src, String destination) {
        System.out.println("Performing move operation");
        if(src.equals(destination))
            return false;

        return true;
    }
}
