package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.SubjectDAO;
import kr.ac.hansung.model.Subject;
import kr.ac.hansung.model.eSubject;

@Service
public class SubjectService {

	private SubjectDAO subjectDao;

	@Autowired
	public void setSubjectDAO(SubjectDAO subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	public List<Subject> getCurrent(){
		return subjectDao.getSubject();
	}

	public void insert(Subject subject) {
		subjectDao.insert(subject);
		
		
	}

	public List<Subject> getsemester() {
		// TODO Auto-generated method stub
		return subjectDao.getSemester();
	}

	public List<Subject> getdivision() {
		// TODO Auto-generated method stub
		return subjectDao.getdivision();
	}

	public void einsert(eSubject esubject) {
		// TODO Auto-generated method stub
		subjectDao.einsert(esubject);
	}

	public List<eSubject> geteCurrent() {
		return subjectDao.geteSubject();
	}

	public List<Subject> getlist() {
		// TODO Auto-generated method stub
		return subjectDao.getlist();
	}
	
	
}
