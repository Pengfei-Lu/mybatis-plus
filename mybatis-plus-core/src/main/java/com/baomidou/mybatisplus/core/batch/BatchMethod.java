package com.baomidou.mybatisplus.core.batch;

import org.apache.ibatis.mapping.MappedStatement;

/**
 * @author nieqiurong
 * @since 3.5.4
 */
public class BatchMethod<T> {

    /**
     * 执行的{@link MappedStatement#getId()}
     */
    private final String statementId;

    /**
     * 方法参数转换器,默认传递批量的entity的参数
     */
    private ParameterConvert<T> parameterConvert = (entity) -> entity;

    public BatchMethod(String statementId) {
        this.statementId = statementId;
    }

    public BatchMethod(String statementId, ParameterConvert<T> parameterConvert) {
        this.statementId = statementId;
        this.parameterConvert = parameterConvert;
    }

    public String getStatementId() {
        return statementId;
    }

    public ParameterConvert<T> getParameterConvert() {
        return parameterConvert;
    }

}
