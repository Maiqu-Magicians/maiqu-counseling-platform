package tech.maiquer.maiqucounseling.api;

import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.maiquer.maiqucounseling.service.DimensionalityService;

import javax.annotation.Resource;

/**
 * <测评维度接口>
 *
 * @Author Lin
 * @createTime 2022/7/12 13:59
 */
@RestController
@CrossOrigin
@RequestMapping("/api/dimensionality")
public class DimensionalityApi {

    @Resource
    private DimensionalityService dimensionalityService;

    @GetMapping("/getTreeData")
    public SaResult getTreeData() {
        return dimensionalityService.queryAllAsTree();
    }


}
