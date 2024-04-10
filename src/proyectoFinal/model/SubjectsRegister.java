package proyectoFinal.model;

import java.util.Date;

public class SubjectsRegister {
    //numero de registro
	private String registerNumber;
	//fecha de registro 
	private Date subjectRegisterDate;
	//periodo de registro
	private String subjectPeriod;

	/**
	 * constructor de registro de materia
	 * @param registerNumber
	 * @param subjectRegisterDate
	 * @param subjectPeriod
	 */
	public SubjectsRegister(String registerNumber, Date subjectRegisterDate, String subjectPeriod) {
		super();
		this.registerNumber = registerNumber;
		this.subjectRegisterDate = subjectRegisterDate;
		this.subjectPeriod = subjectPeriod;
	}

	/**
	 * @return el numero de registro
	 */
	public String getRegisterNumber() {
		return registerNumber;
	}

	/**
	 * @param registerNumber el numero de registro a guardar
	 */
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	/**
	 * @return la fecha de registro de la materia
	 */
	public Date getSubjectRegisterDate() {
		return subjectRegisterDate;
	}

	/**
	 * @param subjectRegisterDate la fecha de registro de la materia a guardar
	 */
	public void setSubjectRegisterDate(Date subjectRegisterDate) {
		this.subjectRegisterDate = subjectRegisterDate;
	}

	/**
	 * @return el periodo de la materia
	 */
	public String getSubjectPeriod() {
		return subjectPeriod;
	}

	/**
	 * @param subjectPeriod el periodo de la materia a guardar
	 */
	public void setSubjectPeriod(String subjectPeriod) {
		this.subjectPeriod = subjectPeriod;
	}



}
