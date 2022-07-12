package tech.maiquer.maiqucounseling.service.impl;

import cn.dev33.satoken.util.SaResult;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import tech.maiquer.maiqucounseling.domain.Dimensionality;
import tech.maiquer.maiqucounseling.mapper.DimensionalityMapper;
import tech.maiquer.maiqucounseling.service.DimensionalityService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <维度接口实现>
 *
 * @Author Lin
 * @createTime 2022/7/12 13:43
 */
@Service
public class DimensionalityServiceImpl implements DimensionalityService {

    @Resource
    private DimensionalityMapper dimensionalityMapper;

    private List<Map> operate(List<Map> list, Integer pid) {
        final List<Map> res = new ArrayList<>();
        list.forEach(e -> {
            if ((e.get("pid")).equals(pid)) {
                List<Map> children = operate(list, (Integer) e.get("id"));
                if (!children.isEmpty()) {
                    e.put("children", children);
                }
                res.add(e);
            }
        });
        return res;
    }

    @Override
    public SaResult queryAllAsTree() {
        List<Dimensionality> dimensionalityList = dimensionalityMapper.queryAll();
        List<Map> collect = dimensionalityList.stream().map(e -> JSON.parseObject(JSON.toJSONString(e), Map.class)).collect(Collectors.toList());
        List<Map> mapList = operate(collect, 0);
        return SaResult.data(mapList);
    }
}
