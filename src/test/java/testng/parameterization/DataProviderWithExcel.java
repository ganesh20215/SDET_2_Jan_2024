package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;


public class DataProviderWithExcel {

    @DataProvider(name = "testData")
    public Object[][] dataProviderFun() {
        Object[][] arrObj = getExcelData("C:\\Users\\Ganesh\\Downloads\\TestngCheck.xlsx", "SheetName");
        return arrObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) {

        String[][] data;
        FileInputStream fileInputStream = null;
        XSSFWorkbook wb = null;

        try {
            fileInputStream = new FileInputStream(filePath);    //Normal File Access
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            wb = new XSSFWorkbook(fileInputStream);        //Excel File
        } catch (Exception e) {
            e.printStackTrace();
        }

        XSSFSheet sheet = wb.getSheet(sheetName);       //SheetName Access
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();

        Cell cell;
        data = new String[noOfRows - 1][noOfColumn];

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);

                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "testData")
    public void verifySearchValidCourseNameWithCity(String courseName, String cityName) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement textBoxElement = driver.findElement(By.name("q"));
        textBoxElement.sendKeys(courseName + " " + cityName);
        textBoxElement.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.close();
    }
}
