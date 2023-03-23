package com.yetong.Review.Structure.CompositePattern.Transparent;

public class Test {
    public static void main(String[] args) {
        Component totalTeam = new TeamComposite("总组");
        Component totalTeamA = new TeamComposite("A");
        Component totalTeamB = new TeamComposite("B");
        Component totalTeamC = new TeamComposite("C");
        Component A = new PlayerComposite("AP");
        Component B = new PlayerComposite("BP");
        Component C = new PlayerComposite("CP");
        Component D = new PlayerComposite("DP");
        Component E = new PlayerComposite("EP");
        Component F = new PlayerComposite("FP");
        Component G = new PlayerComposite("GP");
        Component H = new PlayerComposite("HP");
        totalTeamA.addChild(A);
        totalTeamA.addChild(B);
        totalTeamA.addChild(C);
        totalTeamB.addChild(D);
        totalTeamB.addChild(E);
        totalTeamC.addChild(F);
        totalTeamC.addChild(H);
        totalTeam.addChild(totalTeamA);
        totalTeam.addChild(totalTeamB);
        totalTeam.addChild(totalTeamC);
        totalTeam.operation();
    }
}
