//wangEditor
var E = window.wangEditor;
var editor = new E('#editor');
// 自定义字体
editor.customConfig.fontNames = [
    '宋体',
    '微软雅黑',
    'Arial',
    'Tahoma',
    'Verdana'
];
editor.customConfig.pasteFilterStyle = false;   
//上传图片
// 配置服务器端地址，其中/upload是上传图片的服务器端接口
editor.customConfig.uploadImgServer = '/upload';
// 将图片大小限制为 3M
editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024;
// 限制一次最多上传 5 张图片
editor.customConfig.uploadImgMaxLength = 5;
editor.create(); 

$(document).ready(function(){
    $.ajax({
        url:"answerSheetStu.html", //请求的url地址
        dataType:"json", //返回格式为json
        async:true,//请求是否异步，默认为异步，这也是ajax重要特性
        data:{
            title:$("#title"),
            details:$("#details"),
            author:$("#author"),
            beginTime:$("#beginTime"),
            answerTime:$("#answerTime"),
            endTime:$("#endTime"),
        }, //参数值
        type:"GET", //请求方式
        success:function(data){
            //请求成功时处理
            if(data.success){
                $(data).find("#title").html("用户名未注册");
                $(data).find("#details").html("用户名未注册");
                $(data).find("#author").html("用户名未注册");
                $(data).find("#beginTime").html("用户名未注册");
                $(data).find("#answerTime").html("用户名未注册");
                $(data).find("#endTime").html("用户名未注册");
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
    $("#submitButton").click(function(){
        $.ajax({
            url:"answerSheetStu.html", //请求的url地址
            dataType:"json", //返回格式为json
            async:true,//请求是否异步，默认为异步，这也是ajax重要特性
            data:{
                html:editor.txt.html()
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
    });  
});
