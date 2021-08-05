

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>博客|分类管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="../../../static/layui/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="../../../static/layui/style/admin.css" media="all">

</head>
<body>

  <div class="layui-form" lay-filter="layuiadmin-form-tags" id="layuiadmin-app-form-tags" style="padding-top: 30px; text-align: center;">
    <div class="layui-form-item">
      <label class="layui-form-label">分类名程</label>
      <div class="layui-input-inline">
        <input type="text" name="tags" lay-verify="required" placeholder="请输入..." autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">分类图标</label>
      <div class="layui-input-inline">
        <input name="avatar" lay-verify="required" id="LAY_avatarSrc" placeholder="图片地址" value="http://cdn.layui.com/avatar/168.jpg" class="layui-input">
      </div>
      <div class="layui-input-inline layui-btn-container" style="width: auto;">
        <button type="button" class="layui-btn layui-btn-primary" id="LAY_avatarUpload">
          <i class="layui-icon">&#xe67c;</i>上传图片
        </button>
        <button class="layui-btn layui-btn-primary" layadmin-event="avartatPreview">查看图片</button >
      </div>
    </div>
  </div>

  <script src="../../../static/layui/layui/layui.js"></script>
  <script>
  layui.config({
    base: '../../../static/layui/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'form','upload'], function(){
    var $ = layui.$ 
    ,form = layui.form
    ,upload = layui.upload;

    upload.render({
      elem: '#LAY_avatarUpload'
      ,url: "../upload/images"
      ,accept: 'images'
      ,method: 'post'
      ,acceptMime: 'image/*'
      ,done: function(res){
        $(this.item).prev("div").children("input").val(res.data.data)
      }
    });
  })
  </script>
</body>
</html>