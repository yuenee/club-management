package com.example.clubmanagement.repository.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.clubmanagement.repository.entity.Clubs;
import com.example.clubmanagement.repository.entity.UserEntity;

@Mapper
public interface ClubMapper {

	@Insert("INSERT INTO clubs(club_name,request_date,request_name,request_member,club_concept,club_content)"
			+ "VALUES(#{club_name},#{request_date},#{request_name},#{request_member},#{club_concept},#{club_content}")
	public int insertClubs(Clubs clubs);

	@Select("SELECT * FROM users")
	public UserEntity selectAllClibs();

	@Select("SELECT * FROM users WHERE user_id = #{userId}")
	public UserEntity selectOneUsers(int userId);

	@Update("UPDATE clubs SET(club_name=#{club_name},request_date=#{request_date},request_name=#{request_name},request_member=#{request_member},club_concept=#{club_concept},club_content=#{club_content}) WHERE club_id=#{clubId}")
	public UserEntity updateUsers(int userId);

	@Delete("DELETE FROM clubs  WHERE club_id = #{clubId}")
	public UserEntity deleteUsers(int userId);
}
