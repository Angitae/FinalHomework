package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.model.eSubject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class subjectController {
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/docreate")
	public String showsubject(Model model) {

		List<Subject> subject = subjectService.getCurrent();

		model.addAttribute("subject", subject);// 
		return "docreate";
	}
	@RequestMapping("/list")
	public String showsubjectlist(Model model) {

		List<Subject> subject = subjectService.getlist();

		model.addAttribute("subject", subject);// 
		return "list";
	}
	@RequestMapping("/dosemester")
	public String showsemester(Model model) {

		List<Subject> subject = subjectService.getsemester();
		model.addAttribute("subject", subject);// 
		return "dosemester";
	}
	@RequestMapping("/dodivision")
	public String showdivision(Model model) {

		List<Subject> subject = subjectService.getdivision();
		
		model.addAttribute("subject", subject);// 
		return "dodivision";
	}
	@RequestMapping("/doregister")
	public String addregister(Model model, eSubject esubject) {
		subjectService.einsert(esubject);
		System.out.println(esubject.getEsubjectname());
		return "doregister";
	}
	@RequestMapping("/register")
	public String createOffer(Model model){

		
		return "doregister";
	}
	@RequestMapping("/doregisterview")
	public String showregister(Model model) {

		List<eSubject> esubject = subjectService.geteCurrent();

		model.addAttribute("esubject", esubject);// 
		return "doregisterview";
	}
}
