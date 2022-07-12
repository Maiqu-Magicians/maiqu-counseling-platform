package tech.maiquer.maiqucounseling.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * <测评问题>
 *
 * @Author Lin
 * @createTime 2022/7/12 11:31
 */
@Data
@Alias("Question")
public class Question {

    private long id;

    private String groupId;

    private String questionName;

    private QsType questionType;

    private Dimensionality dimensionality;

    private List<Option> options;

}
