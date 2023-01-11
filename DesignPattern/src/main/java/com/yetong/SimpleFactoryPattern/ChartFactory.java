package com.yetong.SimpleFactoryPattern;

/**
 * 简单工厂模式实现了对象的创建和使用分离，但是仍然存在如下两个问题：
 *
 *        (1) 工厂类过于庞大，包含了大量的if…else…代码，导致维护和测试难度增大；
 *
 *        (2) 系统扩展不灵活，如果增加新类型的日志记录器，必须修改静态工厂方法的业务逻辑，违反了“开闭原则”。
 * ————————————————
 *
 */
public class ChartFactory {

    public static Chart getChart(Class<?> chart) throws InstantiationException, IllegalAccessException {
        if (chart.isInterface()) {
            throw new RuntimeException("不是可以绘制的图形");
        }
        Object o = chart.newInstance();
        if (!(o instanceof Chart)) {
            throw new RuntimeException("不是可以绘制的图形");
        }
        return (Chart) o;
    }

}
