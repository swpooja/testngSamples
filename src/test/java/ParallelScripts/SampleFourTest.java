package ParallelScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
  @Test
  public void testone() {
	  System.out.println("Test41 in sample two");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("Test42 in sample two");
  }
  @Test
  public void testthree() {
	  System.out.println("Test43 in sample two");
  }
}
