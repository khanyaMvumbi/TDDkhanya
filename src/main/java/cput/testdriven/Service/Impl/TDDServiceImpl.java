/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.testdriven.Service.Impl;

import cput.testdriven.Service.TDDService;
/**
 *
 * @author Khanya
 */
public class TDDServiceImpl implements TDDService{
    String name;
    
    public TDDServiceImpl()
    {
        
    }
    
    @Override
    public int addInt(int a, int b)
    {               
        return a + b;            
    }
    @Override
    public double addDouble(double a, double b)
    {        
        return a + b;
    }

    @Override
    public boolean boolCheck(int a, int b) {
       return a == b;
    }
    @Override
    public void setName(String nam)
    {
        name = nam;
    }

    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public String[] setArrays(String a, String b, String c)
    {
        String [] countryNames = new String[] {a,b,c};
        
        return countryNames;
        
    }
    
}
