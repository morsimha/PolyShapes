module com.example.polyshape {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.polyshape to javafx.fxml;
    exports com.example.polyshape;
}