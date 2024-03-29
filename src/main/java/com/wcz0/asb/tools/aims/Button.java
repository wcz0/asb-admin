package com.wcz0.asb.tools.aims;



/**
 * <b>Button 按钮</b><br/>
 *
 * @link https://aisuda.bce.baidu.com/amis/zh-CN/components/button
 */
public class Button extends VanillaAction
{
    public Button()
    {
        set("type", "button");
    }
    @Override
    public Button set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
