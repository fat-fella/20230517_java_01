package kh.test.mybatis.student.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kh.test.mybatis.common.MyBatisTemplate;
import kh.test.mybatis.student.model.dao.StudentDao;
import kh.test.mybatis.student.model.vo.StudentVo;

public class StudentService {
	private StudentDao dao; 
	
	public StudentService() {
		dao = new StudentDao(); 
	}
	public List<StudentVo> selectList(){
		List<StudentVo> result = null;
		SqlSession session = MyBatisTemplate.getSqlSession();
		
		
		
		session.close();
		return result;
	}
}
