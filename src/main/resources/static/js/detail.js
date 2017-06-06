/**
 * Created by Administrator on 2017/5/17.
 */
//版本的点击
var version_id=0,color_id=0,userid=0;
function versonClick(version) {
    console.log("版本"+version);
    version_id = version;

};
//颜色的点击
function colorClick(color) {
    console.log("颜色"+color);
    color_id=color;
};
//提交
function submitOrder(commitId,userId) {

    console.log(userId);

    //发去fetch请求
    fetch("/submite?c_id="+commitId+"&colorId="+color_id+"&versionId="+version_id+"&userid="+userId).then(function(response){if (response.ok) {
        response.json().then(function(obj) {
            // 换成json格式
            if(obj.status == 1){
                alert("下单成功!");
            }else {
                alert(obj.msg);
            }
        })

    }})
};


