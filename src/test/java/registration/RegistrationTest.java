package registration;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegisterPage;

import static org.testng.Assert.*;

public class RegistrationTest extends BaseTests {

    @Test (dataProvider = "ValidRegistrationTestData")
    public void Valid_Test_Registration(String fname , String lname , String day , String month , String year
    , String email , String company , String passowrd , String confirmpassword) {
        RegisterPage ValidregisterPage = navBarPage.clickRegisterButton_HomePage();
        ValidregisterPage.setMaleRadio();
        ValidregisterPage.setFirstName(fname);
        ValidregisterPage.setLastName(lname);
        ValidregisterPage.setDateOfBirthDay(day);
        ValidregisterPage.setDateOfBirthMonth(month);
        ValidregisterPage.setDateOfBirthYear(year);
        ValidregisterPage.setEmail(email);
        ValidregisterPage.setCompanyName(company);
        ValidregisterPage.setNewsletter();
        ValidregisterPage.setPassword(passowrd);
        ValidregisterPage.setConfirmPassword(confirmpassword);
        RegisterPage registerPage = ValidregisterPage.clickRegisterButtun_RegisterPage();
        assertEquals(registerPage.getRegistrationConfirm(), "Your registration completed", "Failed Registration");
    }
    @Test (dataProvider = "inValidRegistrationFnameTestData")
    public void InValid_FirstName_Regiteration(String fname , String lname , String day , String month , String year
            , String email , String company , String passowrd , String confirmpassword) {
        RegisterPage InValidregisterPage = navBarPage.clickRegisterButton_HomePage();
        InValidregisterPage.setMaleRadio();
        InValidregisterPage.setFirstName(fname);
        InValidregisterPage.setLastName(lname);
        InValidregisterPage.setDateOfBirthDay(day);
        InValidregisterPage.setDateOfBirthMonth(month);
        InValidregisterPage.setDateOfBirthYear(year);
        InValidregisterPage.setEmail(email);
        InValidregisterPage.setCompanyName(company);
        InValidregisterPage.setNewsletter();
        InValidregisterPage.setPassword(passowrd);
        InValidregisterPage.setConfirmPassword(confirmpassword);
        RegisterPage registerPage = InValidregisterPage.clickRegisterButtun_RegisterPage();
        assertEquals(registerPage.getininValidFirstNameFailed(), "First name is required.", "Failed Registration");
    }
    @Test (dataProvider = "inValidRegistrationLnameTestData")
    public void InValid_LastName_Regiteration(String fname , String lname , String day , String month , String year
            , String email , String company , String passowrd , String confirmpassword) {
        RegisterPage InValidregisterPage = navBarPage.clickRegisterButton_HomePage();
        InValidregisterPage.setMaleRadio();
        InValidregisterPage.setFirstName(fname);
        InValidregisterPage.setLastName(lname);
        InValidregisterPage.setDateOfBirthDay(day);
        InValidregisterPage.setDateOfBirthMonth(month);
        InValidregisterPage.setDateOfBirthYear(year);
        InValidregisterPage.setEmail(email);
        InValidregisterPage.setCompanyName(company);
        InValidregisterPage.setNewsletter();
        InValidregisterPage.setPassword(passowrd);
        InValidregisterPage.setConfirmPassword(confirmpassword);
        RegisterPage registerPage = InValidregisterPage.clickRegisterButtun_RegisterPage();
        assertEquals(registerPage.getinValidLastNameFailed(), "Last name is required.", "Failed Registration");
    }
    @Test (dataProvider = "inValidRegistrationPassTestData")
    public void InValid_Password_Regiteration(String fname , String lname , String day , String month , String year
            , String email , String company , String passowrd , String confirmpassword) {
        RegisterPage InValidregisterPage = navBarPage.clickRegisterButton_HomePage();
        InValidregisterPage.setMaleRadio();
        InValidregisterPage.setFirstName(fname);
        InValidregisterPage.setLastName(lname);
        InValidregisterPage.setDateOfBirthDay(day);
        InValidregisterPage.setDateOfBirthMonth(month);
        InValidregisterPage.setDateOfBirthYear(year);
        InValidregisterPage.setEmail(email);
        InValidregisterPage.setCompanyName(company);
        InValidregisterPage.setNewsletter();
        InValidregisterPage.setPassword(passowrd);
        InValidregisterPage.setConfirmPassword(confirmpassword);
        RegisterPage registerPage = InValidregisterPage.clickRegisterButtun_RegisterPage();
        assertFalse(registerPage.getinValidPasswordFailed().contains("Password must meet the following rules: "), "Failed Registration");
    }
    @Test (dataProvider = "inValidRegistrationConfPassTestData")
    public void InValid_MatchPassword_Regiteration(String fname , String lname , String day , String month , String year
            , String email , String company , String passowrd , String confirmpassword) {
        RegisterPage InValidregisterPage = navBarPage.clickRegisterButton_HomePage();
        InValidregisterPage.setMaleRadio();
        InValidregisterPage.setFirstName(fname);
        InValidregisterPage.setLastName(lname);
        InValidregisterPage.setDateOfBirthDay(day);
        InValidregisterPage.setDateOfBirthMonth(month);
        InValidregisterPage.setDateOfBirthYear(year);
        InValidregisterPage.setEmail(email);
        InValidregisterPage.setCompanyName(company);
        InValidregisterPage.setNewsletter();
        InValidregisterPage.setPassword(passowrd);
        InValidregisterPage.setConfirmPassword(confirmpassword);
        RegisterPage registerPage = InValidregisterPage.clickRegisterButtun_RegisterPage();
        assertEquals(registerPage.getinValidMatchPasswordFailed(),"The password and confirmation password do not match." , "Failed Registration");
    }
}