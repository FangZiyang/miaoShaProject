package com.imooc.miaoshaproject.error;

//包装器业务异常类实现
public class BusinessException extends Exception implements CommonError {
    private CommonError commonError;

    //接受传递过来的异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    //自定义异常
    public BusinessException(CommonError commonError, String ErrMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(ErrMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }

    public CommonError getCommonError() {
        return commonError;
    }
}
