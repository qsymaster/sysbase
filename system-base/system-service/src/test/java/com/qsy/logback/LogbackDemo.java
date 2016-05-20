package com.qsy.logback;

import org.junit.Test;

import com.qsy.common.util.LogUtils;

public class LogbackDemo {
	public LogbackDemo() {
		
	}
	
	@Test
	public void test(){
		LogUtils.debug("==============debug");
		LogUtils.info("==============info");
		LogUtils.warn("==============warn");
		LogUtils.error("==============error");
		LogUtils.trace("==============trace");
	}

}
