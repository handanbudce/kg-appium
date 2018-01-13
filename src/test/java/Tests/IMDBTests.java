package Tests;


import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.SearchList;

public class IMDBTests extends BaseTest{
	
   
    
    
    @Test
  public void login(){
		 new LoginPage(driver).signInWithIMDB();
	    
         
		
	}
	@Test 
	public void searchText(){
		
		new SearchList(driver).search();
		
		
		
	}

}