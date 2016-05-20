package com.qsy.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T> {

	/**
	 * 保存
	 * 
	 * @param t 保存对象
	 *            
	 */
	public void save(T t);

	/**
	 * 修改
	 * 
	 * @param t 修改的对象
	 *            
	 */
	public void update(T t);

	/**
	 * 根据主键删除对象
	 * 
	 * @param id 主键编号
	 *            
	 */
	public void delete(@Param("id")String id);

	/**
	 * 根据主键查找对象
	 * 
	 * @param id 主键
	 *            
	 * @return 查找出的对象
	 */
	public T findById(@Param("id")String id);

	/**
	 * 查找所有数据
	 * 
	 * @return 对象列表
	 */
	public List<T> findAll();

}
