package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("properties")
public class ForJenkinsTests extends TestBase{

        @Test
        public void fillFormTest() {
            UserData user = new UserData();
            user.firstName = RandomStringUtils.randomAlphabetic(5);
            user.lastName = RandomStringUtils.randomAlphabetic(5);
            user.email = RandomStringUtils.randomAlphabetic(5) + "@rrr.com";
            user.number = RandomStringUtils.randomNumeric(10);
            user.address = RandomStringUtils.randomAlphabetic(20);
            String dayIndex = "17";
            int monthIndex = 3;
            int yearIndex = 25;
            RegistrationPage registrationPage = new RegistrationPage();

                registrationPage.openPage();
                registrationPage.fillForm(user, dayIndex, monthIndex, yearIndex);
                registrationPage.clickSubmit();
                registrationPage.checkModal(user);
                registrationPage.closeModal();
        }
}
