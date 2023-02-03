package com.yetong.CommandPattern;

public class Test {
    public static void main(String[] args) {
        Command command = new HelpCommand();
        Command command1 = new MinimizeCommand();
        FunctionButton functionButton = new FunctionButton("aa");
        functionButton.setCommand(command);
        FunctionButton functionButton1 = new FunctionButton("cc");
        functionButton1.setCommand(command1);
        FBSettingWindow fbSettingWindow = new FBSettingWindow("bb");
        fbSettingWindow.addFunctionButton(functionButton);
        fbSettingWindow.addFunctionButton(functionButton1);
        fbSettingWindow.display();
    }
}
