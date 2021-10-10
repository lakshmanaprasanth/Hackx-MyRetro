package myretro.myretroentity;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import myretro.myretrobusinesslogic.motivationquote;

public class motivationquoteentity {
	
	private String timenow;
	private String pattern = "HH:mm";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	motivationquote motivationQuoteObject;
	
	public motivationquote motivationquoteentity() {
		this.timenow = simpleDateFormat.format(new Date());
		return new motivationquote(this.timenow);
	}
	
	public String motivationquoteentity_add(String newquote) {
		this.timenow = simpleDateFormat.format(new Date());
		return motivationQuoteObject.motivationQuote_Update(newquote);
	}

	public String getTimenow() {
		return timenow;
	}

	public void setTimenow(String currenttime) {
		this.timenow = currenttime;
	}
	

}
