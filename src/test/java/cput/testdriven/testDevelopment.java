package cput.testdriven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cput.testdriven.Configuration.TDDConfig;
import cput.testdriven.Service.Impl.TDDServiceImpl;
import cput.testdriven.Service.TDDService;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Khanya
 */
public class testDevelopment {
    
    public testDevelopment() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    public static TDDService service;
    public static TDDService newService;
    @Test
    public void testInt() {       
    
    Assert.assertEquals(service.addInt(12, 3), 15);   
    }
    
    @Test
    public void testDouble()
    {
        Assert.assertEquals(service.addDouble(5.5, 3.5), 9.0);  
    }  
    @Test
    public void testTrue(){
       
        Assert.assertTrue(service.boolCheck(service.addInt(10, 5), service.addInt(10, 5)));
    } 
    @Test
    public void testFalse()
    {
        Assert.assertFalse(service.boolCheck(service.addInt(5, 5),service.addInt(5, 2)));        
    }
    @Test
    public void assertionMessages()
    {
        Assert.assertFalse(service.boolCheck(service.addInt(5, 5),service.addInt(5, 2)), "your answer doesn't give the same number");        
    }
    @Test
    public void testCompararisonsSame()
    {
        service.setName("Jacobs");
        Assert.assertSame(service.getName(), "Jacobs");
        
    }
    @Test
    public void testCompararisonsNotSame()
    {
        service.setName("Alex");
        Assert.assertNotSame(service.getName(), "Khanya");
        
    }
    @Test
    public void testNotNulls()
    {       
       service.setName("khanya");
       Assert.assertNotNull(service.getName(), "This is not null");
        
    }
    @Test
    public void testNulls()
    {       
       Assert.assertNotNull(service.getName(), "This is null");
        
    }
    @Test
    @org.junit.Test (timeout = 1)
    public void testArrays()
    {
         Assert.assertEquals(service.setArrays("Brazil", "England", "Spain"), service.setArrays("Brazil", "England", "Spain"), "Two arrays are not equal");
        
    }
    @Test
    @org.junit.Test (timeout = 1)
    public void testTimeout()
    {
        try{
            Thread.sleep(3);
        }
        catch(InterruptedException exx){}
    }
    
    @Ignore ("this test is not ready yet")
    public void testObjectComparasion()
    {
        Assert.assertEquals((TDDServiceImpl)newService, (TDDServiceImpl)service);        
    }       
    
    @Test   
    @BeforeClass
    public static void setUpClass() throws Exception {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(TDDConfig.class);
            service = (TDDService) ctx.getBean(" getService ");
                
            
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
