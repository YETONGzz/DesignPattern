package com.yetong.Review.Create.BuilderPattern;

import lombok.Data;
import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

@Data
public class BuilderDirector {
    Builder builder;

    public Cloths createCloth() {
        builder.BuildSock();
        builder.BuildTourse();
        return builder.getCloths();
    }

}
