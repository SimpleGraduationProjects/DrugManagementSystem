package com.zcurd.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysMenuBtn<M extends BaseSysMenuBtn<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setMenuId(java.lang.Integer menuId) {
		set("menu_id", menuId);
		return (M)this;
	}
	
	public java.lang.Integer getMenuId() {
		return getInt("menu_id");
	}

	public M setBtnName(java.lang.String btnName) {
		set("btn_name", btnName);
		return (M)this;
	}
	
	public java.lang.String getBtnName() {
		return getStr("btn_name");
	}

	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}
	
	public java.lang.String getClassName() {
		return getStr("class_name");
	}

	public M setMethodName(java.lang.String methodName) {
		set("method_name", methodName);
		return (M)this;
	}
	
	public java.lang.String getMethodName() {
		return getStr("method_name");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
