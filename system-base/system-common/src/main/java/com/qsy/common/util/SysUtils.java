package com.qsy.common.util;

import java.util.UUID;

/**
 * 系统工具类，包含系统的些常用方法
* @ClassName: SysUtils 
* @author qiushenyou
* @date 2016年4月26日 下午5:51:24 
*
 */
public class SysUtils {
	private final static SysUtils SYSUTILS = new SysUtils();
	/**
	 * 私有构造
	 */
	private SysUtils(){
		
	}

	/**
	 * 获取当前对象的实例
	 * @return 对象
	 */
	public static SysUtils getInstance() {
		return SYSUTILS;
	}
	
	/**
	 * 生产32位主键
	 * @return 32位字符
	 */
	public String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}

}
