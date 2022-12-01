import org.testng.annotations.Test;

public class TestNG_GroupDemo {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("this is red1");
  }
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("this is red2");
  }
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("this is red3");
  }
  
  
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("this is green1");
  }
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("this is green2");
  }
  @Test(groups = {"red","green"})
  public void green3() {
	  System.out.println("this is red_green3");
  }
}
