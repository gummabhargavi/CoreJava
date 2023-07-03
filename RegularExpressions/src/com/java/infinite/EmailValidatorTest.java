package com.java.infinite;

public class EmailValidatorTest {
	
	private EmailValidator ev;
	
	@BeforeClass
	public void initData()
	{
		ev=new EmailValidator();
	}
	
	@DataProvider
	public Object[][] ValidEmailProvider(){
		return new Object[][] {{ new String[]{"infinite@gmail.com",
				"bhargavi123@gmail.c","vijay.100@yahoo.com"
		}}};
	}
		
	@DataProvider 
	public Object[][] InvalidEmailProvider(){
		return new Object[][] {{ new String[]{"infinitegmail.com",
				"bhargavi-123@gmail.com","vijay..100@yahoo.com"
		}}};
		
	}
	@Test(dataProvider="ValidEmailProvider", dependsOnMethods = "")
	public void ValidEmailTest(String[] Email){
		for (String temp : Email) {
			boolean valid =ev.validate(temp);
			System.out.println("Email is valid :"+temp+" , "+valid);
			Assert.assertEquals(valid,true);
		}
			
		}
		@Test(dataProvider="InvalidEmailProvider",dependsOnMethods="ValidEmailTest")
		public void InvalidEmailTest(String[] Email){
			for (String string : Email) {
				boolean valid =ev.validate(string);
				System.out.println("Email is valid :"+string+" , "+valid);
				Assert.assertEquals(valid,false);
				
	}
		
	}
	}
