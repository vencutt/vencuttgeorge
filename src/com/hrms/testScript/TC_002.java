package com.hrms.testScript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;
public class TC_002 {
    @Test
    public void tc_002()throws Exception {
    	DOMConfigurator.configure("log4j.xml");
    	General g=new General();
    	g.openApp();
    	g.login();
    	g.waitThread();
    	g.frameEnter("rightMenu");
    	g.addEmp("p", "vr");
    	g.waitThread();
    	g.back();
    	g.waitThread();
    	g.frameExit();
    	g.waitThread();
        g.logout();
    	g.closeApp();
    }
}
