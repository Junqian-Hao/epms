package cn.edu.nuc.epms.mapper;

import cn.edu.nuc.epms.entity.Businesstrip;
import cn.edu.nuc.epms.entity.BusinesstripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinesstripMapper {
    int countByExample(BusinesstripExample example);

    int deleteByExample(BusinesstripExample example);

    int insert(Businesstrip record);

    int insertSelective(Businesstrip record);

    List<Businesstrip> selectByExample(BusinesstripExample example);

    int updateByExampleSelective(@Param("record") Businesstrip record, @Param("example") BusinesstripExample example);

    int updateByExample(@Param("record") Businesstrip record, @Param("example") BusinesstripExample example);
}