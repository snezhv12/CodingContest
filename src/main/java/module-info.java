module com.example.codingcontest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codingcontest to javafx.fxml;
    exports com.example.codingcontest;
}