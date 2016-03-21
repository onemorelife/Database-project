package database;

import java.util.ArrayList;

public class Record 
{
    private final ArrayList<String> fieldNames;
    private ArrayList<Object> fieldValues;
    
    /**
     * The Field value has to have a matching index to the name
     * IE the object in the third position of FieldValues is the
     * value located at the third field in the result set
     * Sorting has to take place in the SQL query
     * @param fieldNames
     * @param fieldValues 
     */
    public Record(ArrayList<String> fieldNames, ArrayList<Object> fieldValues)
    {
        this.fieldNames = fieldNames;
        this.fieldValues = fieldValues;
    }
    
    public void setValAt(String value, int index)
    {
        fieldValues.remove(index);
        fieldValues.add(index, value);
    }
    
    public ArrayList<String> getFieldNames()
    {
        return fieldNames;
    }
    
    public Object getValAt(int index)
    {
        return fieldValues.get(index);
    }
}
