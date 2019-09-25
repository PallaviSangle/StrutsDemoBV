package com.bv.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;



	public class CustomInterceptor implements Interceptor {
	
		@Override
		public void destroy() {
			System.out.println("Custom Interceptor1 destroyed");
	
		}
	
		@Override
		public void init() {
			System.out.println("Custom Interceptor1 intialized");
	
		}
	
		@Override
		public String intercept(ActionInvocation ai) throws Exception {
			System.out.println("Pre processing1");
			String result = ai.invoke();
			System.out.println("Post preprocessing1");
			return result;
		}

		
	
	}



