package com.qsy.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
* 
* @ClassName: LogUtils
* @Description: 日志工具类
* @author qiushenyou
* @date 2016年4月21日 下午1:34:40
*
*/
public class LogUtils {
	private static final Logger	logger	= LoggerFactory.getLogger(LogUtils.class);
	
	private LogUtils(){}
	
	public static Logger getInstance(){
		return logger;
	}
	
	public static void trace(String arg){
		logger.trace(arg);
	}
	
	public static void trace(String arg0,Throwable arg1){
		logger.trace(arg0, arg1);
	}
	
	public static void debug(String arg){
		logger.debug(arg);
	}
	
	public static void debug(String arg0,Throwable arg1){
		logger.debug(arg0, arg1);
	}
	
	public static void info(String arg){
		logger.info(arg);
	}
	
	public static void info(String arg0,Throwable arg1){
		logger.info(arg0, arg1);
	}
	
	public static void warn(String arg){
		logger.warn(arg);
	}
	
	public static void warn(String arg0,Throwable arg1){
		logger.warn(arg0, arg1);
	}
	
	public static void error(String arg){
		logger.error(arg);
	}
	
	public static void error(String arg0,Throwable arg1){
		logger.error(arg0, arg1);
	}

}
