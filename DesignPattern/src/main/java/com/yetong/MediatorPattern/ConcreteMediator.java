package com.yetong.MediatorPattern;

/**
 * 具体中介者
 * 抽象中介者的子类，通过协调各个同事对象来实现协作行为，它维持了对各个同事对象的引用。
 */
public class ConcreteMediator {
    //维护多个同事之间的引用
    public Button addButton;
    public List list;
    public ComboBox cb;

    public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
        }
        //从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.update();
        }
        //从组合框选择客户
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            addButton.update();
        }
    }


}
