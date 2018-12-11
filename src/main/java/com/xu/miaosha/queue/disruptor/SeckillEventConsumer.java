package com.xu.miaosha.queue.disruptor;


import com.lmax.disruptor.EventHandler;

/**消费者（秒杀处理器）
 * @author xu
 */
public class SeckillEventConsumer implements EventHandler<SeckillEvent> {

    @Override
    public void onEvent(SeckillEvent seckillEvent, long l, boolean b) throws Exception {

    }
}
