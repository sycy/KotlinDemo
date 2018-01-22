package com.ybb

import com.ybb.entity.SsfwBs
import com.ybb.service.TestSSSS

object Test22 {
    @JvmStatic
    fun main(args: Array<String>) {
        val var1 = TestSSSS.selectAll()
        println(var1)
        val ssfwBs = SsfwBs(sx = "121232")
        println(ssfwBs);
    }
}