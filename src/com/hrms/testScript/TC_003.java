package com.hrms.testScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_003 {
	@Test(groups="sanity")
	public void tc_003()throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		g.openApp();
		g.waitExplicit("//input[starts-with(@name,'Sub')]");
		g.login();
		g.waitThread();
		g.mouseOverActionAndClick("//*[@id=\"admin\"]/a/span", "//*[@id=\"admin\"]/ul/li[4]/a/span", "//*[@id=\"admin\"]/ul/li[4]/ul/li[2]/a/span");
        g.waitImplicit();
        g.logout();
        g.closeApp();
	}
}
