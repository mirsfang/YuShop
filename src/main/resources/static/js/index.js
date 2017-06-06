/**
 * Created by MirsFang on 2017/6/1.
 */
$(document).ready(function(){
    console.log("加载js");
    $.post("/getUserFSession",function (data) {
        data = eval(data);
        loginOrNo(data)
    })

    function loginOrNo(data) {
        console.log(data);
        console.log("进入方法");
        if(data.status == -1){
            console.log("未登录");
            $("#no_login").show();
            $("#login").hide();
        }else {
            console.log("登录");
            $("#no_login").hide();
            $("#login").show();
            $("#login").text(data.data.nickname);
        }
    }
});

