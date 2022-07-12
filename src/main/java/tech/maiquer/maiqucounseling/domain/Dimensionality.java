package tech.maiquer.maiqucounseling.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * <测评维度>
 *
 * @Author Lin
 * @createTime 2022/7/12 11:31
 */
@Data
@Alias("Dimensionality")
public class Dimensionality {

    private int id;

    private int pid;

    private String name;

}
