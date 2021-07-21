package com.ahbin.test;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Inherited;
import java.util.Date;


/**
 * 自定义的Annotation。
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Inheritable {
}

@Inheritable
class InheritableFather {
    @Inheritable
    public String a;

    public InheritableFather() throws NoSuchFieldException {
        // InheritableBase是否具有 Inheritable Annotation
        System.out.println("InheritableFather:" + InheritableFather.class.isAnnotationPresent(Inheritable.class));
        System.out.println("InheritableFather:" + InheritableFather.class.getField("a").isAnnotationPresent(Inheritable.class));
    }
}

/**
 * InheritableSon 类只是继承于 InheritableFather，
 */
public class demo extends InheritableFather {
    public String a;

    public demo() throws NoSuchFieldException {
        super();    // 调用父类的构造函数
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:" + demo.class.isAnnotationPresent(Inheritable.class));
        System.out.println("InheritableSon:" + demo.class.getField("a").isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args) throws NoSuchFieldException {
        demo is = new demo();
        Date date = new Date(113, 8, 26);
    }
}