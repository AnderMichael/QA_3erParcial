package movileTesting.activities;

import movileTesting.control.Button;
import movileTesting.control.TextBox;
import org.openqa.selenium.By;

public class EditTaskScreen {
    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDeletionButton = new Button(By.id("android:id/button1"));
}
