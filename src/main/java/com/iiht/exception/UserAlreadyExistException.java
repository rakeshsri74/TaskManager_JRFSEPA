package com.iiht.exception;

@SuppressWarnings("serial")
public class UserAlreadyExistException extends RuntimeException {
public static  String message="user already exists !..please login";


public UserAlreadyExistException()
{
	
}
@SuppressWarnings("static-access")
public UserAlreadyExistException(String message)
{
	this.message=message;
}
}
