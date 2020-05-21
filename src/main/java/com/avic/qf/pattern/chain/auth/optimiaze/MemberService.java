package com.avic.qf.pattern.chain.auth.optimiaze;


import com.avic.qf.pattern.chain.auth.Member;
import org.apache.commons.lang.StringUtils;

/**
 * Created by LiBo.
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName,loginPass));

    }

}
