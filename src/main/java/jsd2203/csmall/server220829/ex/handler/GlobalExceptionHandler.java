package jsd2203.csmall.server220829.ex.handler;
/**
 * 当controller层抛出异常时
 * 会自动调用统一异常处理机制,
 * 如果没有则会报500错误
 * 当重写时应该
 * 调用jsonresult对象的失败方法返回给客户端
 * */
@RestControllerAdvice
public class GlobalExceptionHandler {

}
