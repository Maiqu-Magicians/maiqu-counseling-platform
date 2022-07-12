package tech.maiquer.maiqucounseling.mapper;

import org.apache.ibatis.annotations.Mapper;
import tech.maiquer.maiqucounseling.domain.Dimensionality;

import java.util.List;

/**
 * <维度Mapper>
 *
 * @Author Lin
 * @createTime 2022/7/12 13:09
 */
@Mapper
public interface DimensionalityMapper {

    /**
     * query all the data of dimensionality
     * @return
     */
    List<Dimensionality> queryAll();


}
