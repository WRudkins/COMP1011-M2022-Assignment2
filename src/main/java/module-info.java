module ca.georgian.comp1011m2022assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ca.georgian.comp1011m2022assignment2 to javafx.fxml;
    exports ca.georgian.comp1011m2022assignment2;
}