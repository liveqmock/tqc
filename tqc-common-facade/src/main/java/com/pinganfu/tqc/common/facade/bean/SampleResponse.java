/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.facade.bean;

import java.io.Serializable;

import com.pinganfu.tqc.common.facade.abs.AbstractResponse;

/**
 * @author Jing
 * @version $Id: UserInfo.java, v 0.1 2013-7-23 上午9:03:09 Jing Exp $
 */
public class SampleResponse extends AbstractResponse implements Serializable {

    private static final long serialVersionUID = -2913574120188731528L;

    public SampleResponse() {

    }

    /**
     * @param id
     * @param username
     * @param password
     * @param address
     */
    public SampleResponse(String id, String username, String password, String address) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    private String id;
    private String username;
    private String password;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
