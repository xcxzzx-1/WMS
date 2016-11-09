package com.ken.wms.dao;

import java.util.List;

import com.ken.wms.domain.Supplier;

/**
 * Supplier 映射器
 * @author Ken
 *
 */
public interface SupplierMapper {

	/**
	 * 选择全部的 Supplier
	 * @return
	 */
	public List<Supplier> selectAll();
	
	/**
	 * 选择指定 id 的 Supplier
	 * @param id 供应商ID
	 * @return
	 */
	public Supplier selectById(Integer id);
	
	/**
	 * 选择指定 supplier name 的 Supplier
	 * @param supplierName 供应商名称
	 * @return
	 */
	public Supplier selectBuName(String supplierName);
	
	/**
	 * 选择指定 supplier name 的 Supplier
	 * 与 selectBuName 方法的区别在于本方法将返回相似匹配的结果
	 * @param supplierName 供应商名
	 * @return
	 */
	public List<Supplier> selectApproximateByName(String supplierName);
	
	/**
	 * 插入 Supplier 到数据库中
	 * 不需要指定 Supplier 的主键，采用的数据库 AI 方式
	 * @param supplier Supplier 实例
	 */
	public void insert(Supplier supplier);
	
	/**
	 * 批量插入 Supplier 到数据库中
	 * @param suppliers 存放 Supplier 实例的 Lists
	 */
	public void insertBatch(List<Supplier> suppliers);
	
	/**
	 * 更新 Supplier 到数据库
	 * 该 Supplier 必须已经存在于数据库中，即已经分配主键，否则将更新失败
	 * @param supplier Supplier 实例
	 */
	public void update(Supplier supplier);
	
	/**
	 * 删除指定 id 的Supplier
	 * @param id 供应商ID
	 */
	public void deleteById(Integer id);
	
	/**
	 * 删除指定 supplierName 的 Supplier
	 * @param supplierName 供应商名称
	 */
	public void deleteByName(String supplierName);
	
}