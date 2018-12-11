package com.xu.miaosha.queue.disruptor;

import com.lmax.disruptor.EventTranslatorVararg;
import com.lmax.disruptor.RingBuffer;

/**使用translator方式生产者
 * @author xu
 */
public class SeckillEventProducer {

    private final static EventTranslatorVararg<SeckillEvent> translator = new EventTranslatorVararg<SeckillEvent>() {
        @Override
        public void translateTo(SeckillEvent seckillEvent, long l, Object... objects) {
            seckillEvent.setSeckillId((Long) objects[0]);
            seckillEvent.setUserId((Long) objects[1]);
        }
    };

    private final RingBuffer<SeckillEvent> ringBuffer;

    public SeckillEventProducer(RingBuffer<SeckillEvent> ringBuffer)  {
        this.ringBuffer = ringBuffer;
    }

    public void seckill(long seckillId, long userId) {
        this.ringBuffer.publishEvent(translator ,seckillId,userId);
    }

}
