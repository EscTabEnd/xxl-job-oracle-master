package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author xuxueli 2019-05-04 16:44:59
 *  editor by chenxh on 2021/11/1
 * TODO oracle支持调整 修改int为Integer,修改Date为Timestamp
 */
@Mapper
public interface XxlJobUserDao {

	public List<XxlJobUser> pageList(@Param("offset") Integer offset,
                                     @Param("pagesize") Integer pagesize,
                                     @Param("username") String username,
									 @Param("role") Integer role);
	public int pageListCount(@Param("offset") Integer offset,
							 @Param("pagesize") Integer pagesize,
							 @Param("username") String username,
							 @Param("role") int role);

	public XxlJobUser loadByUserName(@Param("username") String username);

	public int save(XxlJobUser xxlJobUser);

	public int update(XxlJobUser xxlJobUser);
	
	public int delete(@Param("id") Integer id);

}
