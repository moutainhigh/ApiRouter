package com.sum.apirouter.api.impl;

import com.sum.apirouter.api.InterA;
import com.sum.router.annotation.ApiRouter;

/**
 * Created by sdl on 2019-05-22.
 */
@ApiRouter("/m5119/A1")
public class ImplA1 implements InterA {
    @Override
    public void fun1() {
        System.out.println("ImplA1 fun1 "+this.getClass().getSimpleName() +" ,"+this.toString());
    }

    @Override
    public String read() {
        return "ImplA1 read";
    }
}
