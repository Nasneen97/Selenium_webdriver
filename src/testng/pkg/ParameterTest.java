package testng.pkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters({"v"})
	
	@Test
	public void main(String vi) {
		System.out.println("Value is : "+vi);
	}

}
