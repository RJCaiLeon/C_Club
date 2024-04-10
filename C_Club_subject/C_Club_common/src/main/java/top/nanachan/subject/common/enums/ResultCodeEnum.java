package top.nanachan.subject.common.enums;

import lombok.Getter;
import top.nanachan.subject.common.entity.Result;

/**
 * @author leon_ccc
 * @date 2024/4/8 11:08
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败");

    private int code;

    private String desc;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeValue) {
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.code == codeValue) {
                return resultCodeEnum;
            }
        }
        return null;
    }

}
