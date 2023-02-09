package com.yetong.StatePattern;

/**
 * 环境类
 * 环境类又称为上下文类，它是拥有多种状态的对象。由于环境类的状态存在多样性且在不同状态下对象的行为有所不同，
 * 因此将状态独立出去形成单独的状态类。在环境类中维护一个抽象状态类State的实例，这个实例定义当前状态，在具体实现时，它是一个State子类的对象。
 */
public class Account {

    private AccountState state; //维持一个对抽象状态对象的引用
    private String owner; //开户名
    private double balance = 0; //账户余额

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this); //设置初始状态
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("---------------------------------------------");
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount); //调用状态对象的withdraw()方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest(); //调用状态对象的computeInterest()方法
    }

}
