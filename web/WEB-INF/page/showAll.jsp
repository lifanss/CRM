<%--
  Created by IntelliJ IDEA.
  User: insist
  Date: 2020/5/27
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
    <script src="js/vue.js"></script>
</head>
<body>
<%--    <table id="tb" border="1px" width="500px">--%>
<%--        <tr>--%>
<%--            <td>编号</td>--%>
<%--            <td>姓名</td>--%>
<%--            <td>年龄</td>--%>
<%--            <td>性别</td>--%>
<%--            <td>种类</td>--%>
<%--            <td>操作</td>--%>
<%--        </tr>--%>
<%--        <tr v-for="(cat,index) of cats ">--%>
<%--            <td>{{cat.id}}</td>--%>
<%--            <td>{{cat.name}}</td>--%>
<%--            <td>{{cat.age}}</td>--%>
<%--            <td>{{cat.sex}}</td>--%>
<%--            <td>{{cat.kind}}</td>--%>
<%--            <td>--%>
<%--                <a :href="">update</a>--%>
<%--                <a :href="">del</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--<a href="">add</a>--%>
<table id="tb" border="1px" width="500px">
    <tr><td>id</td><td>name</td><td>age</td><td>kind</td><td>sex</td><td>operation</td></tr>
    <tr v-for="(cat,index) of cats">
        <td>{{cat.id}}</td>
        <td>{{cat.name}}</td>
        <td>{{cat.age}}</td>
        <td>{{cat.kind}}</td>
        <td>{{cat.sex}}</td>
        <td>
            <%--         <input type="button" value="del" onclick="delCat(d.id,this)">    --%>
            <input type="button" value="del" @click="delCat(index,cat.id,$event)">
            <a :href="'querybyid?delid='+cat.id">update</a>
        </td>
    </tr>
</table>
<a href="add">add</a>
</body>
<script>
    var vueobj = new Vue({
        el:"#tb",
        data:{
            cats:[]
        },
        methods:{
            delCat:function (index,delid,currobj) {
                // var currobjTarget = currobj.currentTarget;
                $.ajax({
                    url:"delcat",
                    data:{"delid":delid},
                    success:function (result) {
                        if(result>0){
                            // $(currobjTarget).parents("tr").remove();方式一
                            // vueobj.cats.splice(index,1);方式二
                            vueobj.$delete(vueobj.cats,index);
                        }
                    }
                })
            }
        }
    });
    $.ajax({
        url:"queryAll",
        dataType:"json",
        success:function (result) {
            vueobj.cats=result;
        }
    })
</script>
</html>
