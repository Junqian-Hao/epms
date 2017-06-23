package cn.edu.nuc.epms.mapper;

import cn.edu.nuc.epms.entity.Remove;
import cn.edu.nuc.epms.entity.RemoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoveMapper {
    int countByExample(RemoveExample example);

    int deleteByExample(RemoveExample example);

    int deleteByPrimaryKey(Integer removeid);

    int insert(Remove record);

    int insertSelective(Remove record);

    List<Remove> selectByExample(RemoveExample example);

    Remove selectByPrimaryKey(Integer removeid);

    int updateByExampleSelective(@Param("record") Remove record, @Param("example") RemoveExample example);

    int updateByExample(@Param("record") Remove record, @Param("example") RemoveExample example);

    int updateByPrimaryKeySelective(Remove record);

    int updateByPrimaryKey(Remove record);
}