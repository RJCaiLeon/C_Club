package top.nanachan.auth.common.enums;

import lombok.Getter;

/**
 * @author leon_ccc
 * @date 2024/4/26 16:22
 */
@Getter
public enum AuthUserStatusEnum {

    OPEN(0, "启用"),
    CLOSE(1, "禁用");

    public int code;

    public String desc;

    AuthUserStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AuthUserStatusEnum getByCode(int codeVal) {
        for (AuthUserStatusEnum resultCodeEnum : AuthUserStatusEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }

}
