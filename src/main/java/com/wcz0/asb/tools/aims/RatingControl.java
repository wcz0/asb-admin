package com.wcz0.asb.tools.aims;



/**
 * Rating 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/rating
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class RatingControl extends BaseRenderer 
{
    public RatingControl()
    {
        set("type", "input-rating");
    }

    /**
     * 是否允许再次点击后清除
     */
    public RatingControl allowClear(boolean value)
    {
        return set("allowClear", value);
    }

    /**
     * 自定义字符
     */
    public RatingControl charAmis(Object value)
    {
        return set("char", value);
    }

    /**
     * 自定义字符类名
     */
    public RatingControl charClassName(Object value)
    {
        return set("charClassName", value);
    }

    /**
     * 容器 css 类名
     */
    public RatingControl className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public RatingControl clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 星星被选中的颜色
     */
    public RatingControl colors(Object value)
    {
        return set("colors", value);
    }

    /**
     * 分数
     */
    public RatingControl count(Object value)
    {
        return set("count", value);
    }

    public RatingControl desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public RatingControl description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public RatingControl descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public RatingControl disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public RatingControl disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 允许半颗星
     */
    public RatingControl half(boolean value)
    {
        return set("half", value);
    }

    /**
     * 是否隐藏
     */
    public RatingControl hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public RatingControl hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public RatingControl hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public RatingControl horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public RatingControl id(Object value)
    {
        return set("id", value);
    }

    /**
     * 未被选中的星星的颜色
     */
    public RatingControl inactiveColor(Object value)
    {
        return set("inactiveColor", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public RatingControl inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public RatingControl inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public RatingControl label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public RatingControl labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public RatingControl labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public RatingControl labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public RatingControl labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public RatingControl mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public RatingControl name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public RatingControl onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public RatingControl placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否只读
     */
    public RatingControl readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public RatingControl readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public RatingControl remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public RatingControl required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public RatingControl size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public RatingControl staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public RatingControl staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public RatingControl staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public RatingControl staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public RatingControl staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public RatingControl staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public RatingControl staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public RatingControl style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public RatingControl submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 自定义文字类名
     */
    public RatingControl textClassName(Object value)
    {
        return set("textClassName", value);
    }

    /**
     * 文字的位置
     */
    public RatingControl textPosition(Object value)
    {
        return set("textPosition", value);
    }

    /**
     * 星星被选中时的提示文字
     */
    public RatingControl texts(Object value)
    {
        return set("texts", value);
    }

    /**
     * 表单项类型
     */
    public RatingControl type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public RatingControl validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public RatingControl validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public RatingControl validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public RatingControl validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public RatingControl value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public RatingControl visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public RatingControl visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public RatingControl width(Object value)
    {
        return set("width", value);
    }

    public RatingControl set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
