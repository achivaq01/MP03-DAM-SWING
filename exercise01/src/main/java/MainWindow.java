import com.project.views.AddTaskPanel;
import com.project.views.RemoveTaskPanel;
import com.project.views.TaskListPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        setLayout(new BorderLayout());
        add(new AddTaskPanel(), BorderLayout.NORTH);
        add(new TaskListPanel(), BorderLayout.WEST);
        add(new RemoveTaskPanel(), BorderLayout.SOUTH);
        setVisible(true);
    }
}
