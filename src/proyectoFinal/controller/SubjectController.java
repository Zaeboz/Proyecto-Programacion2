package proyectoFinal.controller;

import java.awt.Button;
import java.awt.TextField;
import java.util.ArrayList;

import javax.security.auth.Subject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;
import proyectoFinal.Faculty;
import proyectoFinal.model.Student;


/**
 *Permite editar llas materias
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */
public class SubjectController {

	@FXML
	private TextField subjectCode;
	@FXML
	private TextField subjectName;
	@FXML
	private TextField numberCredits;
	@FXML
	private TextField subjectType;
	@FXML
	private TextField semester;
	@FXML
	private Button saveSubject;
	@FXML
	private Button showSubject;
	
	private Faculty faculty;
	
	private int conter = 0;

	@FXML
	public void setSubject() {
		String subjectCode1= subjectCode.getText();
		String subjectName1= subjectName.getText();
		int numberCredits1= Integer.parseInt(numberCredits.getText());
		int subjectType1= Integer.parseInt(subjectType.getText());
		int semester1= Integer.parseInt(semester.getText());
		faculty.addSubject(subjectCode1, subjectName1, numberCredits1,subjectType1,semester1);
	}

	/**
	 * Se invoca cuando el usuario de clic en mostrar los datos de la materia
	 */
	@FXML
	private void getInformation() {
		ArrayList <proyectoFinal.model.Subject> subjectAux = faculty.getSubjectList();
		String datos = subjectAux.get(conter).toString();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Consultar nombre de la materia");
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
