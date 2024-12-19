module com.example.besterp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.besterp to javafx.fxml;
    exports com.example.besterp;
}