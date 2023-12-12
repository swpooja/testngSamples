package testScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="feature1")
  public void testone() {
	  System.out.println("Test1 in sample three");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("Test2 in sample three");
  }
  @Test
  public void testthree() {
	  System.out.println("Test3 in sample three");
  }
}
