module mns.java.javaFXTest3 {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens mns.java.javaFXTest3 to javafx.fxml;
    exports mns.java.javaFXTest3;
}
