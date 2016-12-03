package kr.ac.hansung.model;

public class eSubject {
	private String esubjectcode;
	private String esubjectname;
	private String edivision;
	private int egrade;
	public String getEsubjectcode() {
		return esubjectcode;
	}
	public void setEsubjectcode(String esubjectcode) {
		this.esubjectcode = esubjectcode;
	}
	public String getEsubjectname() {
		return esubjectname;
	}
	public void setEsubjectname(String esubjectname) {
		this.esubjectname = esubjectname;
	}
	public String getEdivision() {
		return edivision;
	}
	public void setEdivision(String edivision) {
		this.edivision = edivision;
	}
	public int getEgrade() {
		return egrade;
	}
	public void setEgrade(int egrade) {
		this.egrade = egrade;
	}
	@Override
	public String toString() {
		return "교과목명 = " + esubjectname +", 교과코드 =" + esubjectcode +  ", 구분 =" + edivision
				+ ", 학점=" + egrade;
	}
	
}
