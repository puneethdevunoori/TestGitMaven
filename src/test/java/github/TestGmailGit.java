package github;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestGmailGit {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\Office Works\\Softwares\\Selenium Pre-Requisites\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username= driver.findElement(By.id("identifierId"));
		username.sendKeys("punith.ramu");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	}