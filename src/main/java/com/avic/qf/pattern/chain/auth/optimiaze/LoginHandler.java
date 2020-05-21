package com.avic.qf.pattern.chain.auth.optimiaze;


import com.avic.qf.pattern.chain.auth.Member;

/**
 * Created by LiBo.
 */
public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
