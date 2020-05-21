package com.avic.qf.pattern.chain.auth.optimiaze;


import com.avic.qf.pattern.chain.auth.Member;

/**
 * Created by LiBo.
 */
public abstract class Handler {
    protected Handler next;
    public void next(Handler next){ this.next = next;}

    public abstract void doHandler(Member member);
}
