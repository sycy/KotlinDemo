package com.ybb;

import com.ybb.entity.SsfwBs;
import com.ybb.service.TestSSSS;

public class Test {
    public static final void main(String[] args) {
        boolean var1 = TestSSSS.selectAll();
        System.out.println(var1);
        SsfwBs ssfwBs = new SsfwBs();
        ssfwBs.setSx("121232");
        System.out.println(ssfwBs.toString());
    }
}