package proyectoFinal.model;

import java.util.ArrayList;

/**
 * Clase profesor
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */
public class Teacher {

	//documento del profesor
	private String documentCard;
	//nombre del profesor
	private String teacherName;
	//profecion del profesor 
	private String profession;
	//nivel academico del profesor
	private int academicLevel;
	//lista de materias que dicta el profesor
	private ArrayList<Subject> subjectList;
	
	
	/**
	 * constructor del profesor 
	 * @param documentCard
	 * @param teacherName
	 * @param profession
	 * @param academicLevel
	 * @param subjectList
	 */
	public Teacher(String documentCard, String teacherName, String profession, int academicLevel, ArrayList<Subject> subjectList) {
		super();
		this.documentCard = documentCard;
		this.teacherName = teacherName;
		this.profession = profession;
		this.academicLevel = academicLevel;
		this.subjectList = subjectList;
	}
	
	
	
	/**
	 * @return the documentCard
	 */
	public String getDocumentCard() {
		return documentCard;
	}

	/**
	 * @param documentCard the documentCard to set
	 */
	public void setDocumentCard(String documentCard) {
		this.documentCard = documentCard;
	}

	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}

	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the academicLevel
	 */
	public int getAcademicLevel() {
		return academicLevel;
	}

	/**
	 * @param academicLevel the academicLevel to set
	 */
	public void setAcademicLevel(int academicLevel) {
		this.academicLevel = academicLevel;
	}



}
