package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xuxueli on 16/9/30.
 * editor by chenxh on 2021/11/1
 *TODO oracle支持调整 修改int为Integer,修改Date为Timestamp
 */
@Mapper
public interface XxlJobGroupDao {

    public List<XxlJobGroup> findAll();

    public List<XxlJobGroup> findByAddressType(@Param("addressType") Integer addressType);

    public int save(XxlJobGroup xxlJobGroup);

    public int update(XxlJobGroup xxlJobGroup);

    public int remove(@Param("id") Integer id);

    public XxlJobGroup load(@Param("id") Integer id);

    public List<XxlJobGroup> pageList(@Param("offset") Integer offset,
                                      @Param("pagesize") Integer pagesize,
                                      @Param("appname") String appname,
                                      @Param("title") String title);

    public int pageListCount(@Param("offset") Integer offset,
                             @Param("pagesize") Integer pagesize,
                             @Param("appname") String appname,
                             @Param("title") String title);

}
