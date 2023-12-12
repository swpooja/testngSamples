package ParallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test
  public void testone() {
	  System.out.println("Test31 in sample two");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("Test32 in sample two");
  }
  @Test
  public void testthree() {
	  System.out.println("Test33 in sample two");
  }
}
