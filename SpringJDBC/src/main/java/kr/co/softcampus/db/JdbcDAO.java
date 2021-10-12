package kr.co.softcampus.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component
public class JdbcDAO {

	// JDBC 관리 객체를 주입 받는다.
	@Autowired
	private JdbcTemplate db;
	
	// 저장
	public void insert_data(JdbcBean bean) {
		String sql = "insert into jdbc_table (int_data, str_data) values (?, ?)";
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
}
