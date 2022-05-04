package com.example.taserfan;

public class LoggedInUserRepository {

    private static  LoggedInUserRepository loggedInUserRepository;
    private static Empleado empleado;

    private LoggedInUserRepository(){
    }

    public static LoggedInUserRepository getInstance(){
        if(loggedInUserRepository==null)
            loggedInUserRepository= new LoggedInUserRepository();
        return loggedInUserRepository;
    }
    public void login(Empleado empleado){
        LoggedInUserRepository.empleado = empleado;
    }
    public Empleado getLoggedInUser(){
        return empleado;
    }
    public void logout(){
        empleado=null;
    }

}
