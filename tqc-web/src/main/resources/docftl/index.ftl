<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>
WEB/H5收银台-接口文档
</TITLE>
<SCRIPT type="text/javascript">
    targetPage = "" + window.location.search;
    if (targetPage != "" && targetPage != "undefined")
        targetPage = targetPage.substring(1);
    if (targetPage.indexOf(":") != -1)
        targetPage = "undefined";
    function loadFrames() {
        if (targetPage != "" && targetPage != "undefined")
             top.classFrame.location = top.targetPage;
    }
</SCRIPT>
</HEAD>
<FRAMESET cols="25%,75%" title="" onLoad="top.loadFrames()">
<FRAME src="menu.htm" name="packageFrame" title="导航页">
<FRAME src="preface.htm" name="classFrame" title="软件包、类和接口描述" scrolling="yes">
<NOFRAMES>
<H2>
框架警报</H2>

<P>
请使用框架功能查看此文档。如果看到此消息，则表明您使用的是不支持框架的 Web 客户机。
<BR>
链接到<A HREF="preface.html">非框架版本。</A>
</NOFRAMES>
</FRAMESET>
</HTML>
