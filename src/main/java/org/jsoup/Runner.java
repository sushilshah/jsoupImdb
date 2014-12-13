package org.jsoup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.codehaus.jackson.map.ObjectMapper;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sushil.test.MovieRating;

public class Runner {
	public static void main(String[] args){

		getMovieInfo();
		
		//testMeth();
	}

	static String DVDRIP = "(?i)(dvdrip)";
	static String DVDSRC = "(?i)(dvdscr)";
	static String BRRIP = "(?i)(brrip)";
	static String YEAR = "([0-9]{4})";
	static String HDRIP = "(?i)(HDRip)";
	static String P720P = "720p";


	public static void getMovieInfo(){
		Document doc;

		try {
			List<String> serverList = new ArrayList<String>();
/*			String server2A_F = "http://58.65.128.17:614/English%20Movies%20(A%20-%20F)/?sortby=";
			String server2G_K = "http://58.65.128.17:614/English%20Movies%20(G%20-%20K)/?sortby=";
			String server2L_Q  = "http://58.65.128.17:615/English%20Movies%20(L%20-%20Q)/?sortby=";
			String server2R_S  = "http://58.65.128.17:615/English%20Movies%20(R%20-%20S)/?sortby=";
			String server2T_U  = "http://58.65.128.17:615/English%20Movies%20(T%20-%20U)/?sortby=";
			String server2V_Z  = "http://58.65.128.17:615/English%20Movies%20(V%20-%20Z)/?sortby=";
			
			serverList.add(server2A_F);
			serverList.add(server2G_K);
			serverList.add(server2L_Q);
			serverList.add(server2R_S);
			serverList.add(server2T_U);
			serverList.add(server2V_Z);
*/
			
			String server1HindiA_F = "http://58.65.128.10:906/Hindi%20Movies%20(A%20-%20F)/?sortby=";
			String server1HindiG_K = "http://58.65.128.10:906/Hindi%20Movies%20(G%20-%20K)/?sortby=";
			String server1HindiL_Q = "http://58.65.128.10:906/Hindi%20Movies%20(L%20-%20Q)/?sortby=";
			String server1HindiR_S = "http://58.65.128.10:906/Hindi%20Movies%20(R%20-%20S)/?sortby=";
			String server1HindiT_Z = "http://58.65.128.10:906/Hindi%20Movies%20(T%20-%20Z)/?sortby=";
			serverList.add(server1HindiA_F);
			serverList.add(server1HindiG_K);
			serverList.add(server1HindiL_Q);
			serverList.add(server1HindiR_S);
			serverList.add(server1HindiT_Z);
			
			List< MovieRating> movieRatingList = new ArrayList<MovieRating>();
			String header = "Actors  |  Awards | Country | Director | Genre | Language | Metascore | Plot | Poster | Rated | Released | Response | Runtime | Title | Type | Writer | Year | imdbID | imdbRating | imdbVotes";
			System.out.println("Actors  |  Awards | Country | Director | Genre | Language | Metascore | Plot | Poster | Rated | Released | Response | Runtime | Title | Type | Writer | Year | imdbID | imdbRating | imdbVotes");
			int cnt = 0;
			StringBuilder rawData = new StringBuilder();
			for(String link : serverList){
				doc = Jsoup.connect(link).get();
				
				Elements movieDetailsTr = doc.select("tr");
				for(Element  entry : movieDetailsTr){
					String html =  entry.toString();
					
					//Document doc1 = Jsoup.parse(html);
					//Element link1 = doc1.select("a").first();
					//This is movie name
					String text = entry.select("a").text();//doc1.body().text();
					
					String uploadedDetails = entry.select("td:eq(2)").text();
					
					//Just keeping rawData for the time being
					rawData.append(html);
					rawData.append("\n");

					//Year of the movie
					String year = "";
					Matcher matcher = Pattern.compile(YEAR).matcher(text); 
					if (matcher.find()) 
						year = matcher.group(); 

					text = text.replaceAll(YEAR, "");
					text = text.replaceAll(DVDRIP, "");
					text = text.replaceAll(DVDSRC, "");
					text = text.replaceAll(BRRIP, "");
					text = text.replaceAll(P720P, "");
					text = text.replaceAll(HDRIP, "");
					text = text.trim();
					text = text.replaceAll("\\s\\s*", "+");

					StringBuilder movieNameUrl = new StringBuilder();

					movieNameUrl.append("http://www.omdbapi.com/?i=&t=");
					movieNameUrl.append(text);

					String ratings = httpGet(movieNameUrl.toString());
					try{
						ObjectMapper objectMapper = new ObjectMapper();
						//System.out.println("***RATINGS **** " + ratings);
						MovieRating movieRating = objectMapper.readValue(ratings, MovieRating.class);
						if(movieRating.getTitle() == null || movieRating.getTitle().isEmpty())
							movieRating.setTitle(text);
						cnt++;
						movieRating.setUploadedDate(uploadedDetails);
						movieRatingList.add(movieRating);
						//System.out.println(movieRating);
						
						if(cnt % 100 == 0)
							System.out.println("Count is " + cnt);
						
					}catch (Exception e){
						e.printStackTrace();
					}
				}
				writeToFile(rawData.toString(), "d:/json/rawListHindi.txt");
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(header);
			sb.append("\n");
			for(MovieRating mv : movieRatingList){
				sb.append(mv.toString());
				sb.append("\n");
			}
			writeToFile(sb.toString(), "d:/temp/reportHindi.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DONE");

	}

	public static void writeToFile(String content, String filePath){
		try {
			File file = new File(filePath);
			if(!file.exists())
				file.createNewFile();


			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static String httpGet(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		HttpURLConnection conn =
				(HttpURLConnection) url.openConnection();

		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		// Buffer the result into a string
		BufferedReader rd = new BufferedReader(
				new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();

		conn.disconnect();
		return sb.toString();
	}
	
	public static void testMeth(){
		Document doc;
		String link = "http://58.65.128.10:906/Hindi%20Movies%20(A%20-%20F)/?sortby=";
		try {
			doc = Jsoup.connect(link).get();
			//System.out.println(doc);
			//Elements newsHeadlines = doc.select("a");
			//System.out.println(newsHeadlines);
			//Elements timeDiv = doc.select("td");
			
			//td:eq(2)
			//Elements nextTurns = doc.select("td:eq(2)");
			Elements nextTurns = doc.select("tr");
			System.out.println(nextTurns);
			for(Element ele : nextTurns){
				//System.out.println(ele.text());
				System.out.println(ele.select("a").text());
				System.out.println(ele.select("td:eq(2)").text());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
