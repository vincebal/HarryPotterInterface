module com.example.harrypotterinterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.harrypotterinterface to javafx.fxml;
    exports com.example.harrypotterinterface;
}