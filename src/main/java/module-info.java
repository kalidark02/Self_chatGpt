module com.example.self_chatgpt {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.self_chatgpt to javafx.fxml;
    exports com.example.self_chatgpt;
}