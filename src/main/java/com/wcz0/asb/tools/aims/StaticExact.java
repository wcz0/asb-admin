package com.wcz0.asb.tools.aims;



/**
 * Static 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/static
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class StaticExact extends BaseRenderer {

    public StaticExact()
    {
        set("type", "static");
    }

    /**
     * 边框模式，默认是无边框的 可选值: full | half | none
     */
    public StaticExact borderMode(Object value)
    {
        return set("borderMode", value);
    }

    /**
     * 容器 css 类名
     */
    public StaticExact className(Object value)
    {
        return set("className", value);
    }

    /**
     * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
     */
    public StaticExact clearValueOnHidden(boolean value)
    {
        return set("clearValueOnHidden", value);
    }

    /**
     * 配置点击复制功能
     */
    public StaticExact copyable(boolean value)
    {
        return set("copyable", value);
    }

    public StaticExact desc(Object value)
    {
        return set("desc", value);
    }

    /**
     * 描述内容，支持 Html 片段。
     */
    public StaticExact description(Object value)
    {
        return set("description", value);
    }

    /**
     * 配置描述上的 className
     */
    public StaticExact descriptionClassName(Object value)
    {
        return set("descriptionClassName", value);
    }

    /**
     * 是否禁用
     */
    public StaticExact disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 是否禁用表达式
     */
    public StaticExact disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否隐藏
     */
    public StaticExact hidden(boolean value)
    {
        return set("hidden", value);
    }

    /**
     * 是否隐藏表达式
     */
    public StaticExact hiddenOn(Object value)
    {
        return set("hiddenOn", value);
    }

    /**
     * 输入提示，聚焦的时候显示
     */
    public StaticExact hint(Object value)
    {
        return set("hint", value);
    }

    /**
     * 当配置为水平布局的时候，用来配置具体的左右分配。
     */
    public StaticExact horizontal(Object value)
    {
        return set("horizontal", value);
    }

    /**
     * 组件唯一 id，主要用于日志采集
     */
    public StaticExact id(Object value)
    {
        return set("id", value);
    }

    /**
     * 表单 control 是否为 inline 模式。
     */
    public StaticExact inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 配置 input className
     */
    public StaticExact inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * 描述标题
     */
    public StaticExact label(Object value)
    {
        return set("label", value);
    }

    /**
     * 描述标题
     */
    public StaticExact labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * 配置 label className
     */
    public StaticExact labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
     */
    public StaticExact labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * label自定义宽度，默认单位为px
     */
    public StaticExact labelWidth(Object value)
    {
        return set("labelWidth", value);
    }

    /**
     * 配置当前表单项展示模式 可选值: normal | inline | horizontal
     */
    public StaticExact mode(Object value)
    {
        return set("mode", value);
    }

    /**
     * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
     */
    public StaticExact name(Object value)
    {
        return set("name", value);
    }

    /**
     * 事件动作配置
     */
    public StaticExact onEvent(Object value)
    {
        return set("onEvent", value);
    }

    /**
     * 占位符
     */
    public StaticExact placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 配置查看详情功能
     */
    public StaticExact popOver(Object value)
    {
        return set("popOver", value);
    }

    /**
     * 配置快速编辑功能
     */
    public StaticExact quickEdit(Object value)
    {
        return set("quickEdit", value);
    }

    /**
     * 是否只读
     */
    public StaticExact readOnly(boolean value)
    {
        return set("readOnly", value);
    }

    /**
     * 只读条件
     */
    public StaticExact readOnlyOn(Object value)
    {
        return set("readOnlyOn", value);
    }

    /**
     * 显示一个小图标, 鼠标放上去的时候显示提示内容
     */
    public StaticExact remark(Object value)
    {
        return set("remark", value);
    }

    /**
     * 是否为必填
     */
    public StaticExact required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 表单项大小 可选值: xs | sm | md | lg | full
     */
    public StaticExact size(Object value)
    {
        return set("size", value);
    }

    /**
     * 是否静态展示
     */
    public StaticExact staticAmis(boolean value)
    {
        return set("static", value);
    }

    /**
     * 静态展示表单项类名
     */
    public StaticExact staticClassName(Object value)
    {
        return set("staticClassName", value);
    }

    /**
     * 静态展示表单项Value类名
     */
    public StaticExact staticInputClassName(Object value)
    {
        return set("staticInputClassName", value);
    }

    /**
     * 静态展示表单项Label类名
     */
    public StaticExact staticLabelClassName(Object value)
    {
        return set("staticLabelClassName", value);
    }

    /**
     * 是否静态展示表达式
     */
    public StaticExact staticOn(Object value)
    {
        return set("staticOn", value);
    }

    /**
     * 静态展示空值占位
     */
    public StaticExact staticPlaceholder(Object value)
    {
        return set("staticPlaceholder", value);
    }

    public StaticExact staticSchema(Object value)
    {
        return set("staticSchema", value);
    }

    /**
     * 组件样式
     */
    public StaticExact style(Object value)
    {
        return set("style", value);
    }

    /**
     * 当修改完的时候是否提交表单。
     */
    public StaticExact submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 内容模板，不支持 HTML
     */
    public StaticExact text(Object value)
    {
        return set("text", value);
    }

    /**
     * 内容模板， 支持 HTML
     */
    public StaticExact tpl(Object value)
    {
        return set("tpl", value);
    }

    /**
     * 表单项类型
     */
    public StaticExact type(Object value)
    {
        return set("type", value);
    }

    /**
     * 远端校验表单项接口
     */
    public StaticExact validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
     */
    public StaticExact validateOnChange(boolean value)
    {
        return set("validateOnChange", value);
    }

    /**
     * 验证失败的提示信息
     */
    public StaticExact validationErrors(Object value)
    {
        return set("validationErrors", value);
    }

    public StaticExact validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
     */
    public StaticExact value(Object value)
    {
        return set("value", value);
    }

    /**
     * 是否显示
     */
    public StaticExact visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 是否显示表达式
     */
    public StaticExact visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    /**
     * 在Table中调整宽度
     */
    public StaticExact width(Object value)
    {
        return set("width", value);
    }


    public StaticExact set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
