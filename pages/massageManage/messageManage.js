$(document).ready(function(){
    var userId;
    $(".Unaudited").click(function(){
        $("#messageLayer").css("display","block");
        $("#messageDetail").css("display","block");
        userId=$(this).find(".userId").text();
    });
    $("#submitButton").click(function(){
        if(confirm("是否确认提交？")){
            $("#messageLayer").css("display","none");
            $("#messageDetail").css("display","none");
            $.ajax({
                url:"messageManage.html", //请求的url地址
                dataType:"json", //返回格式为json
                async:true,//请求是否异步，默认为异步，这也是ajax重要特性
                data:{
                    userId:userId,
                    status:$('#status option:selected') .val(),
                    available:$('#available option:selected') .val(),
                }, //参数值
                type:"POST", //请求方式
                success:function(data){
                    //请求成功时处理
                    if(data.success){
                        alert("提交成功");
                    }
                    else{
                        alert("出现错误，请联系工作人员");
                    }
                },
                error:function(){
                    //请求出错处理
                    alert("出现错误，请联系工作人员");
                }
            });
        }
    });
    // $.ajax({
    //     url:"answerSheetStu.html", //请求的url地址
    //     dataType:"json", //返回格式为json
    //     async:true,//请求是否异步，默认为异步，这也是ajax重要特性
    //     data:{
    //         title:$("#title"),
    //         details:$("#details"),
    //         author:$("#author"),
    //         beginTime:$("#beginTime"),
    //         answerTime:$("#answerTime"),
    //         endTime:$("#endTime"),
    //     }, //参数值
    //     type:"GET", //请求方式
    //     success:function(data){
    //         //请求成功时处理
    //         if(data.success){
    //             $(data).find("#title").html("用户名未注册");
    //             $(data).find("#details").html("用户名未注册");
    //             $(data).find("#author").html("用户名未注册");
    //             $(data).find("#beginTime").html("用户名未注册");
    //             $(data).find("#answerTime").html("用户名未注册");
    //             $(data).find("#endTime").html("用户名未注册");
    //         }
    //         else{
    //             alert("出现错误，请联系工作人员");
    //         }
    //     },
    //     error:function(){
    //         //请求出错处理
    //         alert("出现错误，请联系工作人员");
    //     }
    // });  
});
