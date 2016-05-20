package com.qsy.common.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
public class MyBeanUtils {
	
	/**
	 * 对象复制
	 * @param src 源对象
	 * @param cls 目标类型
	 * @return 目标对象
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	public static <T> T copyProperties(Object src,Class<T> cls) throws IllegalAccessException, InvocationTargetException, InstantiationException{
		T target = cls.newInstance();
		BeanUtils.copyProperties(src,target);
		return target;
	}
	
	/**
	 * list集合复制
	 * @param srcs 源集合
	 * @param cls 目标集合类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	public static <T> List<T> copyList(List<?> srcs,Class<T> cls) throws IllegalAccessException, InvocationTargetException, InstantiationException{
		List<T> target = null;
		for(Object o:srcs){
			if(target == null){
				target = new ArrayList<T>();
			}
			target.add(copyProperties(o,cls));
		}
		return target;
	}

}