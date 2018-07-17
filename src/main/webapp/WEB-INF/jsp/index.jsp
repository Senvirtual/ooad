
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>

    <meta charset="UTF-8">

    <title>请登录</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" >

    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>



</head>

<body>

<div class="col-md-5"> </div>

<div class="col-md-2">

    <div style="padding-top: 300px">

        <div class="text-center">

            <label>教务系统登录</label>

        </div>

        <%--表单区域--%>
        <div>
            <form class="align-center" method="post" action="login">
                <div class="form-group">
                    <label class="control-lable">账    号：</label>
                    <input type="text" name="username" class="form-control" placeholder="输入账户名称" value="">
                </div>
                <div class="form-group">
                    <label class="control-lable">密    码：</label>
                    <input type="password" name="password" class="form-control" placeholder="输入账户密码" value="">
                </div>
                <div class="radio">
                    <label>
                        <input type="radio" name="type" id="optionsRadios1" value="student" checked>
                        学生登录
                    </label>
                </div>
                <div class="radio">
                    <label>
                        <input type="radio" name="type" id="optionsRadios2" value="teacher">
                        教师登陆
                    </label>
                </div>
                <div class="login_btn">
                    <input class="btn btn-default" type="submit" value="登陆">
                </div>
                <div>
                    <tr style="text-align: left;">
                        <td colspan="3">&nbsp;&nbsp;&nbsp;<input type="checkbox" checked="checked" name="rememberMe"
                                                                 id="chr1"><label for="chr1" class="cn-font-family" style=" font-size: 14px;">记住密码</label>
                        </td>
                    </tr>
                </div>
            </form>
        </div>

    </div>

</div>

<div class="col-md-5"> </div>

</body>

</html>