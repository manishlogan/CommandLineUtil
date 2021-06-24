package com.logan.demo.command;

public class CopyCommand implements Command{

    public boolean performAction(String src, String destination) {
        System.out.println("Performing copy operation");
        if(src.equals(destination))
            return false;

        return true;
    }
}
