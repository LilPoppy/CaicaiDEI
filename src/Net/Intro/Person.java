/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Net.Intro;

/**
 *
 * @author Administrator
 */
public class Person {
    private String _FirstName;
    private String _LastName;
    private int _Age;
    
    protected float _Love;
    
    public Person(String firstName, String lastName, int age)
    {
        _FirstName = firstName;
        _LastName = lastName;
        _Age = age;
    }
    
    public void updataLove(float love)
    {
        _Love = love;
    }
    
    public String getFirstName()
    {
        return this._FirstName;
    }
    
    public String getLastName()
    {
        return this._LastName;
    }
    
    public Family getFamily()
    {
        Family family = new Family();
        
        for(Person person : HelloJava.Country)
        {
            if(person._LastName == this._LastName)
            {
                family.add(person);
            }
        }
        
        return family;
    }
}
