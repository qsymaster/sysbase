$(function(){
	 $("#menu").metisMenu();
	 $("#nav-menu").slimScroll({height:"auto",color:"#656565",railOpacity:0.9,wheelStep:10,alwaysVisible: true});
	 $("#myTab").on("click",".fa-times-circle",function(event){
		 //关闭当前Tab
		 $(this.parentNode).remove();
		 var id = $(this.parentNode).attr("href").substring(1);
		 $("#"+id).remove();
		 if($(this.parentNode).hasClass("active")){
			 //打开首页 
			 $("#myTab a:first").trigger('click');
		 }
		 //移动tab
		 var rightVal = $("#myTab a:last").offset().left+70+$("#myTab a:last").width();
		 var leftVal = $("#myTab a:first").offset().left-$("#rollLeft").offset().left-40;
		 $("#showVal").html(rightVal+"-"+leftVal+"-"+($(document).width()-rightVal));
		 if($(document).width()-rightVal>=200 && leftVal<0){
			 if(leftVal+200>0){
				 $("#myTab").animate({marginLeft: '40'}, "fast");
			 }else{
				 $("#myTab").animate({marginLeft: '+=200'}, "fast");
			 }
		 }
		 event.stopPropagation(); //阻止事件冒泡
	 });
	 $("#myTab").on("mouseover",".fa-times-circle",function(event){
		 this.style.color="red";
	 });
	 $("#myTab").on("mouseout",".fa-times-circle",function(event){
		 this.style.color="";
	 });
	 
	 $("#myTab").on("click","a",function(event){
		 $("#myTab a").removeClass("active");
		 $(this).addClass("active");
	 });
	 
	 $("#menu>li>ul>li>a").click(function(){
		 createTab($(this).text(),$(this).attr("href"),$(this).attr("data_id"));
		 return false;
	 });
	 
	 //左移动
	 $("#rollLeft").click(function(){
		 var leftVal = $("#myTab a:first").offset().left-$("#rollLeft").offset().left-40;
		 if(leftVal<0){
			 if(leftVal+100>0){
				 $("#myTab").animate({marginLeft: '40'}, "fast",function(){$("#rollLeft").removeAttr("disabled");});
			 }else{
				 $("#myTab").animate({marginLeft: '+=100'}, "fast",function(){$("#rollLeft").removeAttr("disabled");});
			 }
			 $("#rollLeft").attr({"disabled":"disabled"});
		 }
	 });
	 
	 //右移动
	 $("#rollRight").click(function(){
		 var rightVal = $("#myTab a:last").offset().left+70+$("#myTab a:last").width();
		 if(rightVal>$(document).width()){
			 $("#myTab").animate({marginLeft: '-=100'}, "fast",function(){$("#rollRight").removeAttr("disabled");});
			 $("#rollRight").attr({"disabled":"disabled"});
		 }
	 });
	 
});

function displaynavbar(obj){
	if($(obj).hasClass("open")){
		$(obj).removeClass("open");
		$("body").removeClass("big-page");
	}else{
		$(obj).addClass("open");
		$("body").addClass("big-page");
	}
}

//创建tab
function createTab(tname,url,id){
	if($("#myTab a[href='#"+id+"']").size()>0){
		//存在打开的tab
		$("#myTab a[href='#"+id+"']").trigger('click');//激活
	}else{
		//不存在打开的tab
		var tab = "<a href='#"+id+"' data-toggle='tab'><span>"+tname+"</span><span class='fa fa-times-circle'></span></a>";
		var tabContent = "<iframe role='tabpanel' src='"+url+"' class='tab-pane' id='"+id+"'></iframe>";
		$("#myTab").append(tab);
		$("#tabContent").append(tabContent);
		$("#myTab a:last").trigger('click');//激活
	}
	
	
}
