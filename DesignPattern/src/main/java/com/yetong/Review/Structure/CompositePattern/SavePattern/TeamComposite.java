package com.yetong.Review.Structure.CompositePattern.SavePattern;

import java.util.ArrayList;
import java.util.List;

public class TeamComposite extends Component {

    List<Component> child = new ArrayList<>();
    public TeamComposite(String name) {
        super(name);
    }

    @Override
    public String operation() {
        child.forEach(e->{
            e.operation();
        });
        return null;
    }

    @Override
    public boolean addChild(Component component) {
        child.add(component);
        return true;
    }

    @Override
    public boolean removeChild(Component component) {
        boolean remove = child.remove(component);
        return remove;
    }

    @Override
    public Component getChild(int index) {
        return child.get(index);
    }
}
