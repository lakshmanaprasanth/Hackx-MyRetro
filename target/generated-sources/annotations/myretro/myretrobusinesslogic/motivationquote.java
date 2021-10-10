package myretro.myretrobusinesslogic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import myretro.myretrocommonlogic.getmotivationquoteonline;

@Component
public class motivationquote {
	
	private String currentTime;
	private List<String> motivationQuotesQueue;
	private String currentQuote;
	private Timer timer_autoreset;
	private Timer timer_newquote;
	private int resetTimeLimit;
	
	getmotivationquoteonline getMotivationQuoteObject;


	public motivationquote(String currentTime) {
		super();
		this.currentTime = currentTime;
		this.motivationQuote_Reset();
	}
	
	@Schedules({
	    @Scheduled(fixedDelay = 86400000)
	})
	public String motivationQuote_Reset()
	{
		return getMotivationQuoteObject.getMotivationQuoteOnline();
	}
	
	public String motivationQuote_Update(String newquote)
	{
		return getMotivationQuoteObject.updateMotivationQuote(newquote);
	}
}
