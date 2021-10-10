package myretro.myretrocommonlogic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class getmotivationquoteonline {
	
	private String newQuote;
	private List<String> QuotesInDB;
	JSONParser jsonParser;
	private String motivationQuoteDataPath = "/myretro/target/generated-sources/annotations/myretro/myretrodatasource/motivationquote.json";
	private String delimiter = "@#$";
	
	public String getMotivationQuoteOnline()
	{
		newQuote = join_quote(getQuote());
		return newQuote;
	}
	
	public String updateMotivationQuote(String updateData)
	{
		if(QuotesInDB.size() == 0)
		{
			updateQuote(updateData);
		}
		else
		{
			QuotesInDB.add(0,updateData);
			updateQuote(join_quote(QuotesInDB));
		}
		return updateData;
	}
	
	private List<String> getQuote()
	{
		try(FileReader reader = new FileReader(motivationQuoteDataPath))
		 {
            Object obj = jsonParser.parse(reader);
            JSONObject motivationQuoteData = (JSONObject) obj;
            JSONObject motivationquote = (JSONObject) motivationQuoteData.get("motivationquote");
            String temp = (String) motivationquote.get("Quote");
            QuotesInDB = Arrays.asList(temp.split(delimiter));
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		return QuotesInDB;
	}
	
	private String join_quote(List<String> QuotesInDB)
	{
		String quotetodisplay = QuotesInDB.remove(0);
		String data = "";
		for(String item : QuotesInDB)
		{
			data += item + delimiter;
		}
		data += quotetodisplay;
		updateMotivationQuote(data);
		
		return quotetodisplay;
	}
	
	private void updateQuote(String updateData)
	{
		JSONObject quoteDetails = new JSONObject();
		quoteDetails.put("Quote",updateData);
		
		JSONObject quoteObject = new JSONObject(); 
		quoteObject.put("motivationquote", quoteDetails);
        
        try (FileWriter file = new FileWriter(motivationQuoteDataPath)) {
            file.write(quoteObject.toJSONString()); 
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
