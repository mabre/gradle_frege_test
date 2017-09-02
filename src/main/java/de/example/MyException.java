package de.example;

import de.example.MyError;

public class MyException extends Exception {
    MyError.TMyError myError;
    public MyException(MyError.TMyError err) {
        super("MyException: " +  MyError.IShow_MyError.show(err));
        myError = err;
    }
    public MyError.TMyError getMyError() {
        return myError;
    }
}
