package com.yetong.ListenerPattern;

import java.util.ArrayList;
import java.util.List;


/**
 * 事件源 发布事件
 */
public class MethodExeuctionEventPublisher {
    private List<MethodExecutionEventListener> listeners = new ArrayList();

    public void methodToMonitor() {
        MethodExecutionEvent event2Publish = new MethodExecutionEvent(this, "methodToMonitor");
        publishEvent("BEGIN", event2Publish);
// 执行实际的方法逻辑
        System.out.println("执行方法逻辑。。。。");
// ...
        publishEvent("END", event2Publish);
    }

    protected void publishEvent(String status, MethodExecutionEvent methodExecutionEvent) {
        List<MethodExecutionEventListener> copyListeners = new ArrayList(listeners);
        for (MethodExecutionEventListener listener : copyListeners) {
            if ("BEGIN".equals(status))
                listener.onMethodBegin(methodExecutionEvent);
            else
                listener.onMethodEnd(methodExecutionEvent);
        }
    }

    public void addMethodExecutionEventListener(MethodExecutionEventListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(MethodExecutionEventListener listener) {
        if (this.listeners.contains(listener))
            this.listeners.remove(listener);
    }

    public void removeAllListeners() {
        this.listeners.clear();
    }

    public static void main(String[] args) {
        MethodExeuctionEventPublisher eventPublisher =
                new MethodExeuctionEventPublisher();
        eventPublisher.addMethodExecutionEventListener(new
                SimpleMethodExecutionEventListener());
        eventPublisher.methodToMonitor();
    }
}