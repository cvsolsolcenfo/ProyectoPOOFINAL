module com.example.Controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens View to javafx.fxml;
    exports View;
}