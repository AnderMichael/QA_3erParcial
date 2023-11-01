package movileTesting.activities;

import movileTesting.control.Button;
import movileTesting.control.Label;
import org.openqa.selenium.By;

public class MyListScreen {
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label getSpecificTask(String nameTask){
        Label taskNameLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
        return taskNameLabel;
    }
}
