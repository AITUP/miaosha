package com.xu.miaosha.queue.disruptor;

import java.io.Serializable;

/**事件对象
 * @author xu
 */
public class SeckillEvent implements Serializable {
    private long seckillId;
    private long userId;
    
    public SeckillEvent() {
        
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
