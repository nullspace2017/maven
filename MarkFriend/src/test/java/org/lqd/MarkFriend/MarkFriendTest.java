package org.lqd.MarkFriend;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MarkFriendTest{
	@Test
	public void testMakeFriend(){		
		MakeFriend makeFriend = new MakeFriend();
		String str = makeFriend.MakeFriend("wangwu");
		assertEquals("Hey,john make a friend please.",str);		

	}

}
