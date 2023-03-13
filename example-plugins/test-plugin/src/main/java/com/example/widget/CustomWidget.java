package com.example.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.AbstractWidget;
import javafx.fxml.FXML;

@Description(name = "CustomWidget")
@ParametrizedController("CustomWidget.fxml")
public final class CustomWidget extends AbstractWidget {

  @FXML
  private Pane root;

  @FXML
  private HBox buttomContainer;

  @FXML
  private VBox chooserContainer;

  @FXML
  private Button addTrajectoryButton;

  @FXML
  private Button addScoringButton;

  @FXML
  private Button addOtherButton;

  EventHandler<ActionEvent> addTrajectoryEventHandler = new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e)
      {
        // Add trajectory auto chooser
      }
  };

  EventHandler<ActionEvent> addScoringEventHandler = new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e)
    {
      // Add scoring auto chooser
    }
  };

  EventHandler<ActionEvent> addOtherEventHandler = new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e)
    {
      // Add other auto chooser
    }
  };

  @Override
  private void initialize() {
    // xSlider.valueProperty().bind(dataOrDefault.map(xValue));
    // ySlider.valueProperty().bind(dataOrDefault.map(yValue));
    addTrajectoryButton.setOnAction(addTrajectoryEventHandler);
    addScoringButton.setOnAction(addScoringEventHandler);
    addOtherButton.setOnAction(addOtherEventHandler);
  }

  @Override
  public Pane getView() {
    return root;
  }

}