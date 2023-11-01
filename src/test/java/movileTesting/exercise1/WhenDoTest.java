package movileTesting.exercise1;


import movileTesting.activities.AddTaskScreen;
import movileTesting.activities.EditTaskScreen;
import movileTesting.activities.MyListScreen;
import movileTesting.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Date;

public class WhenDoTest {
    AddTaskScreen addTaskScreen = new AddTaskScreen();
    MyListScreen myListScreen = new MyListScreen();

    EditTaskScreen editTaskScreen = new EditTaskScreen();

    @Test
    public void verifyCRUDTask() throws InterruptedException {
        String title = "UPB" + new Date().getTime();
        myListScreen.addButton.click();

        addTaskScreen.titleTextBox.setText(title);
        addTaskScreen.noteTextBox.setText("this is a note");
        addTaskScreen.saveButton.click();

        Assertions.assertTrue(myListScreen.getSpecificTask(title).isControlDisplayed(),
                "ERROR! la tarea no fue creada");

        myListScreen.getSpecificTask(title).click();

        String title2 = "UPB" + new Date().getTime() + "URGENTE";

        editTaskScreen.titleTextBox.clearSetText(title2);
        editTaskScreen.noteTextBox.setText("Esto es una Nota");
        editTaskScreen.saveButton.click();

        Assertions.assertTrue(myListScreen.getSpecificTask(title2).isControlDisplayed(),
                "ERROR! la tarea no fue modificada");

        myListScreen.getSpecificTask(title2).click();
        editTaskScreen.deleteButton.click();
        editTaskScreen.confirmDeletionButton.click();

        Assertions.assertFalse(myListScreen.getSpecificTask(title2).isControlDisplayed(),
                "ERROR! la tarea no fue eliminada");
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeApp();
    }
}


