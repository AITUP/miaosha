package com.xu.miaosha.queue.disruptor;

import com.lmax.disruptor.EventFactory;

/**事件生产工厂（用于初始化预分配时间对象）
 * @author xu
 */
public class SeckillEventFactory implements EventFactory<SeckillEvent> {
    @Override
    public SeckillEvent newInstance() {
        return new SeckillEvent();
    }
}
