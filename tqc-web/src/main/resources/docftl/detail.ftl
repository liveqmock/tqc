<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>WEB/H5收银台接口文档</title>
<style type="text/css">
body{font-size: 12px}
h1{margin-top:15px; width:300px; margin-bottom:8px; font-size:20px; font-weight: bolder;}
h2{padding-left:20px; margin-top:15px; width:300px; margin-bottom:8px; font-size:18px; font-family:"黑体"}
h3{padding-left:20px; margin-top:8px; margin-bottom:5px; font-size:14px; font-weight: bolder;}
h4{padding-left:20px; margin-top:5px; margin-bottom:5px; font-size:12px; font-weight: bolder;}
p{padding-left:20px;}
table{table-layout: fixed; border-collapse: collapse; border-spacing: 0; width: 70%; margin-left:20px; margin-bottom:20px;border:1px solid #666;border-collapse:collapse;border-spacing:0;box-shadow:0 1px 3px rgba(0,0,0,0.1);}
table thead tr th{font-size:12px; font-weight:bolder; background-color:#ef7722; color:#ffffff; border-bottom: 1px solid darkgray;border-left: 1px solid darkgray;border-right: 1px solid darkgray;border-top: 1px solid darkgray;}
table tbody tr td{font-size:12px; height:20px; border: 1px solid #ccc;}
</style>
</head>

<body>
	<h1>${data.moduleName}</h1>
	<p>${data.moduleDesc}</p>
	
	<#if data.protocols?? >
	<#list data.protocols as item>
	
	<div style="border-top:2px solid red; width:100%;"/>
	<h2>${item.title}</h2>
	<h3>描述</h3>
	<p>${item.desc}</p>
	<h3>起始加入版本号</h3>
	<p>${item.version}</p>
	<h3>协议作者</h3>
	<p>${item.author}</p>
	<h3>协议</h3>
	<h4>URI</h4>
	<p>${item.uri}</p>
	<h4>请求</h4>
	<table id = "reqTable" class="inputtable wh">
	<thead>
	<tr>
	<th>名称</th>
	<th>类型</th>
	<th>含义</th>
	<th>是否必须</th>
	<th>备注</th>
	</tr>
	</thead>
	<tbody>
	<#if item.req?? >
	<#list item.req as req>
    <tr>
	<td>${req.name}</td>
	<td>${req.type}</td>
	<td>${req.desc}</td>
	<td>${req.required}</td>
	<td>${req.memo}</td>
	</tr>
	</#list>
	</#if>
	</tbody>
	</table>
	
	<h4>响应</h4>
	<table  id="resTable" class="inputtable wh">
	<thead>
	<tr>
	<th style="background-color: #225588">名称</th>
	<th style="background-color: #225588">类型</th>
	<th style="background-color: #225588">含义</th>
	<th style="background-color: #225588">是否必须</th>
	<th style="background-color: #225588">备注</th>
	</tr>
	</thead>
	<tbody>
	<#if item.res?? >
    <#list item.res as res>
    <tr>
	<td>${res.name}</td>
	<td>${res.type}</td>
	<td>${res.desc}</td>
	<td>${res.required}</td>
	<td>${res.memo}</td>
	</tr>
	</#list>
	</#if>
	</tbody>
	</table>
	
	</#list>
	</#if>
</body>
</html>