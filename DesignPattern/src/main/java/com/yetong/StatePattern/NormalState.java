package com.yetong.StatePattern;

/**
 * 具体状态类
 * 它是抽象状态类的子类，每一个子类实现一个与环境类的一个状态相关的行为，每一个具体状态类对应环境的一个具体状态，不同的具体状态类其行为有所不同。
 * 在状态模式中，我们将对象在不同状态下的行为封装到不同的状态类中，为了让系统具有更好的灵活性和可扩展性，同时对各状态下的共有行为进行封装，
 * 我们需要对状态进行抽象，引入了抽象状态类角色
 */
public class NormalState extends AccountState {



    public NormalState(Account acc) {
        this.acc = acc;
    }

    public NormalState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("正常状态，无须支付利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {
            acc.setState(new OverdraftState(this));
        } else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        } else if (acc.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}
