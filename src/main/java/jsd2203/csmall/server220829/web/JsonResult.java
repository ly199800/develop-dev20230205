package jsd2203.csmall.server220829.web;
/**
 * 用于封装服务器端向客户端响应结果的类型
 * 此对象包含业务状态吗,错误时消息.
 * 处理成功时需要响应到客户端的数据
 *
 * */
public final class JsonResult {
    /**
     * 业务状态吗
     * **/
    private Integer code;
    /**
     * 错误时消息
     * */
    private String message;
    /***
     * 处理成功时,需要响应到客户端的数据
     * */
    private Object data;
    //成功时方法
    public static JsonResult ok(){
        return ok(null);
    }

    public static JsonResult ok(Object data) {
        //创建jsonsult对象,
        JsonResult jsonResult = new JsonResult();
        //调用常量业务代码存入当前属性
        jsonResult.code=ServiceCode.OK;
        //将外部传来的数据存入当前对象属性
        jsonResult.data = data;
        return jsonResult;
    }
    //失败时方法,失败时应该将自定义异常信息返回给客户端
    public static JsonResult fail(){
        return new JsonResult();
    };

}
