package com.yetong.CompositePattern;

/**
 * 叶子构件 只能执行业务方法 无法执行管理构件的操作方法
 */
public class Leaf implements Component{
    @Override
    public void add(Component c) {
        System.out.println("叶子构建无法添加");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子构建无法删除");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("叶子构建无法获取");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子构建业务方法");
    }
}
