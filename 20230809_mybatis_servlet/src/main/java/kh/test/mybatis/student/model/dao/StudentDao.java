package kh.test.mybatis.student.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kh.test.mybatis.student.model.vo.StudentVo;

public class StudentDao {
	public List<StudentVo> selectList(SqlSession session){
		List<StudentVo> result = null;
		result= session.selectList("student1.selectList0");
		return result;
	}
	public StudentVo selectList(SqlSession session, String studentNo4){
		StudentVo result = session.selectOne("student1.selectOne0", studentNo4);
		return result;
	}
	public int insert(SqlSession session, StudentVo vo) {
		int result = session.insert("student1.insert0", vo);
		return result;
	}
	
}
