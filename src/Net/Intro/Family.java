/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Net.Intro;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Administrator
 */
public class Family extends ArrayList<Person> {
    
    public static final int MAX_LOVE = 100;

    
    public Family(Collection<Person> people) 
    {
        super(people);
    }
    
    public Family()
    {
        super();
    }
    
    public static void addMember(String familyName, Person person) throws Exception
    {
        if(familyName != person.getLastName())
        {
            throw new Exception("Unhandle family member check the last name.");
        }
        
        HelloJava.Country.add(person);
    }
    
    float getLoveDegrees()
    {
        int count = this.size();
        
        float totalRecord = 0;
        
        for(int i = 0; i < count; i++)
        {
            Person person = this.get(i);
            
            float behaviorAvg = (MAX_LOVE / person._Love);
            
            totalRecord += behaviorAvg;
        }
        
        return totalRecord;
    }
    
    public String getFamilyName()
    {
        try
        {
            return this.get(0).getLastName();
        }
        catch(Exception ex)
        {
            //OutofRangeException 
            return null;
        }
    }
    
    
}
