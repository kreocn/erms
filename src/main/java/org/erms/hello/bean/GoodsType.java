package org.erms.hello.bean;

import java.util.Date;

import org.erms.base.BaseBean;
import org.erms.base.IPage;

public class GoodsType implements BaseBean {
	private Integer uuid;// (int) 主键
	private String type_name;// (varchar) 类型名称
	private String type_group;// (varchar) 属性分组
	private Integer status;// (int) 状态
	private String lm_user;// (varchar) 0
	private Date lm_time;// (datetime) 0
	private IPage iPage;// 分页专用

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getType_group() {
		return type_group;
	}

	public void setType_group(String type_group) {
		this.type_group = type_group;
	}

	public String getLm_user() {
		return lm_user;
	}

	public void setLm_user(String lm_user) {
		this.lm_user = lm_user;
	}

	public Date getLm_time() {
		return lm_time;
	}

	public void setLm_time(Date lm_time) {
		this.lm_time = lm_time;
	}

	public IPage getiPage() {
		return iPage;
	}

	public void setiPage(IPage iPage) {
		this.iPage = iPage;
	}

}
