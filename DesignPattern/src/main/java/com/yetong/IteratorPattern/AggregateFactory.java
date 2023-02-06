package com.yetong.IteratorPattern;

/**
 * 抽象聚合类工厂用于
 * 用于存储和管理元素对象，声明一个createIterator()方法用于创建一个迭代器对象，充当抽象迭代器工厂角色。
 */
public interface AggregateFactory {

    Iterator createIterator();
}
