$(document).ready(function(){
    $("#signInButton").click(function(){
        $.ajax({
            type:"POST",
            url:"signIn.html",
            dataType:"json",
            data:{
                username:$("#username").val(),
                password:$("password").val(),
            },
            success:function(data){
                if(data.success){
                    window.open("../index/index.html");
                }
                else{
                    $("#usernameFeedback").html("用户名未注册");
                    $("#passwordFeedback").html("密码错误");
                }
            },
            error:function(jqXHR){
                alert("出错："+jqXHR.status);
            }
        })
    });
});