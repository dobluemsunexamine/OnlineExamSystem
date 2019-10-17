$(document).ready(function(){
    var submitJudge;
    $("#username").keyup(function(){
        if(username.value.match(/^[a‐zA‐Z]\w{5,17}$/)!=null){
            $("#usernameFeedback").html("");
            $("#usernameFeedback").parent().css("box-shadow","0 0 3px 3px rgba(112, 157, 255)");
            submitJudge=1;
        }
        else{
            $("#usernameFeedback").html("用户名为6-18位，字母开头，只能包含字母、数字和下划线");
            $("#usernameFeedback").parent().css("box-shadow","0 0 3px 3px rgba(255, 124, 124)");
            submitJudge=0;
        }
    });
    $("#password").keyup(function(){
        if(password.value.match(/^[^@/\\%]{6,18}$/)!=null){
            $("#passwordFeedback").html("");
            $("#passwordFeedback").parent().css("box-shadow","0 0 3px 3px rgba(112, 157, 255)");
            submitJudge=1;
        }
        else{
            $("#passwordFeedback").html("密码为6-18位，不可包含@/\%四个符号");
            $("#passwordFeedback").parent().css("box-shadow","0 0 3px 3px rgba(255, 124, 124)");
            submitJudge=0;
        }
    });
    $("#passwordConfirm").keyup(function(){
        if(password.value==passwordConfirm.value&&password.value.match(/^[^@/\\%]{6,18}$/)!=null){
            $("#passwordConfirmFeedback").html("");
            $("#passwordConfirmFeedback").parent().css("box-shadow","0 0 3px 3px rgba(112, 157, 255)");
            submitJudge=1;
        }
        else{
            $("#passwordConfirmFeedback").html("两次密码填写须一致");
            $("#passwordConfirmFeedback").parent().css("box-shadow","0 0 3px 3px rgba(255, 124, 124)");
            submitJudge=0;
        }
    });
    $("#number").keyup(function(){
        if(number.value.match(/^\d{10}$/)!=null){
            $("#numberFeedback").html("");
            $("#numberFeedback").parent().css("box-shadow","0 0 3px 3px rgba(112, 157, 255)");
            submitJudge=1;
        }
        else{
            $("#numberFeedback").html("请正确填写学号");
            $("#numberFeedback").parent().css("box-shadow","0 0 3px 3px rgba(255, 124, 124)");
            submitJudge=0;
        }
    });
    $("#registerButton").click(function(){
        if(submitJudge==0){
            $("#registerButton").css({"opacity":"0.6","cursor":"not-allowed"});
        }
        else{
            $.ajax({
                type:"POST",
                url:"register.html",
                dataType:"json",
                data:{
                    username:$("#username").val(),
                    password:$("#password").val(),
                    number:$("#number").val(),
                },
                success:function(data){
                    if(data.success){
                        window.open("../indexStu/indexStu.html");
                    }
                    else{
                        $("#usernameFeedback").html("用户名不可用");
                        $("#passwordFeedback").html("密码不可用");
                        $("#numberFeedback").html("学号不可用");
                    }
                },
                error:function(jqXHR){
                    alert("出错："+jqXHR.status);
                }
            })
        }
    });
});