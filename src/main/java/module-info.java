module com.example.projects_auk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projects_auk to javafx.fxml;
    exports com.example.projects_auk;
}