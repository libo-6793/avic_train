package com.avic.qf.pattern.chain.auth.builderchain;

/**
 * Created by LiBo.
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom","666");
    }
}
