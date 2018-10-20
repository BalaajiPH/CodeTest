package stepDefinitions;

import cucumber.api.java.en.*;
import main.java.CommonLibrary;

public class Login extends CommonLibrary   {
	
	public String sDriver;

@Given("^User is in the Homepage of the Application$")
public void user_is_in_the_Homepage_of_the_Application() throws Throwable {
	getDriver("ff");
	navigateTo("http://google.com");
	
}

@Then("^the user enters the username$")
public void the_user_enters_the_username() throws Throwable {
	
}

@Then("^the user enters the password$")
public void the_user_enters_the_password() throws Throwable {
	closeBrowser();
}

@Then("^clicks the login button$")
public void clicks_the_login_button() throws Throwable {
    }
	

}
