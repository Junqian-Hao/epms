package cn.edu.nuc.epms.mapper;

import cn.edu.nuc.epms.entity.TrainrecordExample;
import cn.edu.nuc.epms.entity.TrainrecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainrecordMapper {
    int countByExample(TrainrecordExample example);

    int deleteByExample(TrainrecordExample example);

    int deleteByPrimaryKey(TrainrecordKey key);

    int insert(TrainrecordKey record);

    int insertSelective(TrainrecordKey record);

    List<TrainrecordKey> selectByExample(TrainrecordExample example);

    int updateByExampleSelective(@Param("record") TrainrecordKey record, @Param("example") TrainrecordExample example);

    int updateByExample(@Param("record") TrainrecordKey record, @Param("example") TrainrecordExample example);
}