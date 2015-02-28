<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>WEB/H5收银台接口文档</title>
<style type="text/css">
body{font-size: 12px}
h1{margin-top:15px; width:300px; margin-bottom:8px; font-size:20px; font-weight: bolder;}
h2{padding-left:20px; margin-top:15px; width:300px; margin-bottom:8px; font-size:18px; font-weight: bolder;}
h3{padding-left:20px; margin-top:8px; margin-bottom:5px; font-size:16px; font-weight: bolder;}
h4{padding-left:20px; margin-top:5px; margin-bottom:5px; font-size:12px; font-weight: bolder;}
p{padding-left:20px;}
table{table-layout: fixed; border-collapse: collapse; border-spacing: 0; width: 70%; margin-left:20px; margin-bottom:20px;border:1px solid #666;border-collapse:collapse;border-spacing:0;box-shadow:0 1px 3px rgba(0,0,0,0.1);}
table thead tr th{font-size:12px; font-weight:bolder; background-color:#ef7722; color:#ffffff; border-bottom: 1px solid darkgray;border-left: 1px solid darkgray;border-right: 1px solid darkgray;border-top: 1px solid darkgray;}
table tbody tr td{font-size:12px; height:20px; border: 1px solid #ccc;}
</style>
</head>

<body>
	<h1>引言</h1>	
	<div style="border-top:2px solid red; width:100%;"/>
	<h2>文档编写目的</h2>
	<p>本文档主要描述手机端与服务端的通信协议的P2版本，由于在P1版本的里收银台的的概念被分散到各个零散的接口里，这样不方便客户端的调用也不利于服务端的代码重用。所以在本文档里将重新设计对于支付相关的协议。</p>
	<h3>起始加入版本号</h3>
	<p>2014年4月24日</p>
	<h3>术语</h3>
	<p>N/A</p>
	<h3>范围</h3>
	<p>N/A</p>
	<h3>编写说明</h3>
	<p>每个接口描述中需标明“起始加入版本号”<br/>
	如果需要在原接口中扩展字段，则在扩展字段的备注栏标明是在哪个版本中引入的</p>
	<h3>通讯方式</h3>
	<p>移动终端与后端服务器采用JSON格式的数据来交换数据（具体的协议格式见后续章节的介绍）。在本文中定义的通讯协议只定义应用层的客户端与服务器端交互的私有协议，它可能负载在其它的被广泛定义的协议上，比如HTTP或HTTPS协议也可能直接负载在TLS或TCP协议上。这可以视不同的应用场景和设备而定，本文档不给出规定。<br/>
	目前所有的通讯协议都是通过一个请求和响应完成的，并且所有请求都是由客户端（移动终端）发起，服务器被动应答。<br/>
	所以目前不存在服务器端“推”消息到客户端的动作，并且这样的“推”动作可能受运营商或底层通讯协议的限制。</p>
	<h3>编码方式</h3>
	<p>通讯数据的编码全部采用UTF8的编码方式</p>
</body>
</html>