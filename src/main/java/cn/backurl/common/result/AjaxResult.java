package cn.backurl.common.result;

/**
 * ajax数据结构
 *
 * @author akid
 * <p>
 * 2018年2月1日
 */
public class AjaxResult {

    /**
     * 状态码
     */
    private int code = ResultCode.SUCCESS.getCode();

    /**
     * 请求返回信息
     */
    private String msg = ResultCode.SUCCESS.getMsg();

    /**
     * 请求结果
     */
    private Object data = null;

    /**
     * Instantiates a new Ajax result.
     */
    private AjaxResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * <p>
     * 功能描述: 执行成功
     * </p>
     *
     * @param
     * @Author: akid
     * @Date: 2019-04-20 22:16
     * @Return: AjaxResult
     */
    public static AjaxResult success() {
        return success(null);
    }

    /**
     * <p>
     * 功能描述: 执行成功
     * </p>
     *
     * @param
     * @Author: akid
     * @Date: 2019-04-20 22:16
     * @Return: AjaxResult
     */
    public static AjaxResult success(Object data) {
        return success(ResultCode.SUCCESS.getMsg(), data);
    }

    /**
     * <p>
     * 功能描述: 执行成功
     * </p>
     *
     * @param
     * @Author: akid
     * @Date: 2019-04-20 22:16
     * @Return: AjaxResult
     */
    public static AjaxResult success(String msg, Object data) {
        AjaxResult result = new AjaxResult();
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 获取错误结果模板
     *
     * @return AjaxResult
     */
    public static AjaxResult failure() {
        return failure(ResultCode.FAILURE);
    }

    /**
     * 获取错误结果模板
     *
     * @return AjaxResult
     */
    public static AjaxResult failure(ResultCode resultCode) {
        return failure(resultCode, resultCode.getMsg());
    }

    /**
     * 获取错误结果模板
     *
     * @param msg 请求返回信息
     * @return AjaxResult
     */
    public static AjaxResult failure(ResultCode code, String msg) {
        AjaxResult result = new AjaxResult();
        result.setCode(code.getCode());
        result.setMsg(msg);
        return result;
    }

    /**
     * 获取错误结果模板
     *
     * @param msg 请求返回信息
     * @param data     请求结果
     * @return AjaxResult
     */
    public static AjaxResult failure(ResultCode code, String msg, Object data) {
        AjaxResult result = new AjaxResult();
        result.setCode(code.getCode());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    @Override
    public String toString() {
        return "AjaxResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }
}
