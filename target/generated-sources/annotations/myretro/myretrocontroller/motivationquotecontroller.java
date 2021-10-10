package myretro.myretrocontroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import myretro.myretroentity.motivationquoteentity;

public class motivationquotecontroller {
	
	
	@Autowired
	motivationquoteentity motivationQuoteEntityObject;
	
	@RequestMapping("/")
	public motivationquoteentity home()
	{
		return motivationQuoteEntityObject = new motivationquoteentity();
	}
	
	@RequestMapping("/addquote")
	public String home(@RequestParam("newquote") String newquote)
	{
		return motivationQuoteEntityObject.motivationquoteentity_add(newquote);
	}

}
