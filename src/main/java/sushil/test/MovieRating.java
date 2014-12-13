package sushil.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.annotate.JsonPropertyOrder;


//@JsonInclude(JsonInclude.Include.NON_NULL)
//@Generated("org.jsonschema2pojo")
/*@JsonPropertyOrder({
	"Actors",
	"Awards",
	"Country",
	"Director",
	"Genre",
	"Language",
	"Metascore",
	"Plot",
	"Poster",
	"Rated",
	"Released",
	"Response",
	"Runtime",
	"Title",
	"Type",
	"Writer",
	"Year",
	"imdbID",
	"imdbRating",
	"imdbVotes"
})*/
public class MovieRating {

	@JsonProperty("Actors")
	private String Actors;
	@JsonProperty("Awards")
	private String Awards;
	@JsonProperty("Country")
	private String Country;
	@JsonProperty("Director")
	private String Director;
	@JsonProperty("Genre")
	private String Genre;
	@JsonProperty("Language")
	private String Language;
	@JsonProperty("Metascore")
	private String Metascore;
	@JsonProperty("Plot")
	private String Plot;
	@JsonProperty("Poster")
	private String Poster;
	@JsonProperty("Rated")
	private String Rated;
	@JsonProperty("Released")
	private String Released;
	@JsonProperty("Response")
	private String Response;
	@JsonProperty("Runtime")
	private String Runtime;
	@JsonProperty("Title")
	private String Title;
	@JsonProperty("Type")
	private String Type;
	@JsonProperty("Writer")
	private String Writer;
	@JsonProperty("Year")
	private String Year;
	@JsonProperty("imdbID")
	private String imdbID;
	@JsonProperty("imdbRating")
	private String imdbRating;
	@JsonProperty("imdbVotes")
	private String imdbVotes;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	
	private String uploadedDate;

	/**
	 * 
	 * @return
	 * The Actors
	 */
	@JsonProperty("Actors")
	public String getActors() {
		return Actors;
	}

	/**
	 * 
	 * @param Actors
	 * The Actors
	 */
	@JsonProperty("Actors")
	public void setActors(String Actors) {
		this.Actors = Actors;
	}

	/**
	 * 
	 * @return
	 * The Awards
	 */
	@JsonProperty("Awards")
	public String getAwards() {
		return Awards;
	}

	/**
	 * 
	 * @param Awards
	 * The Awards
	 */
	@JsonProperty("Awards")
	public void setAwards(String Awards) {
		this.Awards = Awards;
	}

	/**
	 * 
	 * @return
	 * The Country
	 */
	@JsonProperty("Country")
	public String getCountry() {
		return Country;
	}

	/**
	 * 
	 * @param Country
	 * The Country
	 */
	@JsonProperty("Country")
	public void setCountry(String Country) {
		this.Country = Country;
	}

	/**
	 * 
	 * @return
	 * The Director
	 */
	@JsonProperty("Director")
	public String getDirector() {
		return Director;
	}

	/**
	 * 
	 * @param Director
	 * The Director
	 */
	@JsonProperty("Director")
	public void setDirector(String Director) {
		this.Director = Director;
	}

	/**
	 * 
	 * @return
	 * The Genre
	 */
	@JsonProperty("Genre")
	public String getGenre() {
		return Genre;
	}

	/**
	 * 
	 * @param Genre
	 * The Genre
	 */
	@JsonProperty("Genre")
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}

	/**
	 * 
	 * @return
	 * The Language
	 */
	@JsonProperty("Language")
	public String getLanguage() {
		return Language;
	}

	/**
	 * 
	 * @param Language
	 * The Language
	 */
	@JsonProperty("Language")
	public void setLanguage(String Language) {
		this.Language = Language;
	}

	/**
	 * 
	 * @return
	 * The Metascore
	 */
	@JsonProperty("Metascore")
	public String getMetascore() {
		return Metascore;
	}

	/**
	 * 
	 * @param Metascore
	 * The Metascore
	 */
	@JsonProperty("Metascore")
	public void setMetascore(String Metascore) {
		this.Metascore = Metascore;
	}

	/**
	 * 
	 * @return
	 * The Plot
	 */
	@JsonProperty("Plot")
	public String getPlot() {
		return Plot;
	}

	/**
	 * 
	 * @param Plot
	 * The Plot
	 */
	@JsonProperty("Plot")
	public void setPlot(String Plot) {
		this.Plot = Plot;
	}

	/**
	 * 
	 * @return
	 * The Poster
	 */
	@JsonProperty("Poster")
	public String getPoster() {
		return Poster;
	}

	/**
	 * 
	 * @param Poster
	 * The Poster
	 */
	@JsonProperty("Poster")
	public void setPoster(String Poster) {
		this.Poster = Poster;
	}

	/**
	 * 
	 * @return
	 * The Rated
	 */
	@JsonProperty("Rated")
	public String getRated() {
		return Rated;
	}

	/**
	 * 
	 * @param Rated
	 * The Rated
	 */
	@JsonProperty("Rated")
	public void setRated(String Rated) {
		this.Rated = Rated;
	}

	/**
	 * 
	 * @return
	 * The Released
	 */
	@JsonProperty("Released")
	public String getReleased() {
		return Released;
	}

	/**
	 * 
	 * @param Released
	 * The Released
	 */
	@JsonProperty("Released")
	public void setReleased(String Released) {
		this.Released = Released;
	}

	/**
	 * 
	 * @return
	 * The Response
	 */
	@JsonProperty("Response")
	public String getResponse() {
		return Response;
	}

	/**
	 * 
	 * @param Response
	 * The Response
	 */
	@JsonProperty("Response")
	public void setResponse(String Response) {
		this.Response = Response;
	}

	/**
	 * 
	 * @return
	 * The Runtime
	 */
	@JsonProperty("Runtime")
	public String getRuntime() {
		return Runtime;
	}

	/**
	 * 
	 * @param Runtime
	 * The Runtime
	 */
	@JsonProperty("Runtime")
	public void setRuntime(String Runtime) {
		this.Runtime = Runtime;
	}

	/**
	 * 
	 * @return
	 * The Title
	 */
	@JsonProperty("Title")
	public String getTitle() {
		return Title;
	}

	/**
	 * 
	 * @param Title
	 * The Title
	 */
	@JsonProperty("Title")
	public void setTitle(String Title) {
		this.Title = Title;
	}

	/**
	 * 
	 * @return
	 * The Type
	 */
	@JsonProperty("Type")
	public String getType() {
		return Type;
	}

	/**
	 * 
	 * @param Type
	 * The Type
	 */
	@JsonProperty("Type")
	public void setType(String Type) {
		this.Type = Type;
	}

	/**
	 * 
	 * @return
	 * The Writer
	 */
	@JsonProperty("Writer")
	public String getWriter() {
		return Writer;
	}

	/**
	 * 
	 * @param Writer
	 * The Writer
	 */
	@JsonProperty("Writer")
	public void setWriter(String Writer) {
		this.Writer = Writer;
	}

	/**
	 * 
	 * @return
	 * The Year
	 */
	@JsonProperty("Year")
	public String getYear() {
		return Year;
	}

	/**
	 * 
	 * @param Year
	 * The Year
	 */
	@JsonProperty("Year")
	public void setYear(String Year) {
		this.Year = Year;
	}

	/**
	 * 
	 * @return
	 * The imdbID
	 */
	@JsonProperty("imdbID")
	public String getImdbID() {
		return imdbID;
	}

	/**
	 * 
	 * @param imdbID
	 * The imdbID
	 */
	@JsonProperty("imdbID")
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	/**
	 * 
	 * @return
	 * The imdbRating
	 */
	@JsonProperty("imdbRating")
	public String getImdbRating() {
		return imdbRating;
	}

	/**
	 * 
	 * @param imdbRating
	 * The imdbRating
	 */
	@JsonProperty("imdbRating")
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	/**
	 * 
	 * @return
	 * The imdbVotes
	 */
	@JsonProperty("imdbVotes")
	public String getImdbVotes() {
		return imdbVotes;
	}

	/**
	 * 
	 * @param imdbVotes
	 * The imdbVotes
	 */
	@JsonProperty("imdbVotes")
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
			sb.append(this.Actors + " | " + this.Awards+ " | " +this.Country+ " | " +this.Director+ " | " +this.Genre+ " | " +this.Language+ " | " +this.Metascore+ " | " +this.Plot+ " | " +this.Poster+ " | " +this.Rated+ " | " +this.Released+ " | " +this.Response+ " | " +this.Runtime+ " | " +this.Title+ " | " +this.Type+ " | " +this.Writer+ " | " +this.Year+ " | " +this.imdbID+ " | " +this.imdbRating+ " | " +this.imdbVotes);		
		return sb.toString();
		
	}

	public String getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(String uploadedDate) {
		this.uploadedDate = uploadedDate;
	}
	
	

}