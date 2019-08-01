package cn.itsource.util;

public class AjaxResult {
    private Boolean success;
    private String messager;
    private Object restobj;
    private Integer errorCode;

    public Object getRestobj() {
        return restobj;
    }
    public static AjaxResult myAjax(){
        return new AjaxResult();
    }

    public AjaxResult setRestobj(Object restobj) {
        this.restobj = restobj;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    private AjaxResult (){

    }

    public Boolean getSuccess() {
        return success;

    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessager() {
        return messager;
    }

    public AjaxResult setMessager(String messager) {
        this.messager = messager;
        return this;
    }
}
