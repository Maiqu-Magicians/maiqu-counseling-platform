package tech.maiquer.maiqucounseling.service;

import cn.dev33.satoken.util.SaResult;

/**
 * <维度接口>
 *
 * @Author Lin
 * @createTime 2022/7/12 13:43
 */
public interface DimensionalityService {

    /**
     * 以树状形式获取维度
     *
     * @return
     */
    SaResult queryAllAsTree();

}
