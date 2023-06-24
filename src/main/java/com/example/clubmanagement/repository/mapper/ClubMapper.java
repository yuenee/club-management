package com.example.clubmanagement.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.clubmanagement.repository.entity.Clubs;

@Mapper
public interface ClubMapper {

	@Insert("INSERT INTO clubs(club_name,request_date,request_name,request_member,club_concept,club_content)"
			+ "VALUES(#{clubName},#{requestDate},#{requestName},#{requestMember},#{clubConcept},#{clubContent}")
	public int insertClubs(Clubs clubs);

	@Select("SELECT * FROM clubs")
	public List<Clubs> selectAllClubs();

	@Select("SELECT * FROM clubs WHERE club_id = #{clubId}")
	public Clubs selectOneUsers(int userId);

	@Update("UPDATE clubs SET(club_name=#{clubName},request_date=#{requestDate},request_name=#{requestName},request_member=#{requestMember},club_concept=#{clubConcept},club_content=#{clubContent}) WHERE club_id=#{clubId}")
	public int updateUsers(Clubs clubs);

	@Delete("DELETE FROM clubs  WHERE club_id = #{clubId}")
	public int deleteUsers(int userId);
}
