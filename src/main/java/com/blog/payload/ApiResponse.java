package com.blog.payload;

import lombok.*;


public class ApiResponse {

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
   private String messsage;
    private boolean success;
    public ApiResponse(String messsage, boolean success) {
        this.messsage = messsage;
        this.success = success;
    }

}
