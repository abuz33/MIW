module com.example.bankingjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankingjfx to javafx.fxml;
    exports com.example.bankingjfx;
}