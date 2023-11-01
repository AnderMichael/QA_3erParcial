package movileTesting.control;

import movileTesting.session.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator = locator;
    }

    public void findControl(){
        control = Session.getSession().getDevice().findElement(this.locator);
    }

    public int findControls(){
        return Session.getSession().getDevice().findElements(this.locator).size();
    }

    public void click(){
        findControl();
        control.click();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }
}
