package com.ybb.controller

import com.ybb.dao.SsfwBsDao
import com.ybb.entity.SsfwBs
import com.ybb.entity.SsfwBsExtend
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class SsfwBsController @Autowired constructor(private val dao: SsfwBsDao){

    @RequestMapping("/findall")
    fun findAll() = dao.findAll()

    @RequestMapping("/all")
    open fun findAllPage(): Page<SsfwBs>{
        val sort = Sort(Sort.Direction.DESC,"cjsj")
        val page = PageRequest(1,10,sort)
        return dao.findAll(page)
    }

    open @RequestMapping("/all/{pageNumber}")
    fun findAllPageNumber(@PathVariable pageNumber:Int): Page<SsfwBs>{
        val sort = Sort(Sort.Direction.DESC,"cjsj")
        val page = PageRequest(pageNumber,10,sort)
        return dao.findAll(page)
    }

    open @RequestMapping("/devtools")
    fun devtools()="devtools 【idea:Ctrl+F9】 ? v1.0"

    @RequestMapping("/{uuid}")
    open fun findByUUID(@PathVariable uuid: String) = dao.findOne(uuid)

    @RequestMapping("/sx/{sx}")
    open fun findBySx(@PathVariable sx: String):List<SsfwBsExtend>{
        return dao.queryBySx(sx)
    }

    @RequestMapping("/example")
    open fun findByExample():List<SsfwBs>?{
        //TODO 返回类型
        val bs = SsfwBs(sx="BCSSZYFWXYBGZZ",nsrsbh = "91340100591437924L")
        val example = Example.of(bs)
        return dao.findAll(example)
    }

    @RequestMapping("/test")
    open fun test():String{
        return "123"
    }
}
