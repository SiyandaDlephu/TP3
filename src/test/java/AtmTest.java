/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.siyanda.atmprinciple.config.AtmConfig;
import com.siyanda.atmprinciple.dip.obey.service.DipInterface;
import com.siyanda.atmprinciple.dip.violation.service.Impl.DIpVIolationImpl;
import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceAcctype;
import com.siyanda.atmprinciple.ispp.obey.service.IspInterfaceBal;
import com.siyanda.atmprinciple.ispp.violation.service.IsppServiceVIoletion;
import com.siyanda.atmprinciple.ocp.obey.service.AtmInterface;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author inathi-zenande
 */
public class AtmTest {
    
    DipInterface dip;
    DIpVIolationImpl dpv;
    IspInterfaceAcctype lsp;
    IspInterfaceBal lsv;
    AtmInterface aif;
    
    public AtmTest() {
    }

    
   @Test
    public void withDrawNewBal()
    {
        int pin = dip.withDrawNewBal(1234);
        Assert.assertEquals(0, pin);
        
    }
      
// @Test
//    public void withDrawNewBal2()
//    {
//      int acc = dpv.withDrawNewBal(1234);
//      Assert.assertEquals(0, acc);
//     } 
    
    @Test
    public void accountType()
    {
        
       Assert.assertEquals(lsp.accountType() , "savings");
    }

//    @Test
//    public void balance()
//    {
//        Assert.assertTrue(lsv.balance(0.0));
//    }
    
    @Test
    public void newAccount()
    {
        Assert.assertEquals(aif.newAccount("siyanda"), "siyanda");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        ApplicationContext c = new AnnotationConfigApplicationContext(AtmConfig.class);
        dip = (DipInterface)c.getBean("withdraw");
        dpv = (DIpVIolationImpl)c.getBean("withdraw2");
        lsp = (IspInterfaceAcctype)c.getBean("accType");
        lsv =(IspInterfaceBal)c.getBean("balanc");
        aif =(AtmInterface)c.getBean("ocp");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
