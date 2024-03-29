package com.wcz0.asb.tools.aims;



/**
 * RowSelectionOptions
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class RowSelectionOptions extends BaseRenderer 
{
    public RowSelectionOptions()
    {
        set("type","row-select-options");
    }

    /**
     * 选择类型 选择全部
     */
    public RowSelectionOptions key(Object value)
    {
        return set("key", value);
    }

    /**
     * 选项显示文本
     */
    public RowSelectionOptions text(Object value)
    {
        return set("text", value);
    }

    public RowSelectionOptions set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
