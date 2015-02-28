/**
 * 
 *	平安付
 * Copyright (c) 2013-2013 PingAnFu,Inc.All Rights Reserved.
 */
package com.pinganfu.tqc.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pinganfu.common.pagination.Page;
import com.pinganfu.common.pagination.PaginationBean;
import com.pinganfu.tqc.biz.UserBiz;
import com.pinganfu.tqc.common.dal.model.UserDO;
import com.pinganfu.tqc.service.model.User;
import com.pinganfu.web.controller.BaseController;

/**
 * 
 * @author Jing
 * @version $Id: DemoController.java, v 0.1 2013-7-23 上午9:12:00 Jing Exp $
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @Autowired
    private UserBiz userBiz;

    /**
     * 显示首页
     * 
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        LOG.info("index");
        return "/demo/index";
    }

    /**
     * 显示DataGrid页
     * 
     * @return
     */
    @RequestMapping(value = "/dataGrid", method = RequestMethod.GET)
    public String dataGrid() {

        return "/demo/dataGrid";
    }

    /**
     * 获取列表数据
     * 
     * @param model
     * @param currPage
     * @param maxCount
     * @param pageSize
     * @param searchBox
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> list(ModelMap model, Page page, User user) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        //List<User> users = userBiz.getUserList(user, page);
        PaginationBean<User> pageinatine=userBiz.getUserList(user, page);
        resultMap.put("list", pageinatine.getPageList());
        resultMap.put("maxCount", pageinatine.getTotalRecords());
        //resultMap.put("maxCount", 100);
        return resultMap;
    }

    /**
     * 系统错误
     * 
     * @return
     */
    @RequestMapping(value = "/sys_exp", method = RequestMethod.GET)
    public String showSystemExp() {
        //Integer.parseInt("abc");
        throw new RuntimeException();
        // return "data_list";
    }

    /**
     * 业务错误
     * 
     * @return
     * @throws NullPointerException
     */
    @SuppressWarnings("null")
    @RequestMapping(value = "/biz_exp", method = RequestMethod.GET)
    public String showBizExp() throws NullPointerException {

        UserDO user = null;
        try {
            System.out.println(user.getUserId());
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
        return "data_list";
    }

    /**
     * 跳转到添加页面
     * 
     * @return
     */
    @RequestMapping(value = "/add_init", method = RequestMethod.GET)
    public String addInit() {
        return "/demo/add";
    }

    /**
     * 
     * @param user
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user, RedirectAttributes redirectAttributes) {
        userBiz.addUser(user);
        redirectAttributes.addFlashAttribute("success", "添加成功");
        return "redirect:/demo/index";
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String del(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        userBiz.delUserByPK(id);
        redirectAttributes.addFlashAttribute("success", "删除成功");
        return "redirect:/demo/index";
    }

    @RequestMapping(value = "/get_user/{id}", method = RequestMethod.GET)
    public String get(ModelMap model, @PathVariable("id") Integer id) {

        model.put("user", userBiz.getUserByPK(id));

        return "/demo/modify";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(ModelMap model, User user, RedirectAttributes redirectAttributes) {
        userBiz.modifyUser(user);
        redirectAttributes.addFlashAttribute("success", "修改成功");
        return "redirect:/demo/index";
    }

    /**
     * 显示Freemarker tag 使用
     * 
     * @return
     */
    @RequestMapping(value = "/view_f_tag", method = RequestMethod.GET)
    public String viewFreemarkerTag() {

        return "/demo/freemarker";
    }
    
    private static Logger LOG=LoggerFactory.getLogger(DemoController.class);
}
