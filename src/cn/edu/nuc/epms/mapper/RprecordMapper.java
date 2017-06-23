package cn.edu.nuc.epms.mapper;

import cn.edu.nuc.epms.entity.Rprecord;
import cn.edu.nuc.epms.entity.RprecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RprecordMapper {
    int countByExample(RprecordExample example);

    int deleteByExample(RprecordExample example);

    int deleteByPrimaryKey(Integer rpid);

    int insert(Rprecord record);

    int insertSelective(Rprecord record);

    List<Rprecord> selectByExample(RprecordExample example);

    Rprecord selectByPrimaryKey(Integer rpid);

    int updateByExampleSelective(@Param("record") Rprecord record, @Param("example") RprecordExample example);

    int updateByExample(@Param("record") Rprecord record, @Param("example") RprecordExample example);

    int updateByPrimaryKeySelective(Rprecord record);

    int updateByPrimaryKey(Rprecord record);
}