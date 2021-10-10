package myretro.myretroentity;

import java.util.List;

public class interviewexperienceentity {
	
	private String appearedcompany;
	private String roleinterviewedfor;
	private String requiredyearsofexperience;
	private List<String> techstack;
	private String interviewround;
	private List<String> interviewquestion;
	private List<String> answer;
	private List<String> myapproach;
	private String interviewresult;
	
	
	public interviewexperienceentity(String appearedcompany, String roleinterviewedfor,
			String requiredyearsofexperience, List<String> techstack, String interviewround,
			List<String> interviewquestion, List<String> answer, List<String> myapproach, String interviewresult) {
		super();
		this.appearedcompany = appearedcompany;
		this.roleinterviewedfor = roleinterviewedfor;
		this.requiredyearsofexperience = requiredyearsofexperience;
		this.techstack = techstack;
		this.interviewround = interviewround;
		this.interviewquestion = interviewquestion;
		this.answer = answer;
		this.myapproach = myapproach;
		this.interviewresult = interviewresult;
	}


	public String getAppearedcompany() {
		return appearedcompany;
	}


	public void setAppearedcompany(String appearedcompany) {
		this.appearedcompany = appearedcompany;
	}


	public String getRoleinterviewedfor() {
		return roleinterviewedfor;
	}


	public void setRoleinterviewedfor(String roleinterviewedfor) {
		this.roleinterviewedfor = roleinterviewedfor;
	}


	public String getRequiredyearsofexperience() {
		return requiredyearsofexperience;
	}


	public void setRequiredyearsofexperience(String requiredyearsofexperience) {
		this.requiredyearsofexperience = requiredyearsofexperience;
	}


	public List<String> getTechstack() {
		return techstack;
	}


	public void setTechstack(List<String> techstack) {
		this.techstack = techstack;
	}


	public String getInterviewround() {
		return interviewround;
	}


	public void setInterviewround(String interviewround) {
		this.interviewround = interviewround;
	}


	public List<String> getInterviewquestion() {
		return interviewquestion;
	}


	public void setInterviewquestion(List<String> interviewquestion) {
		this.interviewquestion = interviewquestion;
	}


	public List<String> getAnswer() {
		return answer;
	}


	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}


	public List<String> getMyapproach() {
		return myapproach;
	}


	public void setMyapproach(List<String> myapproach) {
		this.myapproach = myapproach;
	}


	public String getInterviewresult() {
		return interviewresult;
	}


	public void setInterviewresult(String interviewresult) {
		this.interviewresult = interviewresult;
	}
	
	

}
