package com.daymooc.fcms.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePostType<M extends BasePostType<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setPostType(java.lang.String postType) {
		set("post_type", postType);
	}

	public java.lang.String getPostType() {
		return get("post_type");
	}

}