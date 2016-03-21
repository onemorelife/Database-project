
package database;

/**
 *
 * @author Badruddoza Khan
 */
public class StudioExpenses 
{
    private String studio;
    private String code;
    private double debit;
    private double credit;
    private String date; 
   
    public StudioExpenses()
    {
        this("", "", 0.0, 0.0, "");
    }
    
    public StudioExpenses(String studio, String code, double debit, double credit, String date)
    {
        this.studio = studio;
        this.code = code;
        this.debit = debit;
        this.credit = credit;
        this.date = date;
    }

    public String getStudio() 
    {
        return studio;
    }

    public void setStudio(String studio)
    {
        this.studio = studio;
    }

    public String getCode() 
    {        
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public double getDebit() 
    {
        return debit;
    }

    public void setDebit(double debit) 
    {
        this.debit = debit;
    }

    public double getCredit() 
    {
        return credit;
    }

    public void setCredit(double credit) 
    {
        this.credit = credit;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }
}
