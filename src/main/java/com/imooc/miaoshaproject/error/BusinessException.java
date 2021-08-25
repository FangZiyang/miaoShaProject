package com.imooc.miaoshaproject.error;

public class BusinessException extends Exception implements CommonError{
    private CommonError commonError;
    //接受传递过来的异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }
    //自定义异常
    public BusinessException(CommonError commonError, String  ErrMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(ErrMsg);
    }
    @Override
    public int getErrorCode() {
        return 0;
    }

    @Override
    public String getErrMsg() {
        return null;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        return null;
    }
}
