package test.common.model.api;

/**
 * Created by Administrator on 2019/1/20.
 */
public class ApiResp<T> {
    private int success;

    private String code;
    private String msg;

    private T data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResp() {
    }

    @Override
    public String toString() {
        return "ApiResp{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public ApiResp(int success, String code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T>ApiResp<T> buildSuccess(T t){
        return new ApiResp<>(1,"","请求成功",t);
    }

    public static <T>ApiResp<T> buildFail(String message,String code){
        return new ApiResp<>(0,code,message,null);
    }
    public static <T>ApiResp<T> buildFail(String message){
        return new ApiResp<>(0,"",message,null);
    }
}
