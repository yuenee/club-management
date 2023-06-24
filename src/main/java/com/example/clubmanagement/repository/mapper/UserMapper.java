package com.example.clubmanagement.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.clubmanagement.repository.entity.Users;

@Mapper
public interface UserMapper {

	@Insert("INSERT INTO users(user_name,user_kana_name,role)" + "VALUES(#{userName},#{userKanaName},#{role}Ïß")
	public int insertUsers(Users user);

	@Select("SELECT * FROM users")
	public List<Users> selectAllUsers();

	@Select("SELECT * FROM users WHERE user_id = #{userId}")
	public Users selectOneUsers(int userId);

	@Update("UPDATE users SET(user_name=#{userName},user_kana_name=#{userKanaNames} WHERE user_id = #{userId}")
	public int updateUsers(Users users);

	@Delete("DELETE FROM users WHERE user_id = #{userId}")
	public int deleteUsers(int userId);

}
