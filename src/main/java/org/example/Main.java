package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeString.match;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        String fileSingle = "E:\\test.xls";
        String fileTotal = "E:\\total.xls";
        String fileWrite = "E:\\writeTest.xls";
        Reader reader = new Reader();
        Match matchResult = new Match();
        Writer writer = new Writer();
        List<String> list = reader.readSingle(fileSingle);
        HashMap<String,String> map = reader.readTotal(fileTotal);
        HashMap<String,String> result = matchResult.match(list,map);
        /*for(Map.Entry<String,String> entry:result.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }*/
        writer.write(result,fileWrite);
    }
}
