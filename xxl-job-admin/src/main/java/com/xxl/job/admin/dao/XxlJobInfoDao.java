package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * job info
 * @author xuxueli 2016-1-12 18:03:45
 * editor by chenxh on 2021/11/1
 *TODO oracle支持调整 修改int为Integer,修改Date为Timestamp
 */
@Mapper
public interface XxlJobInfoDao {

	public List<XxlJobInfo> pageList(@Param("offset") Integer offset,
									 @Param("pagesize") Integer pagesize,
									 @Param("jobGroup") Integer jobGroup,
									 @Param("triggerStatus") Integer triggerStatus,
									 @Param("jobDesc") String jobDesc,
									 @Param("executorHandler") String executorHandler,
									 @Param("author") String author);
	public int pageListCount(@Param("offset") Integer offset,
							 @Param("pagesize") Integer pagesize,
							 @Param("jobGroup") Integer jobGroup,
							 @Param("triggerStatus") Integer triggerStatus,
							 @Param("jobDesc") String jobDesc,
							 @Param("executorHandler") String executorHandler,
							 @Param("author") String author);
	
	public int save(XxlJobInfo info);

	public XxlJobInfo loadById(@Param("id") Integer id);
	
	public int update(XxlJobInfo xxlJobInfo);
	
	public int delete(@Param("id") long id);

	public List<XxlJobInfo> getJobsByGroup(@Param("jobGroup") Integer jobGroup);

	public int findAllCount();

	//TODO oracle支持调整 maxNextTime long转 Timestamp
	public List<XxlJobInfo> scheduleJobQuery(@Param("maxNextTime") BigDecimal maxNextTime, @Param("pagesize") Integer pagesize );

	public int scheduleUpdate(XxlJobInfo xxlJobInfo);


}
