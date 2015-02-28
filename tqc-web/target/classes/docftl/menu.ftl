<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>无标题文档</title>
<style type="text/css">
a,a:visited {
	color: #333;
	text-decoration: none;
}

a:hover {
	color: #f60;
}

ul,li {
	margin: 0; width:300px;
	padding: 0;
	list-style: none;
}

.TreeWrap {
	width: 300px;
}

.MenuBox .titBox a,.MenuBox .titBox a:visited{
	margin-left: 10px; height: 24px; font-weight:bolder;
	color: #003;
	font-size: 13px;
	display: block;
}

.MenuBox .txtBox ul li {
	padding-left: 18px; font-size:12px;
	line-height: 22px; width:250px;
}

</style>
<script language="javascript">
	function change_view(obj_name) {
		var aa = document.getElementById(obj_name);
		if (aa.style.display == "") {
			aa.style.display = "none";
		} else {
			aa.style.display = "";
		}
	}
	function toggleProtocol(){
		
	}
</script>
</head>

<body>
	<h1 style="font-family:'黑体'; font-weight: bolder; font-size: 22px;">MTP项目接口文档</h1>
	<div class="TreeWrap">
		<#list menu as it>
		<div class="MenuBox" id="Menu_0">
			<div class="titBox">
				<a href="${it.url}" title="引言" target="classFrame">${it.name}</a>
			</div>
			<#if it.item?? >
			<#list it.item as subIt>
			
			<div class="txtBox">
				<ul>
					<li><a href="${subIt.url}" target="classFrame">${subIt.name}</a></li>
				</ul>
			</div>
			</#list>
			</#if>
		</div>
		</#list>
		
	</div>
</body>
</html>
