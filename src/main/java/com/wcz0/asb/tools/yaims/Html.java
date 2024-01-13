package com.wcz0.asb.tools.yaims;

/**
 * <b>Html</b><br/>
 *
 * @link https://aisuda.bce.baidu.com/amis/zh-CN/components/html
 */
public class Html extends Tpl {

    public Html()
    {
        set("type", "html");
    }

    public Html set(String key, Object value)
    {
        super.set(key, value);
        return this;
    }

}