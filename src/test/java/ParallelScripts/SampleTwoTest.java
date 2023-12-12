package ParallelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
  @Test
  public void testone() {
	  System.out.println("Test21 in sample two");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("Test22 in sample two");
  }
  @Test
  public void testthree() {
	  System.out.println("Test23 in sample two");
  }
}
