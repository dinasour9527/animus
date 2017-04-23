$(function() {
	var audio = new Audio();
	audio.controls = true;  //这样控件才能显示出来
	audio.src = 'xxxxx';  //音乐的路径
	document.body.appendChild(audio);  //把它添加到页面中
	
	func1();
})