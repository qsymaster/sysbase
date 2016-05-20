package com.qsy.common.po;

public class SysStatePo extends BasePo {
	private static final long serialVersionUID = -5714198837295343714L;
	private String stateName;// 状态名
	private String groupName;// 组名
	private String description;// 描述
	private Integer sortNum;// 排序

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

}
