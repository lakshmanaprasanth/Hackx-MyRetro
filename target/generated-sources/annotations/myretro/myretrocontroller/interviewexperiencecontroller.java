package myretro.myretrocontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myretro.myretrobusinesslogic.interviewexperience;
import myretro.myretroentity.interviewexperienceentity;

@Controller
public class interviewexperiencecontroller {
	
	@Autowired
	interviewexperience interviewExperienceObject;
	interviewexperienceentity interviewExperienceEntityObject;
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addinterviewexperience")
	public String add_interview_experience()
	{
		
		return "interviewexperience.jsp";
	}
	
	@RequestMapping("/interviewexperience")
	public String interview_experience(@RequestParam("appearedcompany") String appearedcompany,@RequestParam("roleinterviewedfor") String roleinterviewedfor,
			@RequestParam("requiredyearsofexperience") String requiredyearsofexperience,@RequestParam("techstack") List<String> techstack,
			@RequestParam("interviewround") String interviewround,@RequestParam("interviewquestion") List<String> interviewquestion,
			@RequestParam("answer") List<String> answer,@RequestParam("myapproach") List<String> myapproach,
			@RequestParam("interviewresult") String interviewresult)
	{
		interviewExperienceEntityObject = new interviewexperienceentity(appearedcompany,roleinterviewedfor,requiredyearsofexperience,
				techstack,interviewround,interviewquestion,answer,myapproach,interviewresult);
		System.out.print(interviewExperienceObject.interviewexperience_store(interviewExperienceEntityObject));
		return "index.jsp";
	}

}
