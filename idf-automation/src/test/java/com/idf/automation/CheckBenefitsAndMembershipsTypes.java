/** 
*Copyright (c) 2015 to present Teknotrait Solutions Pvt Ltd and/or its affiliates. All rights reserved.
*/
package com.idf.automation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.idf.automation.TestBase;
import com.idf.automation.WebUIAutomation;

public class CheckBenefitsAndMembershipsTypes extends TestBase {
	
	// Checking the script has to execute or not
		@BeforeTest
		public void doIHaveToSkip() {

			if (!(WebUIAutomation.checkTestCaseRunmode(this.getClass().getSimpleName()))) {

				throw new SkipException("Runmode set to No");
				
			}
		}
		
		
		@Test
		public void testCheckProfessionalMembershipType() {
			
			// Click on [Join our community] button
			Reporter.log("Click on [Join our community] button");
			
			
			// Verifying the price in Professional tab
			Reporter.log("Verifying the price in Professional tab");
			
			// Verifying the benefits in Professional tab
			Reporter.log("Verifying the benefits in Professional tab");
			for(int i=1; i<10; i++){
				
				Assert.assertTrue(WebUIAutomation.isObjPresent("TICK_Start_PROFESSIONAL"+i+"TICK_End_PROFESSIONAL", 5), "Tick mark against the "+i+"th benefit is not displayed");
			}
				
			
			
			// Click [Join us] in Professional tab
			Reporter.log("Click [Join us] in Professional tab");
			
			// checkBenefits(String startXpath, String endXpath, String membershipType){
				
				
			}
		}
