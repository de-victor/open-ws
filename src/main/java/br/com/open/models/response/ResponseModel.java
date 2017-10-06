package br.com.open.models.response;

public class ResponseModel {
	private Integer code;
	private String msg;
	
	public ResponseModel(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public ResponseModel() { }
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
