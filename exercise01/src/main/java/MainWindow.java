import com.project.controllers.AddTaskController;
import com.project.controllers.RemoveTaskController;
import com.project.controllers.TaskListController;
import com.project.views.AddTaskPanel;
import com.project.views.RemoveTaskPanel;
import com.project.views.TaskListPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);

        setLayout(new BorderLayout());

        TaskListController taskListController = new TaskListController();
        RemoveTaskController removeTaskController = new RemoveTaskController(taskListController);
        AddTaskController addTaskController = new AddTaskController(taskListController);

        RemoveTaskPanel removeTaskPanel = new RemoveTaskPanel(removeTaskController);
        AddTaskPanel addTaskPanel = new AddTaskPanel(addTaskController);
        TaskListPanel taskListPanel = new TaskListPanel(taskListController);

        add(addTaskPanel, BorderLayout.NORTH);
        add(taskListPanel, BorderLayout.CENTER);
        add(removeTaskPanel, BorderLayout.SOUTH);

        setTitle("Exercise 01");
        setVisible(true);
    }
}
