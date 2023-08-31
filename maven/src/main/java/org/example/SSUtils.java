package org.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SSUtils {
    public static void createXLS(String nameWithInfix, String sheetName){
        try (HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
             OutputStream fileOut = Files.newOutputStream(Paths.get(nameWithInfix))) {
            String newSheet = WorkbookUtil.createSafeSheetName(sheetName);
            HSSFSheet sheet = hssfWorkbook.createSheet(newSheet);

            HSSFRow row = sheet.createRow(0);

            HSSFCell cell = row.createCell(0);
            cell.setCellValue(1);

            hssfWorkbook.write(fileOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createXLSX(String nameWithInfix, String sheetName){
        try (XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
             OutputStream fileOut = Files.newOutputStream(Paths.get(nameWithInfix))) {
            String newSheet = WorkbookUtil.createSafeSheetName(sheetName);
            xssfWorkbook.createSheet(newSheet);

            xssfWorkbook.write(fileOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
