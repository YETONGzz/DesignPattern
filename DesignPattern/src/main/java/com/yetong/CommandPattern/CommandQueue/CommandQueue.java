package com.yetong.CommandPattern.CommandQueue;

import com.yetong.CommandPattern.Command;

import java.util.ArrayList;

/**
 * 命令队列
 */
public class CommandQueue {

    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commands) {
            ((Command)command).execute();
        }
    }
}
