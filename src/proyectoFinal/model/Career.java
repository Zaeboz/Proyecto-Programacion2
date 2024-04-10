package proyectoFinal.model;

import java.util.ArrayList;


/**
 * Clase carrera
 * @author juanenmanel
 * @author jorgeivan
 * @author claudiaordoñez
 * @author brayantaimal
 */
public class Career {
	
    //codigo de la carrera
	private String careerCode;
	//nombre de la carrera
	private String careerName;
	//lista de materias 
	private ArrayList <Subject> subjectList;
	//lista de registros
	private ArrayList <SubjectsRegister> subjectsRegisterList;
	
	/**
	 * Constructor de la carrera.
	 * @param careerCode Cidgo de la carrera.
	 * @param careerName Bombre de la carrera.
	 */
	public Career(String careerCode, String careerName) {
		this.careerCode = careerCode;
		this.careerName = careerName;
		subjectList = new ArrayList<Subject>();
		subjectsRegisterList = new ArrayList<SubjectsRegister>();
	}

	/**
	 * Metodo para agregar una materia.
	 * @param subject Materia a gregar en la carrera
	 * @return Retorna true si se añade la materia y 
	 * false si la materia ya exsite.
	 */
	public boolean addSubject(Subject subject) {
		
		int index;

		index = searchSubject(subject.getSobjectCode());

		if(index == -1) {

			subjectList.add(subject);
			return true;
		}
		return false;
	}

	/**
	 * Metodo para eliminar una materia
	 * @param code Codigo de la materia a eliminar
	 */
	public void delateSubject(String code) {

		int index;

		index = searchSubject(code);

		if (index != -1 ) {
			subjectList.remove(index);
		}
	}
	
	/**
	 * Metodo para buscar una materia por su codigo 
	 * @param code Codigo de la materia a buscar 
	 * @return Retorna la posicion de la materia. Retorna -1 si la 
	 * materia no se encuentra
	 */
	public int searchSubject(String code) {

		for(int i = 0; i < subjectList.size(); i++) {

			if(subjectList.get(i).getSobjectCode().equals(code)) {

				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Metodo para modificar una materia ingresada.
	 * @param subject Objeto materia para modificar.
	 */
	public void modificateSubject(Subject subject) {
		
		int index = searchSubject(subject.getSobjectCode());
		
		subjectList.set(index, subject);
	}

	/**
	 * @return El codigo de la carrera
	 */
	public String getCareerCode() {
		return careerCode;
	}
	/**
	 * @param code El codigo de la carrera a guardar.
	 */
	public void setCode(String code) {
		this.careerCode = code;
	}
	/**
	 * @return EL nombre de la carrera
	 */
	public String getCareerName() {
		return careerName;
	}
	/**
	 * @param nameSubject El nombre de la carrera a guardar
	 */
	public void setNameSubject(String nameSubject) {
		this.careerName = nameSubject;
	}


}
