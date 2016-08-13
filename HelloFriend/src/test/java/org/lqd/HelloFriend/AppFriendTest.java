package org.lqd.HelloFriend;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppFriendTest {
	@Test
	public void test1(){
		String str = new AppFriend().sayHelloToFriend("james");
		Assert.assertEquals(str, "hello,james,I am john");
	}
}
