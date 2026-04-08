import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ValidRegistrationTest {

    @Test
    public void validRegistration() {
        open("https://demoqa.com/automation-practice-form");
        $("[id='firstName']").setValue("Ruslan");
        $("[id='lastName']").setValue("Mironov");
        $("[id='userEmail']").setValue("r.miron@test.com");
        $("[id='gender-radio-2']").click();
        $("[id='userNumber']").setValue("1234567890");
        $("[id='submit']").click();
        $(".modal-content").shouldBe(visible);
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
    }
}