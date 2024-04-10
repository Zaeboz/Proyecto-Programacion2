package proyectoFinal.controller;

import java.awt.Button;
import java.awt.TextField;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;
import proyectoFinal.Faculty;
import proyectoFinal.model.Student;


/**
 *Permite editar los datos de estudiante
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */
public class StudentController {

	@FXML
	private TextField nameStudent;
	@FXML
	private TextField documentCardStudent;
	@FXML
	private TextField birthDateStudent;
	
	@FXML
	private Button saveStudent;
	
	@FXML
	private Button showStudent;
	
	private Faculty faculty;
	
	private int conter = 0;

	@FXML
	public void setStudent() {
		String studentName = nameStudent.getText();
		String studentDocumentCard = documentCardStudent.getText();
		String dateBirth = birthDateStudent.getText();
		faculty.addStudent(studentDocumentCard, studentName, dateBirth);
	}

	/**
	 * Se invoca cuando el usuario de clic en consultar nombre.
	 */
	@FXML
	private void getInformation() {
		ArrayList<Student> studentAux = faculty.getStudentList();
		String datos = studentAux.get(conter).toString();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Consultar nombre del estudiante");
		alert.setContentText(datos);
		alert.setHeaderText(null); //sin titulo interno;
		alert.initStyle(StageStyle.UTILITY);
		alert.showAndWait(); //Se muestra la ventana
		conter++;
	}
	
	

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
