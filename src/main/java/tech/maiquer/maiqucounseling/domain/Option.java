package tech.maiquer.maiqucounseling.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * <问题选项>
 *
 * @Author Lin
 * @createTime 2022/7/12 11:31
 */
@Data
@Alias("Option")
public class Option {

    private long questionId;

    private String optionNo;

    private String optionContent;

    private int optionWeight;

}
