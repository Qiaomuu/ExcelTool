package org.example;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reader {
    public HashMap<String,String> readTotal(String fileName) throws  Exception {
        //创建File文件
        File file = new File(fileName);
        if (!file.exists())
            file.createNewFile();
        //从文件中获取表
        Workbook workbook = Workbook.getWorkbook(file);
        //获取第一页
        Sheet sheet = workbook.getSheet(0);
        HashMap<String,String> map = new HashMap<>();
        //i代表行，j代表列
        for (int i = 0; i < sheet.getRows(); i++)
        {
            Cell cell0 = sheet.getCell(0,i);
            Cell cell1 = sheet.getCell(1,i);
            map.put(cell0.getContents(),cell1.getContents());
        }
        workbook.close();
        return map;
    }
    public List<String> readSingle(String fileName) throws BiffException, IOException {
        //创建File文件
        File file = new File(fileName);
        if (!file.exists())
            file.createNewFile();
        //从文件中获取表
        Workbook workbook = Workbook.getWorkbook(file);
        //获取第一页
        Sheet sheet = workbook.getSheet(0);
        List<String> list = new ArrayList<>();
        //i代表行，j代表列
        for (int i = 0; i < sheet.getRows(); i++)
        {
            Cell cell = sheet.getCell(0,i);
            list.add(cell.getContents());
        }
        workbook.close();
        return list;

    }

}
