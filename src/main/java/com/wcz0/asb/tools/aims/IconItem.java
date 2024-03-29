package com.wcz0.asb.tools.aims;



/**
 * IconItem
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class IconItem extends BaseRenderer 
{
    public IconItem()
    {
        set("type","icon-item");
    }

    public IconItem icon(Object value)
    {
        return set("icon", value);
    }

    public IconItem position(Object value)
    {
        return set("position", value);
    }

    public IconItem set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
