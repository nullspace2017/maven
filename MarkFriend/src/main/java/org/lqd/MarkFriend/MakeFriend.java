package org.lqd.MarkFriend;

import org.lqd.HelloFriend.AppFriend;

/**
 * Hello world!
 *
 */
public class MakeFriend 
{
	public String MakeFriend(String name){
		
		AppFriend friend = new AppFriend();
		friend.sayHelloToFriend("wangwu");	
		String str = "Hey,"+friend.getMyName()+" make a friend please.";
		System.out.println(str);
		return str;
	}

}
