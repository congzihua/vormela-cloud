package com.vormela.common.constant;

public enum ReturnCodesEnum {
	QUERY_SUCESS(200,"查询成功"),ADD_SUCESS(200,"新增成功"),UP_SUCESS(200,"修改成功"),DEL_SUCESS(200,"删除数据成功"),
	QUERY_FAIL(201,"查询失败"),ADD_FAIL(202,"新增失败"),UP_FAIL(203,"修改失败"),DEL_FAIL(204,"删除数据失败"),
	ILLEGAL_PARMS (503,"参数解析异常"),	SERVICE_BUSSINESS(500,"系统繁忙,请稍后再试"),
	NO_AUTH_REQ_SER(403,"用户没有该服务的权限或已过期");
	private int code;
	private String msg;
	ReturnCodesEnum(int code,String msg){
		this.code = code;
		this.msg = msg;
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
}
