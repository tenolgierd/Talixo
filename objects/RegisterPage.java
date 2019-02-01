package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    String email2 = "JAHOL@ONET.PL";  // set login here! write it in capitals
    public String setLogin(){
        String registerMail = email2;
        return registerMail;
    }

    public void clickRegisterButton(){
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div/div[1]/div/p/a"));
        registerButton.click();

    }
    public void typeImieField(String imie){
        WebElement imieField = driver.findElement(By.xpath("//*[@id=\"id_first_name\"]"));
        imieField.sendKeys(imie);
    }
    public void typeNazwiskoField(String nazwisko) {
        WebElement nazwiskoField = driver.findElement(By.xpath("//*[@id=\"id_last_name\"]"));
        nazwiskoField.sendKeys(nazwisko);
    }
    public void typePrefixField(String prefix){
        WebElement prefixField = driver.findElement(By.xpath("//*[@id=\"id_mobile_0\"]"));
        prefixField.sendKeys(prefix);
        prefixField.sendKeys(ENTER);
    }
    public void typePhoneNumberField(String phone){
        WebElement phoneField = driver.findElement(By.xpath("//*[@id=\"id_mobile_1\"]"));
        phoneField.sendKeys(phone);
    }
    public void typeEmailField(){
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"id_email_auth\"]"));
        emailField.sendKeys(email2);
    }
    public void typeHasloField (String haslo){
        WebElement hasloField = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
        hasloField.sendKeys(haslo);
    }
    public void clickPodrozujeSluzbowoField(){
        WebElement podrozujeField = driver.findElement(By.xpath("//*[@id=\"id_corporate_request\"]"));
        podrozujeField.click();
    }
    public void typeNazwaFirmyField(String nazwaFirmy){
        WebElement nazwaFirmyFild = driver.findElement(By.xpath("//*[@id=\"id_corporation_name\"]"));
        nazwaFirmyFild.sendKeys(nazwaFirmy);
    }
    public void clickDiscountsCheckBox(){
        WebElement discountsCheckBox = driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[2]/div/div[1]/div/form/div[10]/ul/li[1]/label/span"));
        discountsCheckBox.click();
    }
    public void clickDataCheckBox(){
        WebElement dataCheckBox = driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[2]/div/div[1]/div/form/div[10]/ul/li[2]/label/span"));
        dataCheckBox.click();
    }
    public void clickTermsCheckBox(){
        WebElement termsCheckBox = driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[2]/div/div[1]/div/form/div[10]/ul/li[3]/label/span"));
        termsCheckBox.click();
    }
    public void clickUtworzKontoButton(){
        WebElement utworzKontoButton = driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[2]/div/div[1]/div/form/input[3]"));
        utworzKontoButton.click();
    }
    public String confirmRegistration() {
        WebElement checkEmail2 = driver.findElement(By.xpath("//*[@id=\"landing\"]/div[3]/div[1]/div/ul/li[2]/span/span"));
        String confirmText2 = checkEmail2.getText();
        return confirmText2;
    }







}
