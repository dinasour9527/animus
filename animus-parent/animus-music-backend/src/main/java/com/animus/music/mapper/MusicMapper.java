package com.animus.music.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.animus.music.model.Music;

@Mapper
public interface MusicMapper {
	
	@Select("select * from music where mid = #{mid}")
	Music findMusicByMid(@Param("mid")String mid);

}
