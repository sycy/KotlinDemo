package com.ybb.controller;

import com.ybb.annotation.UserAnnotation;
import com.ybb.dao.SsfwBsDao;
import com.ybb.entity.SsfwBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;

@Controller
public class ThymeleafController {
    @Autowired
    private SsfwBsDao dao;

    @UserAnnotation(desc = "index getMapping",name = "index")
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("author","author");
        model.addAttribute("title","title");
        model.addAttribute("url","url");
        model.addAttribute("now",Date.valueOf(LocalDate.now()));
        model.addAttribute("html","his is an &lt;em&gt;HTML&lt;/em&gt; text. &lt;b&gt;Enjoy yourself!&lt;/b&gt;");
        model.addAttribute("num",100001);

        Sort sort = new Sort(Sort.Direction.DESC, "cjsj");
        PageRequest page = new PageRequest(1, 10, sort);
        Page<SsfwBs> ssfwBsPage = dao.findAll(page);
        model.addAttribute("ssfwBsList",ssfwBsPage.getContent());
        return "index";
    }

    @GetMapping("/1")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("author","author");
        modelAndView.addObject("title","title");
        modelAndView.addObject("url","url");
        modelAndView.addObject("now",Date.valueOf(LocalDate.now()));
        modelAndView.addObject("html","his is an &lt;em&gt;HTML&lt;/em&gt; text. &lt;b&gt;Enjoy yourself!&lt;/b&gt;");
        modelAndView.addObject("num",100001);
        Sort sort = new Sort(Sort.Direction.DESC, "cjsj");
        PageRequest page = new PageRequest(1, 10, sort);
        Page<SsfwBs> ssfwBsPage = dao.findAll(page);
        modelAndView.addObject("ssfwBsList",ssfwBsPage.getContent());
        return modelAndView;
    }
}
