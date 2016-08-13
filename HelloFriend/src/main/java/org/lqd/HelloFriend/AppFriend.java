package org.lqd.HelloFriend;

import org.lqd.Hello.App;

/**
 * 
* @ClassName: AppFriend
* @Description: TODO(这里用一句话描述这个类的作用)
* @author liuqidong
* @date 2016年8月12日 下午11:50:07
*
 */
public class AppFriend {
	
	public String sayHelloToFriend(String name){
		String str = new App().sayHello(name)+",I am "+this.getMyName();
		return str;
	}
    
	public String getMyName(){
		return "john";
	}
}
