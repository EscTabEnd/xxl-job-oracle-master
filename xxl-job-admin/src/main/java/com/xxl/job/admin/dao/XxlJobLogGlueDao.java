package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobLogGlue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * job log for glue
 * @author xuxueli 2016-5-19 18:04:56
 *  editor by chenxh on 2021/11/1
 * TODO oracle支持调整 修改int为Integer,修改Date为Timestamp
 */
@Mapper
public interface XxlJobLogGlueDao {
	
	public int save(XxlJobLogGlue xxlJobLogGlue);
	
	public List<XxlJobLogGlue> findByJobId(@Param("jobId") Integer jobId);

	public int removeOld(@Param("jobId") Integer jobId, @Param("limit") Integer limit);

	public int deleteByJobId(@Param("jobId") Integer jobId);
	
}
