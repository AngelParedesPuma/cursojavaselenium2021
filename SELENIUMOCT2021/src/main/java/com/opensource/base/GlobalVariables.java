package com.opensource.base;

public class GlobalVariables {
	//driver a usar
	public static final String KEY_CHROME_DRIVER = "webdriver.chrome.driver";
	//ruta de la ubicación driver 
	public static final String PATH_CHROME_DRIVER = "./src/test/resources/drivers/chrome/chromedriver.exe";
	// link de la pag
	public static final String QA_URL = "https://opensource-demo.orangehrmlive.com";
	// tiempo de espera max
	public static final int GENERAL_TIMEOUT = 30;
	// tiempo de espera implicito (tiempo de espera incluido en la carga 
	public static final int GENERAL_IMPLICIT_TIMEOUT = 5;
//ruta del archivo a usar 
	public static final String PATH_JSON_DATA = "./src/test/resources/testdata/json/";
//
	public static final String PATH_EXCEL_DATA = "./src/test/resources/testdata/excel/";
// metodos de SCREENSHOTS
	public static final String PATH_SCREENSHOTS = System.getProperty("user.dir")+"/test-output/screenshots/";
}