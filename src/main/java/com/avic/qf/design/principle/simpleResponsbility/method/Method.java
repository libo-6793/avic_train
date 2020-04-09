package com.avic.qf.design.principle.simpleResponsbility.method;

/**
 * Created by LB on 2020/4/2
 */
public class Method {
    private void modifyUserInfo(String userName,String address){
        userName="Tom";
        address="HangZhou";
    }

    private void modifyUserInfo(String userName,String ... fields){

    }

    private void modifyUserInfo(String userName,String address,boolean flag){
        if(flag){

        }else{

        }
    }

    private void modifyUserName(String userName){

    }

    private void modifyAddress(String address){

    }
}
