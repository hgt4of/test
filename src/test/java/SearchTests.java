import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.automationexercise.com/");
        $("a[href='/login']").click();
        $("[data-qa='signup-name']").setValue("Test User");
        $("[data-qa='signup-email']").setValue("testuser_" + System.currentTimeMillis() + "@test.com");
        $("[data-qa='signup-button']").click();
        $("[data-qa='password']").setValue("Password123");
        $("[data-qa='days']").selectOption("15");
        $("[data-qa='months']").selectOption("March");
        $("[data-qa='years']").selectOption("1990");
        $("[data-qa='first_name']").setValue("Test");
        $("[data-qa='last_name']").setValue("User");
        $("[data-qa='address']").setValue("Test Street 1");
        $("[data-qa='country']").selectOption("United States");
        $("[data-qa='state']").setValue("Test State");
        $("[data-qa='city']").setValue("Test City");
        $("[data-qa='zipcode']").setValue("12345");
        $("[data-qa='mobile_number']").setValue("1234567890");
        $("[data-qa='create-account']").click();
        $("[data-qa='account-created']").shouldBe(visible);
    }
}