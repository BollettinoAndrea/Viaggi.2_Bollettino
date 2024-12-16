module com.example.viaggi_bollettino {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viaggi_bollettino to javafx.fxml;
    exports com.example.viaggi_bollettino;
}