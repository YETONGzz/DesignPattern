package com.yetong.Review.Structure.CompositePattern.Transparent;

public class PlayerComposite extends Component {
    public PlayerComposite(String name) {
        super(name);
    }

    @Override
    public String operation() {
        System.out.println(name + " 球员");
        return null;
    }
}
