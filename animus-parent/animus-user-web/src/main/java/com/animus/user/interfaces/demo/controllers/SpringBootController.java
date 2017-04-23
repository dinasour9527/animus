package com.animus.user.interfaces.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.animus.music.mapper.MusicMapper;
import com.animus.music.model.Music;

@Controller
@RequestMapping("/demo")
public class SpringBootController {
	
	@Autowired
	MusicMapper musicMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getReq() {
		Music music = musicMapper.findMusicByMid("m1");
		System.out.println(music.getFileName());
		return "demo/index";
	}
	
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String getDemo1() {
		return "demo/demo1";
	}
}
