package org.lqd.Hello;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void test1(){
		String name = new App().sayHello("james");
		Assert.assertEquals(name, "hello,james");
	}
}
