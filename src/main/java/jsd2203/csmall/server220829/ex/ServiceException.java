package jsd2203.csmall.server220829.ex;
/**
 * 自定义异常,用于封装异常信息返回给客户端
 * */

public class ServiceException extends RuntimeException{
    private Integer serviceCode;
    public ServiceException(Integer serviceCode,String message){
        super(message);
        this.serviceCode=serviceCode;
    }
    public Integer getServiceCode(){
        return serviceCode;
    }

}
