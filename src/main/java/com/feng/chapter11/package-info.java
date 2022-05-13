/**
 * @Author jinx
 * @Date 2022/4/2
 * @Desc 第四部分高效java8编程，第十一章(*)：CompletableFuture:组合式异步编程
 * 1.CompletableFuture.supplyAsync(() -> calculatePrice(product));
 * 2.到目前为止你已经知道对集合进行并行计算有两种方式：a.使用并行流；b.要么枚举出集合中的每一个元素，在CompletableFuture内对其进行操作。在计算
 * 密集型场景下推荐使用并行流，在io密集型场景下推荐使用CompletableFuture;
 * 3.CompletableFuture.thenCompose()方法是将两个异步操作进行流水线,第二个CompletableFuture的输入是第一个CompletableFuture的输出结果;比如
 * 第一个服务获取商店商品的价格，第二个对该价格获取优惠后的价格
 * 4.CompletableFuture.thenCombine()方法则是将两个不相关的CompletableFuture联系到一起；比如，第一个服务对获取商店商店商品的价格
 * （以欧元结算，但是客户希望展示美元价格），第二个服务可以获取USD/EUR的汇率值，最后再得到美元价格(中间获取汇率是不依赖从商店中获取的价格)
 * 5.响应CompletableFuture的completion事件（尽早的将计算结果呈现给客户端）：CompletableFuture.thenAccept()
 */
package com.feng.chapter11;