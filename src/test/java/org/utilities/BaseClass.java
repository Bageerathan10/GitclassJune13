package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static  WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	public static Alert al;
	public static TakesScreenshot scr;
	public static void Launch() {
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
	}
	 	 
	 public static void getattribute(WebElement ele1) {
		ele1.getAttribute("value");

	}
	 
	 public static void getText() {
		driver.getTitle();

	}
	  public static void geturl() {
	driver.get(null);

	}
	  public static void getcurrent() {
	driver.getCurrentUrl();

	}
	 public static void getTitle() {
		driver.getTitle();
	}
	  public static void getWindowHandle() {
		driver.getWindowHandle();

	}
	  public static void getWindowHandles() {
		driver.getWindowHandles();

	}
	  public static void getpagesource() {
		driver.getPageSource();

	}
	 public static void getcls() {
		driver.getClass();
		 }
	       public static void close() {
	      driver.close();

		}
	 public static void quit() {
		driver.quit();
	}
	
	public static void click(WebElement ele1) {
		ele1.click();

	}
	  public static void notif() {
		a.notify();

	}
	 public static void pause() {
		a.pause(null);

	}
	  public static void release() {
	 a.release();

	}
	  public static void wt() throws InterruptedException {
		a.wait();

	}
	 public static void sendkeys(WebElement ele1) {
	ele1.sendKeys(null);

	}
	 public static void tck() {
		a.tick();

	}
	 public static void executescript() {
		js.executeScript(null, null);

	}
	 public static void keypress() {
	r.keyPress(0);

	}
	 public static void window() {
	   driver.manage().window();
		 
	}
	 	 public static void timeout() throws InterruptedException {
	driver.manage().window().wait();

	}
	  public static void perform() {
	a.click().perform();
		  
	}
	 public static void draganddrop(WebElement source, WebElement target) {
		 a.dragAndDrop(source, target).perform();

	}
		  public static  void clickhhold() {
	a.clickAndHold();

	}
	 public static void movetoelement() {
		a.moveToElement(null);

	}
	 
	 public static void keyup() {
		a.keyUp(null);

	}
	 public static void keydown() {
		a.keyDown(null);

	}
	 public static void hascode() {
		driver.hashCode();

	}
	 public static void movebyoffset() {
		a.moveByOffset(0, 0);
		 
	 }
	   public static void timedelay(int arg) throws InterruptedException {
		Thread.sleep(arg);

	}
	   public static void moueover(WebElement target) {
		a.moveToElement(target).perform();
	}
	   public static void dismispromptalrt(String KeysTosend) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(KeysTosend);
        al.dismiss();
	}
	  public static void sendtxtwithjavascript(String javascriptcommand,WebElement target) {
		js.executeScript(javascriptcommand, target);

	}
	  public static void gettextwithjavascript(WebElement target) {
		Object executeScript = js.executeScript("return argument[0].getAttribute('value')", target);
		String S = (String)executeScript;
       System.out.println();
	}
	 public static void clickwithjavascript(WebElement target) {
		js.executeScript("argument[0].click()", target);
	 
	 }
	 
       public static void scrollup(WebElement target) {
		js.executeScript("argument[0].scrollIntoView(true)", target);

	}
	  public static void scrolldown(WebElement target) {
		js.executeScript("argument[0].scrollIntoView(false)", target);
		  
		  
	}
	  public static void screensnap(String path) throws IOException {
		File src = scr.getScreenshotAs(OutputType.FILE);
        File des=new File(path);
        FileUtils.copyFile(src, des);
	}
	   public static void framewithname(String name) {
		driver.switchTo().frame(name);

	}
	   public static void framewithid(String id) {
		driver.switchTo().frame(id);

	}
	   public static void framewithindex(int index) {
		driver.switchTo().frame(index);

	}
	  public static void framewithelement(String WebElement) {
		driver.switchTo().frame(WebElement);

	}
	  public static void doubleclk(WebElement target) {
		a.doubleClick(target).perform();

	}
	  public static void contextclick(WebElement target) {
		a.contextClick(target).perform();

	}
	  public static void accalrt() {
		al.accept();
	}
	  public static void dissmissalrt() {
		al.dismiss();

	}
	   public static void accptprmptalrt(String KeysToend) {
		al.sendKeys(KeysToend);
       al.accept();
	}
	  public static void parentframe() {
		driver.switchTo().parentFrame();

	}
	  public static void defaultpage() {
		driver.switchTo().defaultContent();

	}
	  public static void childwindow() {
		String parwin = driver.getWindowHandle();
        Set<String> childwin = driver.getWindowHandles();
        for (String string : childwin) {
		if (string != parwin) {
			driver.switchTo().window(string);
		}	
		}
	}
	  public static void parentwindow() {
		String parwin = driver.getWindowHandle();
        Set<String> childwin = driver.getWindowHandles();
	for (String string : childwin) {
		if (string == parwin) {
			driver.switchTo().window(string);		}
	}
	    
	  }
	     public static void multiplewindow(int arg) {
			Set<String> allwin = driver.getWindowHandles();
         List <String> prtclrwindow = new ArrayList<String>();
         prtclrwindow.addAll(allwin);
         String strng=prtclrwindow.get(arg);
         driver.switchTo().window(strng);
		}
	     public static void drpdwnbyval(WebElement target , String Value) {
			Select sel= new Select(target);
			sel.selectByValue(Value);

		}
             	 public static void drpdwnbyvisibletetx(WebElement target , String text) {
             		Select sel= new Select(target);			
                  sel.selectByVisibleText(text);
				}
	       public static void drpdwnbyindex(WebElement target , int index) {
	    	   Select sel= new Select(target);			
	    	   sel.selectByIndex(index);
		}
	      public static void drpdwnoption(WebElement target , int index) {
	    	  Select sel= new Select(target);			
          List<WebElement> options = sel.getOptions();
		System.out.println();
	      
	      
	      }
	          public static void drpdwnmultiple(WebElement target) {
	        	  Select sel= new Select(target);	
	        	  boolean multiple = sel.isMultiple();
                  
			}
	    public static void drpdwnallselected(WebElement target) {
	    	Select sel= new Select(target);	
	    	List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();

		}
	       public static void drpdwnfirstselected(WebElement  target) {
	    	   Select sel= new Select(target);	
	    	   WebElement firstSelectedOption = sel.getFirstSelectedOption();

		}
	 public static void deselectbyval(WebElement target,String Value) {
		 Select sel= new Select(target);	
		 sel.deselectByValue(Value);

	}
	 public static void deselectbyvistxt(WebElement target,String text) {
		 Select sel= new Select(target);	
sel.deselectByVisibleText(text);
	}
	  public static void deselectbyindex(WebElement target,int index) {
		  Select sel= new Select(target);
		  sel.deselectByIndex(index);

	}
	 public static void deselectall(WebElement target) {
		 Select sel= new Select(target);
		 sel.deselectAll();

	}
	  
	  
	 
	 
}
