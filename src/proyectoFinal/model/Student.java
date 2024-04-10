package proyectoFinal.model;

import java.util.Date;
/**
 * Clase estudiante
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */

public class Student {
	
	//documento de identidad del estudiante
	private String documentCardStudent;
	//nombre del estudiante
	private String nameStudent;
	//fecha de cumpleañoz del estudiante
	private String birthDateStudent;
	//lista de materias del estudiante
	private Subject subjectList[] = new Subject[6];


/**
 * Constructor de la clase estudiante
 * @param documentCardStudent
 * @param nameStudent
 * @param birthDateStudent
 */
	public Student(String documentCardStudent, String nameStudent, String birthDateStudent) {
		
		this.documentCardStudent = documentCardStudent;
		this.nameStudent = nameStudent;
		this.birthDateStudent = birthDateStudent;
	}

	/**
	 * @return la cedula del estudiante 
	 */
	public String getDocumentCardStudent() {
		return documentCardStudent;
	}

	/**
	 * @param documentCardStudent la cedula del estudiante a guardar
	 */
	public void setDocumentCardStudent(String documentCardStudent) {
		this.documentCardStudent = documentCardStudent;
	}

	/**
	 * @return el nombre del estudiante
	 */
	public String getNameStudent() {
		return nameStudent;
	}

	/**
	 * @param nameStudent el nomre del estudiante a guardar
	 */
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	/**
	 * @return la fecha de cumplea�os del estudiante 
	 */
	public String getBirthDateStudent() {
		return birthDateStudent;
	}

	/**
	 * @param birthDateStudent la fecha de cumplea�os a guardar
	 */
	public void setBirthDateStudent(String birthDateStudent) {
		this.birthDateStudent = birthDateStudent;
	}

	/**
	 * @return arreglo de materias
	 */
	public Subject[] getSubjectList() {
		return subjectList;
	}

	/**
	 * @param subjectList el arreglo a guardar
	 */
	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	/**
	 * Metodo que busca un estudiante por documento de identidad
	 * @param cedula El numero de la cedula a buscar
	 * @return retorna true si la encuentra y false si no está.
	 */
	public boolean searchStudentDocumentCard(String cedula) {

		if(documentCardStudent == cedula) {
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		return "Student [documentCardStudent=" + documentCardStudent + ", nameStudent=" + nameStudent
				+ ", birthDateStudent=" + birthDateStudent + "]";
	}
	
	
}
