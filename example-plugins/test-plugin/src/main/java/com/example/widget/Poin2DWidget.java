package com.example.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;

@Description(name = "MyPoin2D", dataTypes = Double.class)
@ParametrizedController("Point2DWidget.fxml")
public final class Point2DWidget extends SimpleAnnotatedWidget<import edu.wpi.first.shuffleboard.api.widget.Description;
> {

  private Double xValue;
  private Double yValue;

  @FXML
  private Pane root;

  @FXML
  private Slider xSlider;

  @FXML
  private Slider ySlider;

  @Override
  private void initialize() {
    xSlider.valueProperty().bind(dataOrDefault.map(xValue));
    ySlider.valueProperty().bind(dataOrDefault.map(yValue));
  }

  @Override
  public Pane getView() {
    return root;
  }

}