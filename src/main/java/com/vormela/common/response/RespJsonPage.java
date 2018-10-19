package com.vormela.common.response;

/**
 * 返回分页对象
 * @author Administrator
 *
 */
public class RespJsonPage {

	/** 返回对象 */
	public Object data;

	/** 返回编码 */
	public int resultCode;

	/** 返回总条数 */
	public int total;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public RespJsonPage(Object data, int resultCode, int total) {
		this.data = data;
		this.resultCode = resultCode;
		this.total = total;
	}

	public RespJsonPage() {

	}
}
