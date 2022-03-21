/**
 * @Author jinx
 * @Date 2022/3/3
 * @Desc 第一部分：基础知识，1-3章
 * 1.::方法引用语法引用具名的函数，也可以使用匿名引用（lambda函数）
 * 2.Predicate<T>：使用谓词对boolean的参数做行为参数化
 * 3.串行，并行Stream
 * 4.default:默认方法关键字
 * 5.函数式接口：只定义一个抽象方法的接口
 * 6.Predict,Function,Consumer,Supplier,Opera...:https://juejin.cn/post/6844903849753329678
 * 7.特殊的void兼容规则：如果一个Lambda的主体是一个语句表达式， 它就和一个返回void的函数描述符兼容（当
 * 然需要参数列表也兼容）。
 * 8.使用局部变量的lambda被称为捕获lambda
 * 9.构造函数引用
 * 10.排序可以使用静态方法：import static java.util.Comparator.comparing;
 * 11.当一个比较器不够时可以使用比较器链：inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getCountry))
 * 12.谓词Predict也可以用and,or,negate等连接组合更复杂的谓词
 * 13.复合函数：Function可以使用andThen,compose连接
 */
package com.feng.chapter1;