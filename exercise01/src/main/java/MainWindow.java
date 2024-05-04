import com.project.views.AddTaskView;
import com.project.views.TaskListPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        setLayout(new BorderLayout());
        add(new AddTaskView(), BorderLayout.NORTH);
        add(new TaskListPanel(), BorderLayout.WEST);
        setVisible(true);
    }
}
