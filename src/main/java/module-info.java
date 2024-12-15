module com.example.besterp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.besterp to javafx.fxml;
    exports com.example.besterp;
}