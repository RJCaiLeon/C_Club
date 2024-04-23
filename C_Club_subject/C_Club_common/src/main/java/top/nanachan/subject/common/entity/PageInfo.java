package top.nanachan.subject.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求实体
 *
 * @author leon_ccc
 * @date 2024/4/14 11:42
 */
@Data
public class PageInfo implements Serializable {

    private Integer pageNo = 1;

    private Integer pageSize = 20;

    public Integer getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 20;
        }
        return pageSize;
    }


}

