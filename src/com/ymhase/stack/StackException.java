package com.ymhase.stack;

@SuppressWarnings("serial")
public class StackException extends Exception {
    private String msg = null;

    public StackException() {
	msg = "Stack is empty.";
    }

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

}
