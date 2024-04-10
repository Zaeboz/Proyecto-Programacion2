package proyectoFinal.controller;

import java.awt.Button;
import java.awt.TextField;
import java.util.ArrayList;
import proyectoFinal.view.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;
import proyectoFinal.Faculty;
import proyectoFinal.model.Student;
import proyectoFinal.model.Subject;
import proyectoFinal.model.Teacher;


/**
 *Permite editar llas materias
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */

public class TeacherControler {
	@FXML
	private TextField documentCard;
	@FXML
	private TextField teacherName;
	@FXML
	private TextField profession;
	@FXML
	private TextField academicLevel;
	@FXML
	private TextField subject1;
	@FXML
	private TextField subject2;
	@FXML
	private TextField subject3;
	@FXML
	private TextField subject4;
	@FXML
	private Button saveStudent;
	@FXML
	private Button showTeacher;
	
	private Faculty faculty;
	
	private int conter = 0;

	@FXML
	public void setStudent() {
		ArrayList <Subject> subjectList1= new ArrayList<>();
		
		String documentCard1 = documentCard.getText();
		String  teacherName1 = teacherName.getText();
		String profession1 = profession.getText();
		int academicLeve1= Integer.parseInt(academicLevel.getText());
		String subject11= subject1.getText();
		String subject22= subject2.getText();
		String subject33= subject3.getText();
		String subject44= subject4.getText();
		
		Subject subject1= new Subject("10222", subject11 ,4, 1, 1);
		Subject subject2= new Subject("32123", subject22 ,3, 2, 1);
		Subject subject3= new Subject("54322", subject33 ,4, 2, 1);
		Subject subject4= new Subject("10123", subject44 ,4, 1, 1);
		
		subjectList1.add(subject1);
		subjectList1.add(subject2);
		subjectList1.add(subject3);
		subjectList1.add(subject4);
		
		addTeacher(documentCard1, teacherName1, profession1,academicLeve1,subjectList1);
	}

	/**
	 * Se invoca cuando el usuario de clic en consultar nombre.
	 */
	@FXML
	private void getInformation() {
		ArrayList<Teacher> teacherAux = faculty.getTeacherList();
		String datos = teacherAux.get(conter).toString();
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
