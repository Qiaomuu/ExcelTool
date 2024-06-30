package org.example;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Writer {
    public void write(HashMap<String,String> map,String fileName) throws IOException, WriteException {
        File file = new File(fileName);
        WritableWorkbook workbook = Workbook.createWorkbook(file);
        WritableSheet sheet = workbook.createSheet("sheet1",0);
        int row=0;
        for(Map.Entry<String,String> entry: map.entrySet()){
            Label label0 = new Label(0,row,entry.getKey());
            Label label1 = new Label(1,row, entry.getValue());
            sheet.addCell(label0);
            sheet.addCell(label1);
            row++;
        }
        workbook.write();
        workbook.close();
    }
}
