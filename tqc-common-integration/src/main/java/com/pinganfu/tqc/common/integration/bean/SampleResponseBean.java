/**
 * 
 *  平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.bean;

import com.pinganfu.tqc.common.integration.abs.AbstractResponseClient;

/**
 * 
 * @author Jing
 * @version $Id: StringClient.java, v 0.1 2013年8月7日 下午8:34:42 Jing Exp $
 */
public class SampleResponseBean extends AbstractResponseClient {

    private static final long serialVersionUID = 5618858974055696705L;
    private String id;
    private String username;
    private String password;
    private String address;

    public SampleResponseBean() {
    }

    public SampleResponseBean(String id, String username, String password, String address) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }
    
    

}
