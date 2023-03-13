package com.example.widget;

import edu.wpi.first.Shuffleboard.api.widget.Description;
import edu.wpi.first.Shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.Shuffleboard.api.widget.AbstractWidget;
import javafx.fxml.FXML;

@Description(name = "TrajectoryChooser")
@ParametrizedController("TrajectoryChooser.fxml")
public final class TrajectoryChooser extends AbstractWidget {
    @FXML
    private Pane root;

    @FXML
    private ComboBox chooser;

    @Override
    private void initialize() {
        // Add options to chooser
    }

    @Override
    public Pane getView() {
        return root;
    }

    
}