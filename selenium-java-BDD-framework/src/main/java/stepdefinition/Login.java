package stepdefinition;
import io.cucumber.java.en.*;

public class Login {
    @Given("the user is on app")
    public void user_is_on_app(){
        System.out.println("step-1");
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button(){
        System.out.println("step-2");
    }

}
