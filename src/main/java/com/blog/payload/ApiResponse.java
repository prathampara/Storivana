package com.blog.payload;

public class ApiResponse {
    private String messsage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    private boolean success;
    public ApiResponse(String messsage, boolean success) {
        this.messsage = messsage;
        this.success = success;
    }

}
