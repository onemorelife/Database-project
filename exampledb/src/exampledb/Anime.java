package exampledb;

/**
 *
 * @author Badruddoza Khan
 */
public class Anime 
{
    private String series;
    private String code;
    private String date; //unsure what the java equivalent of sql date type is
    private int episodes;
    private String demographic;
    
    public Anime()
    {
        this("", "", "", 0, "");
    }

    public Anime(String series, String code, String date, int episodes, String demographic)
    {
        this.series = series; 
        this.code = code;
        this.date = date;
        this.episodes = episodes;
        this.demographic = demographic;
    }

    public String getSeries() 
    {
        return series;
    }

    public void setSeries(String series) 
    {
        this.series = series;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public int getEpisodes() 
    {
        return episodes;
    }

    public void setEpisodes(int episodes) 
    {
        this.episodes = episodes;
    }

    public String getDemographic() 
    {
        return demographic;
    }

    public void setDemographic(String demographic) 
    {
        this.demographic = demographic;
    }
}

