package com.multi.datasource.domain.mysql.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @author wgc
 */
public class SysUserInfo implements Serializable{

	private static final long serialVersionUID = 8096767137845964189L;
	/**
	 * 用户id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
    private String username;
    /**
     * 密码, 序列化时忽略
     */
    @JsonIgnore
    private String password;

    private String phone;

    private String email;

    private Date createTime;

    @Override
    public String toString() {
        return "SysUserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private boolean status;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
