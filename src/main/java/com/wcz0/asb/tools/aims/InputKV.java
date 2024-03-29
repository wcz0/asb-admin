package com.wcz0.asb.tools.aims;



/**
 * InputKV 键值对
 * 
 * @author cocoyam
 * @version v3.0.0
 * @since 2023-05-13
 */
public class InputKV extends BaseRenderer 
{
    public InputKV()
    {
        set("type", "input-kv");

    }

    /**
     * 数据录入配置，自动填充或者参照录入
     */
    public InputKV autoFill(Object value)
    {
        return set("autoFill", value);
    }

    /**
     * 表单最外层类名
     */
    public InputKV className(Object value)
    {
        return set("className", value);
    }

    /**
     * 默认值
     */
    public InputKV defaultValue(Object value)
    {
        return set("defaultValue", value);
    }

    /**
     * 表单项描述
     */
    public InputKV description(Object value)
    {
        return set("description", value);
    }

    /**
     * 是否禁用
     */
    public InputKV disabled(boolean value)
    {
        return set("disabled", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputKV disabledOn(Object value)
    {
        return set("disabledOn", value);
    }

    /**
     * 是否可以拖拽排序
     */
    public InputKV draggable(boolean value)
    {
        return set("draggable", value);
    }

    /**
     * 是否内联
     */
    public InputKV inline(boolean value)
    {
        return set("inline", value);
    }

    /**
     * 表单控制器类名
     */
    public InputKV inputClassName(Object value)
    {
        return set("inputClassName", value);
    }

    /**
     * key 的提示信息的
     */
    public InputKV keyPlaceholder(Object value)
    {
        return set("keyPlaceholder", value);
    }

    /**
     * 表单项标签
     */
    public InputKV label(Object value)
    {
        return set("label", value);
    }

    /**
     * 表单项标签对齐方式，默认右对齐，仅在 mode为horizontal 时生效
     */
    public InputKV labelAlign(Object value)
    {
        return set("labelAlign", value);
    }

    /**
     * label 的类名
     */
    public InputKV labelClassName(Object value)
    {
        return set("labelClassName", value);
    }

    /**
     * 表单项标签描述
     */
    public InputKV labelRemark(Object value)
    {
        return set("labelRemark", value);
    }

    /**
     * 字段名，指定该表单项提交时的 key
     */
    public InputKV name(Object value)
    {
        return set("name", value);
    }

    /**
     * 表单项描述
     */
    public InputKV placeholder(Object value)
    {
        return set("placeholder", value);
    }

    /**
     * 是否必填
     */
    public InputKV required(boolean value)
    {
        return set("required", value);
    }

    /**
     * 通过表达式来配置当前表单项是否为必填。
     */
    public InputKV requiredOn(Object value)
    {
        return set("requiredOn", value);
    }

    /**
     * 是否该表单项值发生变化时就提交当前表单。
     */
    public InputKV submitOnChange(boolean value)
    {
        return set("submitOnChange", value);
    }

    /**
     * 指定为 input-kv 渲染器。
     */
    public InputKV type(Object value)
    {
        return set("type", value);
    }

    /**
     * 表单校验接口
     */
    public InputKV validateApi(Object value)
    {
        return set("validateApi", value);
    }

    /**
     * 表单项值格式验证，支持设置多个，多个规则用英文逗号隔开。
     */
    public InputKV validations(Object value)
    {
        return set("validations", value);
    }

    /**
     * 表单默认值
     */
    public InputKV value(Object value)
    {
        return set("value", value);
    }

    /**
     * value 的提示信息的
     */
    public InputKV valuePlaceholder(Object value)
    {
        return set("valuePlaceholder", value);
    }

    /**
     * 值类型
     */
    public InputKV valueType(Object value)
    {
        return set("valueType", value);
    }

    /**
     * 是否可见
     */
    public InputKV visible(boolean value)
    {
        return set("visible", value);
    }

    /**
     * 当前表单项是否禁用的条件
     */
    public InputKV visibleOn(Object value)
    {
        return set("visibleOn", value);
    }

    public InputKV set(String key, Object value) 
    {
        super.set(key, value);
        return this;
    }

}
