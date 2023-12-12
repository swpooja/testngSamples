package ParallelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void testone() {
	  System.out.println("Test11 in sample two");
  }
  @Test(groups="feature2")
  public void testtwo() {
	  System.out.println("Test12 in sample two");
  }
  @Test
  public void testthree() {
	  System.out.println("Test13 in sample two");
  }
}
