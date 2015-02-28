/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.common.integration.jms;

import java.io.Serializable;

/**
 * 
 * @author mingmingyang
 * @version $Id: SendMessage.java, v 0.1 2013-7-23 下午12:46:31 mingmingyang Exp $
 */
public interface SendMessage {

    public static final String QUEUE_DEST_NAME = "q_tqc_sample";
    public static final String TOPIC_DEST_NAME = "t_tqc_sample";

    public void sendTopic(Serializable msg);

    public void sendQueue(Serializable msg);

}
