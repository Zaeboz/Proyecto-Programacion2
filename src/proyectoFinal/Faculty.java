package proyectoFinal;

import java.io.IOException;
import java.util.ArrayList;
import proyectoFinal.model.*;
import proyectoFinal.view.StudentController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Faculty extends Application {

	private ArrayList<Career> careerList;
	private ArrayList<Student> studentList;
	private ArrayList<Teacher> teacherList;
	private ArrayList<Subject> subjectList;
	private BorderPane layoutRaiz;
	private Stage principalStage;

	@Override
	public void start(Stage primaryStage) 
	{
		careerList = new ArrayList<>();
		studentList = new ArrayList<>();
		teacherList = new ArrayList<>();
		this.principalStage = primaryStage;
		this.principalStage.setTitle("Aplicación sobre una materia: ");
		inicializarLayoutRaiz();
		mostrarVistaPersona();
	}

	/**
	 * @return the teacherList
	 */
	public ArrayList<Teacher> getTeacherList() {
		return teacherList;
	}



	/**
	 * @param teacherList the teacherList to set
	 */
	public void setTeacherList(ArrayList<Teacher> teacherList) {
		this.teacherList = teacherList;
	}



	/**
	 * @return the subjectList
	 */
	public ArrayList <Subject> getSubjectList() {
		return subjectList;
	}


	/**
	 * @param subjectList the subjectList to set
	 */
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}


	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Metodo constructor de faculty
	 */
	public Faculty(){

	}

	/**
	 * Metodo para crear un estudiante
	 * @param documentCardStudent
	 * @param nameStudent
	 * @param birthDateStudent
	 */
	public void addStudent(String documentCardStudent, String nameStudent, String birthDateStudent){

		Student student = new Student(documentCardStudent, nameStudent, birthDateStudent);
		studentList.add(student);
	}

	/**
	 * Metodo para añadir-crear un profesor 
	 * @param documentCard
	 * @param teacherName
	 * @param profession
	 * @param academicLevel
	 */
	public void addTeacher(String documentCard, String teacherName, String profession, int academicLevel, ArrayList<Subject> subjectlist2) {

		Teacher teacher= new Teacher(documentCard, teacherName, profession, academicLevel, subjectlist2);
		teacherList.add(teacher);
	}

	/**
	 * Metodo que valida una materia para no se repita la misma materia
	 * @param subjectTeacher
	 * @param subjectAux
	 */
	public void validateSubject(ArrayList<Subject> subjectTeacher, Subject subjectAux) {

		do {subjectTeacher.add(subjectAux);

		}while((subjectTeacher.contains(subjectAux) == false) && (subjectTeacher.size()<=4));
	}

	/**
	 * Metodo para añadir una materia
	 * @param subjectCode
	 * @param subjecName
	 * @param numberCredits
	 * @param subjectType
	 * @param semester
	 */
	public void addSubject(String subjectCode, String subjecName, int numberCredits, int subjectType, 
			int semester) {

		Subject subject = new Subject(subjectCode, subjecName, numberCredits, subjectType, semester);
		subjectList.add(subject);

	}

	/**
	 * Metodo para buscar una carrera por su nombre 
	 * @param careerName Nombre de la carrera a buscar 
	 * @return Retorna la posicion de la carrera. Retorna -1 si la 
	 * carrera no se encuentra
	 */
	public Career careerSerch(String careerName) {

		for(int i = 0; i < careerList.size(); i++) {

			if(careerList.get(i).getCareerName().equals(careerName)) {

				return careerList.get(i);
			}
		}
		return null;
	}

	/**
	 * Metodo para añadir una carrera.
	 * @param career Objeto de tipo carrera.
	 * @return Retorna true si se añade la carrera y false si la carrera ya exsite.
	 */
	public boolean addCareer(Career career) {

		if(careerList.contains(career)) {
			return false;
		}
		else {
			careerList.add(career);
			return true;
		}
	}

	/**
	 * Metodo para eliminar una carrera
	 * @param careerName Nombre de la carrera a eliminar
	 */
	public void delateCareer(String careerName) {

		Career carrera;

		carrera = careerSerch(careerName);


		careerList.remove(carrera);

	}

	/**
	 * Metodo para validar si hay espacio para agregar 
	 * una nueva carrera
	 * @return
	 */
	public boolean validateCareer() {

		if(careerList.size()<=5) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo que busca un estudiante por su documento de identidad
	 * @param documentCard
	 * @return
	 */
	public boolean searchStudent(String documentCard) {

		for(int i = 0; i < studentList.size(); i++) {

			if(studentList.get(i).searchStudentDocumentCard(documentCard) == true) {

				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que muestra los datos del estudiante
	 */
	@FXML
	public void mostrarVistaPersona() {
		try {
			// Carga la vista de la persona.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Faculty.class.getResource("view/VistaPrincipal.fxml"));
			AnchorPane vistaPersona = (AnchorPane) loader.load();

			// Fija la vista de la person en el centro del root layout.
			layoutRaiz.setCenter(vistaPersona);

			// Acceso al controlador.
			StudentController myController = loader.getController();
			myController.setFaculty(this);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Metodo que muestra el diseño
	 */
	public void inicializarLayoutRaiz () {

		try {
			// Carga el root layout desde un archivo xml
			FXMLLoader cargador = new FXMLLoader();
			cargador.setLocation(Faculty.class.getResource("view/LayoutRaiz.fxml"));
			layoutRaiz = (BorderPane) cargador.load();
			// Muestra la escena que contiene el RootLayout
			Scene scene = new Scene(layoutRaiz);
			principalStage.setScene(scene);
			principalStage.show();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @return the studentList
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @return the subjectList
	 */

}
