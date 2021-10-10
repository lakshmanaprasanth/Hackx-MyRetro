package myretro.myretrobusinesslogic;

import org.springframework.stereotype.Component;

import myretro.myretroentity.interviewexperienceentity;

@Component
public class interviewexperience {
	
	public String interviewexperience_store(interviewexperienceentity interviewExperienceEntityObject)
	{
		System.out.print("Receieved data from interview experience page:" + interviewExperienceEntityObject);
		return "Thanks for submitting the feedback";
	}
	

}
