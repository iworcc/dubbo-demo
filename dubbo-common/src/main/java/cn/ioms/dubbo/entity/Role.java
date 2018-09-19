package cn.ioms.dubbo.entity;

import java.util.Date;

public class Role {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String flag;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Role [id=" + id + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", flag=" + flag
				+ ", name=" + name + "]";
	}
    
}