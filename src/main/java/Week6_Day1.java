import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Week6_Day1 {
	/*
	 * Browser: Firefox, and Edge
	 * 
	 * 1. Login to JI RA with Private/In Private mode. 2. Click on project and select
	 * your project 3. From the board move any issue from one status to other using
	 * drag and drop 4. Click on any Task 5. click on 'add a child issue' and create
	 * a sub task 6. Go to that sub task and do below actions a. add Description b.
	 * add assignee from your team c. add a label d. add a comment e. click on add
	 * and validate the comment 7. Go to JIRA board and validate the sub task 8.
	 * Navigate to the Sub Task and add a attachment, and validate the same. 9.
	 * Delete the Parent task 10. Validate in JIRA board as Parent and Sub Task has
	 * been move out of board
	 */
	
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://id.atlassian.com/login");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("letsmailbhuvanesh@gmail.com");

		WebElement continueButton = driver.findElement(By.xpath("//*[text()='Continue']"));
		continueButton.click();

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Easytravel@06");

		WebElement loginButton = driver.findElement(By.xpath("//*[text()='Log in']"));
		loginButton.click();

		driver.findElement(By.xpath("//div[text()='Jira Software']")).click();

	}
}
