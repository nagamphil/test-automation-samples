package StepDefinition;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	static WebDriver driver;
	WebDriverWait wait; 
	static Properties objectrepo;
	
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable {
		FileInputStream data = new FileInputStream("C:\\workspace\\test\\EndToEndAutomationTesting\\src\\Configuration\\ObjectRepository.properties");
		 objectrepo = new Properties();
		 objectrepo.load(data);
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\naga\\selenium\\chromedriver.exe");	
			driver = new ChromeDriver();
	  System.out.println("Happy Sunday");
	
	}

	@Given("^Navigate to the Application$")
	public void navigate_to_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(objectrepo.getProperty("url"));
	}

	/*
	 * @When("^Enter the username$") public void enter_the_username() throws
	 * Throwable { // Write code here that turns the phrase above into concrete
	 * actions WebElement username =
	 * driver.findElement(By.xpath(objectrepo.getProperty("username")));
	 * 
	 * username.sendKeys("Tester");
	 * 
	 * 
	 * }
	 * 
	 * @When("^Enter the password$") public void enter_the_password() throws
	 * Throwable { // Write code here that turns the phrase above into concrete
	 * actions WebElement pword =
	 * driver.findElement(By.xpath(objectrepo.getProperty("pword")));
	 * pword.sendKeys("test"); }
	 */

	@When("^Click the login button$")
	public void click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login = driver.findElement(By.xpath(objectrepo.getProperty("login")));
		login.click();
	}

	@Then("^Verify login successfull or not$")
	public void verify_login_successfull_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logout = driver.findElement(By.xpath(objectrepo.getProperty("logout")));
		if(logout.isDisplayed())
		{
			System.out.println("login successfull");
		}
	}

	@When("^Click Order button$")
	public void click_Order_button() throws Throwable {
		 WebElement orders = driver.findElement(By.xpath(objectrepo.getProperty("orders")));
		 orders.click();
		 wait = new WebDriverWait(driver, 6000);
		 ///html/body/form/table/tbody/tr/td[1]/ul/li[3]/a
		 //*[@id="ctl00_menu"]/li[3]/a
		//*[@id='ctl00_menu']/li[3]/a
	    // Write code here that turns the phrase above into concrete actions
	//*[@id='ctl00_menu']/li[2]/a
	//*[@id="ctl00_menu"]/li[3]/a

	}

	@When("^Product Information$")
	public void product_Information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement product = driver.findElement(By.xpath(objectrepo.getProperty("product")));
		System.out.println(product.getText());		
	}

	@When("^Address Information$")
	public void address_Information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement address = driver.findElement(By.xpath(objectrepo.getProperty("address")));

	}

	@When("^Payment Information$")
	public void payment_Information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement paydetails = driver.findElement(By.xpath(objectrepo.getProperty("paydetails")));
	}
	@Then("^Click Reset$")
	public void click_Reset() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement reset = driver.findElement(By.xpath(objectrepo.getProperty("reset")));
		reset.click();
		//html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/input
		//*[@id="ctl00_MainContent_fmwOrder"]/tbody/tr/td/div/input
		//*[@id="ctl00_MainContent_fmwOrder"]/tbody/tr/td/div/input
		//*[@id="ctl00_MainContent_fmwOrder"]/tbody/tr/td/div/input
	}
	@Then("^Verify the Process$")
	public void verify_the_Process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement verify = driver.findElement(By.xpath(objectrepo.getProperty("verify")));
	   verify.click();

	}

	/*
	 * @When("^Enter the username \"([^\"]*)\"$") public void
	 * enter_the_username(String usernamedata) throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions
	 * 
	 * WebElement username =
	 * driver.findElement(By.xpath(objectrepo.getProperty("username")));
	 * 
	 * username.sendKeys(usernamedata); }
	 * 
	 * @When("^Enter the password	\"([^\"]*)\"$") public void
	 * enter_the_password(String password) throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions WebElement pword =
	 * driver.findElement(By.xpath(objectrepo.getProperty("pword")));
	 * pword.sendKeys(password); }
	 */
	@When("^Enter the username$")
	public void enter_the_username(DataTable uname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> user = uname.raw() ;
		String usernamedata = user.get(0).get(0);
		WebElement username = driver.findElement(By.xpath(objectrepo.getProperty("username")));
		username.sendKeys(usernamedata);
		
	    
	}

	@When("^Enter the password$")
	public void enter_the_password(DataTable password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> pwd = password.raw();
		String passworddata = pwd.get(0).get(0);
		WebElement passwordname = driver.findElement(By.xpath(objectrepo.getProperty("pword")));
		passwordname.sendKeys(passworddata);
	    
	}

	@When("^Customername \"([^\"]*)\"$")
	public void customername(String cname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement customer = driver.findElement(By.xpath(objectrepo.getProperty("customername")));
	    customer.sendKeys(cname);
	}

	@When("^Street \"([^\"]*)\"$")
	public void street(String streetname) throws Throwable {
		WebElement Street = driver.findElement(By.xpath(objectrepo.getProperty("street")));
		Street.sendKeys(streetname);
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^City \"([^\"]*)\"$")
	public void city(String cityname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement city = driver.findElement(By.xpath(objectrepo.getProperty("city")));
		city.sendKeys(cityname);
	}

	@When("^State \"([^\"]*)\"$")
	public void state(String Statename) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement state = driver.findElement(By.xpath(objectrepo.getProperty("state")));
		state.sendKeys(Statename);
	}

	@When("^Zip	\"([^\"]*)\"$")
	public void zip(String zipcode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement zip = driver.findElement(By.xpath(objectrepo.getProperty("zip")));
		zip.sendKeys(zipcode);
	}
	@When("^Customername$")
	public void customername(DataTable cname1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> cusname = cname1.raw();
		String cusdata = cusname.get(0).get(0);
		WebElement customername1 = driver.findElement(By.xpath(objectrepo.getProperty("customername")));
		customername1.sendKeys(cusdata);
	    
	}

	@When("^Street$")
	public void street(DataTable street1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> st = street1.raw();
		String streetdata = st.get(0).get(0);
		WebElement streetname = driver.findElement(By.xpath(objectrepo.getProperty("street")));
		streetname.sendKeys(streetdata);
	}

	@When("^City$")
	public void city(DataTable city1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> ct = city1.raw();
		String citydata = ct.get(0).get(0);
		WebElement cityname = driver.findElement(By.xpath(objectrepo.getProperty("city")));
		cityname.sendKeys(citydata);
	}

	@When("^State$")
	public void state(DataTable state1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> stt = state1.raw();
		String statedata = stt.get(0).get(0);
		WebElement statename = driver.findElement(By.xpath(objectrepo.getProperty("state")));
		statename.sendKeys(statedata);
	}

	@When("^Zip$")
	public void zip(DataTable zip1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> zips = zip1.raw();
		String zipdata = zips.get(0).get(0);
		WebElement zipname = driver.findElement(By.xpath(objectrepo.getProperty("zip")));
		zipname.sendKeys(zipdata);
	}



}
