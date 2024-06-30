package org.example;

import java.util.HashMap;
import java.util.List;

public class Match {
    public HashMap<String,String> match(List<String> list, HashMap<String,String> map){
        HashMap<String,String> result = new HashMap<>();
        for(String code:list){
            String s = map.getOrDefault(code,null);
            result.put(code,s);
        }
        return result;
    }
}
