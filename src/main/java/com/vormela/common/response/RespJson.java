package com.vormela.common.response;

/**
 * 返回对象 json模式
 * @author Administrator
 *
 */
public class RespJson {
	/** 返回数据 */
	public Object data;

	/** 返回编码 */
	public int resultCode;

	/** 返回信息 */
	public String message;

	public RespJson() {

	}

	public RespJson(Object data, int resultCode, String message) {
		super();
		this.data = data;
		this.resultCode = resultCode;
		this.message = message;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
