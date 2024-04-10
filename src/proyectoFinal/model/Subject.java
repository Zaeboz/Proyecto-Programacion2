package proyectoFinal.model;

import java.util.ArrayList;

/**
 * Clase materia
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */
public class Subject {
    //codigo de la materia
	private String subjectCode;
	//nombre de la materia
	private String subjectName;
	//numero de creditos de la materia
	private int numberCredits;
	//tipo de materia
	private int subjectType;
	//semestre en el que và
	private int semester;
	//lista de profesores 
	private ArrayList<Teacher> teacher;
	
	/**
	 * constructor de la materia
	 * @param subjectCode
	 * @param subjectName
	 * @param numberCredits
	 * @param subjectType
	 * @param semester
	 */
	public Subject(String subjectCode, String subjectName, int numberCredits, int subjectType, int semester) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.numberCredits = numberCredits;
		this.subjectType = subjectType;
		this.semester = semester;
		this.teacher = teacher;
	}

	/**
	 * @return El codigo de la materia
	 */
	public String getSobjectCode() {
		return subjectCode;
	}

	/**
	 * @param sobjectCode El codigo de la materia a guardar.
	 */
	public void setSobjectCode(String sobjectCode) {
		this.subjectCode = sobjectCode;
	}

	/**
	 * @return El nombre de la materia
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName El nombre de la materia a guardar.
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return La cantidad de creditos de la carrera
	 */
	public int getAmountCredits() {
		return numberCredits;
	}

	/**
	 * @param numberCredits La cantidad de creditos de la materia a guardar
	 */
	public void setAmountCredits(int amountCredits) {
		this.numberCredits = amountCredits;
	}

	/**
	 * @return El tipo de la materia (practica, teorica o teorico-practica)
	 */
	public int getSubjectType() {
		return subjectType;
	}

	/**
	 * @param subjectType El tipo de la materia (practica, teorica o
	 *                    teorico-practica) a guardar
	 */
	public void setSubjectType(int subjectType) {
		this.subjectType = subjectType;
	}

	/**
	 * @return El semestre en el que va la materia
	 */
	public int getSemester() {
		return semester;
	}

	/**
	 * @param semester El semestre en el que va la materia a guardar
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}


}
