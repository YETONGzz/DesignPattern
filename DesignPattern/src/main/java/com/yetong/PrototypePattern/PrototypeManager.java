package com.yetong.PrototypePattern;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PrototypeManager {

    private static Map<String, Object> map = new HashMap<>();
    private static PrototypeManager pm =  new PrototypeManager();
    private PrototypeManager() {
        map.put("far", new Far());
        map.put("sas", new Sas());
    }

    //增加新的公文对象

    public void addOfficialDocument(String key, Doc doc) {
        map.put(key, doc);
    }


    //通过浅克隆获取新的公文对象

    public Doc getOfficialDocument(String key)  {
        Doc doc = (Doc) map.get(key);
        return doc.clone();

    }


    public static PrototypeManager getPrototypeManager() {

        return pm;

    }


}
