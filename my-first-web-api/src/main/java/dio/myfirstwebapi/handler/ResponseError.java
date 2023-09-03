package dio.myfirstwebapi.handler;

import java.util.Date;

public class ResponseError {
	
	private Date timestamp = new Date();
	private String status = "error";
	private int statusError = 400;
	private String error;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusError() {
		return statusError;
	}
	public void setStatusError(int statusError) {
		this.statusError = statusError;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	

}
