/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;

/**
 *
 * @author atkachenko893
 */
public class Table 
{
    private final String name;
    private ArrayList<Record> records;
    
    public Table(String name, ArrayList<Record> records)
    {
        this.name = name;
        this.records = records;
    }
    
    public String getTableName()
    {
        return name;
    }
    
    public Record getRecordAt(int index)
    {
        return records.get(index);
    }
    
    public void addRecord(Record r)
    {
        records.add(r);
    }
    
    public void addRecord(Record r, int index)
    {
        records.add(index, r);
    }
}
