package com.keylime.exception;

public class DuplicateException extends Exception{

	  public DuplicateException() {
		  super("저장된 회원이 있습니다");
	  }
	
}
