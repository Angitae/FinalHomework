package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.model.eSubject;

@Repository
public class SubjectDAO {

	private JdbcTemplate jdbcTemplateobject;

	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplateobject = new JdbcTemplate(datasource);
	}

	public int getRowcount() {
		String sqlStatement = "select count(*) from subject";
		return jdbcTemplateobject.queryForObject(sqlStatement, Integer.class);

	}

	public Subject getSubject(String subjectcode) {
		String sqlStatement = "select * from subject where subjectcode=?";
		return jdbcTemplateobject.queryForObject(sqlStatement, new Object[] { subjectcode }, new RowMapper<Subject>() {

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setSubjectcode(rs.getString("subjectcode"));
				subject.setSubjectname(rs.getString("subjectname"));
				subject.setdivision(rs.getString("division"));
				subject.setgrade(rs.getInt("grade"));
				
				return subject;
			}

		});
	}

	// multiful object
	public List<Subject> getSubject() {
		String sqlStatement = "select * from subject";
		return jdbcTemplateobject.query(sqlStatement, new RowMapper<Subject>() {

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setSubjectcode(rs.getString("subjectcode"));
				subject.setSubjectname(rs.getString("subjectname"));
				subject.setdivision(rs.getString("division"));
				subject.setgrade(rs.getInt("grade"));
				return subject;
			}

		});

	}

	public boolean insert(Subject subject) {
		
		int year=subject.getYear();
		int semester=subject.getSemester();
		String subjectcode=subject.getSubjectcode();
		String subjectname=subject.getSubjectname();
		String division=subject.getdivision();
		int grade=subject.getgrade();
		
		String sqlStatement = "insert into subject (year, semester, subjectcode,subjectname,division,grade) values (?,?,?,?,?,?)";
		return (jdbcTemplateobject.update(sqlStatement, new Object[] { year, semester, subjectcode,subjectname,division, grade }) == 1);

	}
	public boolean einsert(eSubject esubject) {
		
		String esubjectcode=esubject.getEsubjectcode();
		String esubjectname=esubject.getEsubjectname();
		String edivision=esubject.getEdivision();
		int egrade=esubject.getEgrade();
		
		String sqlStatement = "insert into esubject (esubjectname,esubjectcode,edivision,egrade) values (?,?,?,?)";
		return (jdbcTemplateobject.update(sqlStatement, new Object[] { esubjectcode,esubjectname,edivision, egrade }) == 1);

	}

	public boolean update(Subject subject) {
		int year=subject.getYear();
		int semester=subject.getSemester();
		String subjectcode=subject.getSubjectcode();
		String subjectname=subject.getSubjectname();
		String division=subject.getdivision();
		int grade=subject.getgrade();
		String sqlStatement = "update subject set year=?, semester=?, subjectname=?, division=?, grade=? where subjectcode=?";
		return (jdbcTemplateobject.update(sqlStatement, new Object[] { semester, subjectname, division, grade,subjectcode }) == 1);

	}

	public boolean delete(String subjectcode) {
		String sqlstatement = "delete from subject where subjectcode=?";

		return (jdbcTemplateobject.update(sqlstatement, new Object[] { subjectcode }) == 1);

	}

	public List<Subject> getSemester() {
		String sqlStatement = "select year,semester,sum(grade) from subject group by year,semester";
		return jdbcTemplateobject.query(sqlStatement, new RowMapper<Subject>() {

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setgrade(rs.getInt("sum(grade)"));
				return subject;
			}

		});

	}

	public List<Subject> getdivision() {
		String sqlStatement = "select division,sum(grade) from subject group by division";
		return jdbcTemplateobject.query(sqlStatement, new RowMapper<Subject>() {

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setdivision(rs.getString("division"));
				subject.setgrade(rs.getInt("sum(grade)"));
				return subject;
			}

		});
	}

	public List<eSubject> geteSubject() {
		String sqlStatement = "select * from esubject";
		return jdbcTemplateobject.query(sqlStatement, new RowMapper<eSubject>() {

			public eSubject mapRow(ResultSet rs, int rowNum) throws SQLException {
				eSubject esubject = new eSubject();
				esubject.setEsubjectcode(rs.getString("esubjectcode"));
				esubject.setEsubjectname(rs.getString("esubjectname"));
				esubject.setEdivision(rs.getString("edivision"));
				esubject.setEgrade(rs.getInt("egrade"));
				return esubject;
			}

		});

	}

	public List<Subject> getlist() {
		String sqlStatement = "select year,semester, subjectname from subject order by year,semester";
		return jdbcTemplateobject.query(sqlStatement, new RowMapper<Subject>() {

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setSemester(rs.getInt("semester"));
				subject.setYear(rs.getInt("year"));
				subject.setSubjectname(rs.getString("subjectname"));
				return subject;
			}

		});
	}
}
