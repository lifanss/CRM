package controller;

import bean.Cats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CatService;

import java.util.List;

@Controller
public class CatController {
    @Autowired
    CatService catService;
    @RequestMapping("query")
    public String view(){
        return "showAll";
    }

    @ResponseBody
    @RequestMapping("queryAll")
    public List<Cats> query(){
        List<Cats> cats = catService.queryAll();
        return cats;
    }

    @ResponseBody
    @RequestMapping("delcat")
    public int delcat(int delid){
        System.out.println(delid);
        int context = catService.deleteCatById(delid);
        return context;
    }

    @RequestMapping("add")
    public String add(){
        return "add";
    }

    @RequestMapping("addCat")
    public String addCat(Cats cats){
       int count =  catService.insertCat(cats);
        return "showAll";
    }

    @RequestMapping("querybyid")
    public String queryById(int delid, ModelMap modelMap){
      Cats cat =   catService.queryOne(delid);
      modelMap.put("cat",cat);
      return "update";
    }

    @RequestMapping("update")
    public String update(Cats cats){
        int count  = catService.updaeCat(cats);
        return "showAll";
    }

}
