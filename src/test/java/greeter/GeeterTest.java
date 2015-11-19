package greeter;

import org.junit.Assert;
import org.junit.Test;

public class GeeterTest {
	@Test
	public void isShouldSatHello(){
		Geeter geeter = new Geeter();
		Assert.assertEquals("Hello word", geeter.sayHello("word"));
	}

}
