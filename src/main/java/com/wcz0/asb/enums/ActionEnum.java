package com.wcz0.asb.enums;

/**
 * @author wcz0
 */
public enum ActionEnum {
    /**
     * 操作.
     */
    ACTIONS("操作"),
    /**
     * 新增.
     */
    CREATE("新增"),
    /**
     * 编辑.
     */
    EDIT("编辑"),
    /**
     * 查看.
     */
    SHOW("查看"),
    /**
     * 删除.
     */
    DELETE("删除");

    private final String chinese;

    ActionEnum(String chinese) {
        this.chinese = chinese;
    }

    public String getChinese() {
        return chinese;
    }

    public static String get(String actionName) {
        for (ActionEnum action : ActionEnum.values()) {
            if (action.name().equalsIgnoreCase(actionName)) {
                return action.getChinese();
            }
        }
        return null;
    }
}
