package com.hrms.testScript;

import com.hrms.lib.General;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

public class TC_001 {
	@Test
      //public static void main(String[] args)throws Exception {
	public void tc_001()throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.openApp();
		g.verifyTitle();
		g.waitExplicit("//input[starts-with(@name,'Sub')]");
		g.login();
		g.waitThread();
		g.logout();
		g.closeApp();
	}
}
